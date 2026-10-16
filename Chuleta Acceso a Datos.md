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
	while((linea = lector.readLine)!=null){
		System.out.println(linea);
	}
}catch(IOException e){
	System.err.println(e.getMessage);
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
    Marshaller marshaller = context.createMarshaller()
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshall(objeto, archivoXml);
}catch(Exception e){
	System.out.println(e.getMessage);
}
```