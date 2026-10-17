# Chuleta Acceso a Datos

## Estructura de un proyecto (Ficheros y BBDD)

```bash
.
├── pom.xml -> configuración del proyecto maven
├── src
│   └── main
│       ├── java.org.educa
│       │   ├── dao -> como se interactua con los ficheros (una implementación por clase)
│       │   ├── entity -> clases necesarias para la ejecución del programa (no autogeneradas)
│       │   ├── Main.java
│       │   ├── pool -> conexiones con la base de datos
│       │   └── service -> operaciones lógicas/negocio del programa. Llaman a un dao por fichero. Uno por cada tipo de objeto a tratar
│       └── resources
│           └── database.properties -> configuración de la conexión a la base de datos (usuario, contraseña, ruta...)
│           └── xml -> ficheros xml
│           └── xsd -> ficheros xsd
└── target -> se almacenan los ficheros compilados

```

## Trabajar con ficheros

```java
// Nuevo objeto tipo fichero
File f = new File("String path");
// Comprobar si existe
f.exists() // true si es fichero o directorio
// Comprobar si es fichero o directorio
f.isFile() // true si fichero
f.isDirectory() // true si directorio
// Comprobar si está oculto
f.isHidden() // true si está oculto
// Información del fichero
f.getName() // Nombre del fichero
f.getPath() // Ruta con la que se creó el objeto
f.getAbsolutePath() // Ruta absoluta del fichero o directorio
f.getParent() // nombre o ruta del directorio padre
f.length() //tamaño del archivo en bytes
f.lastmodified() // fecha de última modificación
// Comprobar permisos
f.canRead() // true si se puede leer
f.canWrite() // true si se puede escribir
f.canExecute() // true si se puede ejecutar
// Contenido de un directorio
f.list() // String[] con los nombres de los archivos y directorios
f.listFiles() // File[] con las referencias de cada fichero
```

### Ficheros de texto (trabajar en DAO)

```java
// Leer fichero de texto
try(BufferedReader lector = new BufferedReader(new FileReader(String path))){
	String linea;
	while((linea = lector.readLine())!=null){
		System.out.println(linea);
	}
}catch(IOException e){
	System.err.println(e.getMessage());
}

// Escribir fichero de texto
try(BufferedWriter escritor = new BufferedWriter(new FileWriter(String path, true))){ // true para no sobreescribir
	escritor.write(String contenido);
	escritor.newLine();
}catch(IOException e){
	System.err.println(e.getMessage);
}
```

### Ficheros XML (trabajar en DAO)

```java
// Leer (unmarshalling)
try{
    File archivoXml = new File(String path);
    JAXBContext context = JAXBContext.newInstance(clase.class); // obtener elemento raiz del xml mediante la clase autogenerada con el xsd
    Unmarshaller unmarshaller = context.createUnmarshaller();
	Clase objeto = (Clase) unmarshaller.unmarshal(archivoXml);
}catch(Exception e){
	System.out.println(e.getMessage);
}

// Escribir (marshalling)
try{
    JAXBContext context = JAXBContext.newInstance(clase.class);
    Clase objeto = new Clase(propiedad1, propiedad2);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshall(objeto, archivoXml);
}catch(Exception e){
	System.out.println(e.getMessage);
}
```

## Trabajar con BBDD
```java
// Crear conexión con base de datos -> pool de conexiones
try(
	Connection connection =
	ConnectionPool.getDataSource().getConnection()
){
	// codigo a ejecutar
}catch(SQLException e){
	System.err.println(e.getMessage());
}
// Crear un preparedStatement
try(
	PreparedStatement ps = connection.prepareStatement(sql)
){ // normalmente se crea en el mismo try que la conexión
	// codigo a ejecutar
}catch(SQLException e){
	System.out.println(e.getMessage);
}

// Ejecutar un preparedStatement
// Consulta dinámica/desconocida
ps.execute(); // -> retorna true si el resultado es un resultSet y false si no es un conjunto de datos (INSERT, UPDATE, DELETE o DDL) usar getUpdateCount() para saber cuántas filas se modificaron
// Modificar, borrar datos o alterar la estructura de base de datos 
ps.executeUpdate(); // -> retorna el número de filas afectadas
// Almacenar una query (select)
ResultSet rs = ps.executeQuery();

// Recorrer un ResultSet
while(rs.next){
	rs.getType() // -> obtener un dato (cambiar type por tipo de dato)
}

// Crear marcadores de posición (?)
PreparedStatement ps = connection.prepareStatement("INSERT INTO TABLA (CAMPO1, CAMPO2, CAMPO3) VALUES (?, ?, ?)");
// Asignar valores a marcadores de posición
ps.setType(int pos, type valor); // -> cambiar pos por la posición a sustituir (1-n), cambiar type por tipo de dato a introducir

// Transacciones (COMMIT)
connection.setAutoCommit(false) // -> cancelar el autoCommit
connection.commit(); // -> confirmar los cambios

// Ejecutar un rollback
try{
	connection.rollback();
}catch(SQLException er){
	System.err.println(er);
}
```