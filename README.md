# ACCESO A DATOS:

## Ficheros

### Persistencia de datos en ficheros:

Los ficheros son el método de almacenamiento más elemental. De hecho, en una última instancia, todos los métodos de almacenamiento almacenan los datos en ficheros.

Para acelerar las búsquedas en ficheros se usan ficheros auxiliares de índice permitiendo acceder a los registros según un orden determinado.

**Inconvenientes:**
- Limitada escalabilidad
- Dificultad para realizar consultas complejas
- Rendimiento bajo para volúmenes de datos alto u operaciones de borrado y modificación de datos frecuentes
- Dificil de establecer restricciones de integridad
- Necesidad de elgaborar complejos mecanismos de control de acceso para evitar inconsistencia en los datos

### Tipos de ficheros según su contenido

Un fichero es simplemente una secuencia de *bytes*, con lo que en principio se puede almacenar cualquier tipo de información.

Un fichero se identifica por su nombre y su ubicación dentro de una jerarquía de directorios.

Cabe destacar dos tipos de ficheros:
- **Ficheros de texto:** Contienen única y exclusibamente unca secuencia de caracteres, por lo que su contenido se puede modificar en cualquier editor de texto. Los caracteres pueden ser *visibles* (letras, números, signos de puntuación) o *invisibles* (espacioes, tabuladores, retornos de carro).
- **Ficheros binarios:** Son el resto de ficheros, pueden contener cualquier tipo de información. En general, hacen falta programas o visores especiales para mostrar la información que contienen.

### Codificaciones para textos

Un texto es una secuencia de caracteres. Como cualquier tipo de información, se almacena en memoria o en cualquier dispositivo de almacenamiento como una secuencia de *bytes*.

Una codificación es un método para representar cualquier texto cmo una secuencia de *bytes*.

El mismo texto, según la codificación, se puede almacenar como una secuencia de *bytes* distinta.

### Clase File en Java

Nos permite obtener información relativa a directorios y ficheros, y realizar diferentes operaciones con ellos (borrar, renombtrar, etc.).

#### Gestión de excepciones en Java

Cualquier programa en java debe realizar una adecuada gestión de Excepciones.

Una **Excepción** es un evento que ocurre durante la ejecución de un programa y que interrumpe su cueso normal de ejecución.

Cuando no se gestiona debidamente una excepción se aborta el programa. Para gestionar la excepción el uso de la estrucura *try{---}catch(---){---}*.

Las excepciones son objetos de java, pertenecientes a la clase **Exception**, o a una subclase de esta. A su vez la clase *Exception* tiene como clase padres *Throwable*.

Si el compulador es capaz de determinar que un método de una clase puede originar un tipo de excepción, pero no lo gestiona mediante un bloque *catch*, la compilación terminará con un error. Otra psibilidad es añadir el modificador *throws* seguido de la clase de excepción indicado que esa excepción se capturará en un método de una clase superior.

Es importante añadir la necesidad de liberar los recursos incluso en el caso de excepción, por ello el bloque try catch se complementa con un cbloque *finally{}*.

Los bloques ***try whith resources*** son de utilidad para simplificar la gestión de recursos de las clases que implementan un ade las interfaces Closeable o AutoCloseable.

### Acceso a los ficheros

Existen dos formas de acceder:

- **Acceso secuencial:** Se accede comenzando desde el principio del fichero. Para llegar a cualquier parte del fichero hay que pasar por todos los contenidos anteriores.
- **Acceso aleatorio:**: Se accede directamente al los datos situados en cualquier posición del fichero.

### Operaciones

El mecanismo de acceso a un fichero está basado en un puntero y en una zona de memoria que se llama *buffer*. El pountero siempre apunta a un lugar del fichero o bien a un aposición especial de fin de fichero, que a veces se denomina EOF, situada inmediatamente después del último byte del fichero.

Indempendientemente del tipo de fichero y de acceso, las operaciones básicas sobre ficheros son:

- **Apertura:** Antes de hacer nada con un fichero hay que abrirlo. Esto se hace para crear una instancia de una clase que se usará para operar con él.
- **Lectura:** Mediante el método *read()*. Consiste en leer contenidos de un fichero para volcarlos a memoria y poder trabajar con ellos. El puntero se sitúa justo después del último caracter leído.
- **Salto:** Mediante el método *skip()*. Consiste en hacer avanzar el puntero un número determinado de bytes o caracteres hacia delante.
- **Escritura:** Mediante el método *write()*. Consiste en escribir contenidos de memoria en un lugar determinado del fichero. El puntero se sitúa justo depués del último caracter escrito.
- **Cierre:** Mediante el métoso *close()*. Para terminar hay que cerrar el fichero.

#### Operaciones de lectura y escritura

- **Lectura:** Cuando se lee desde el fichero, hay que indicar el buffer, quecibirá los datos que se lean desde él. Si no se indica el número de bytes o de caracteres se leerá hasta llenar el buffer. Si el funtero apunta al EOF, no se leerá nada.
- **Escritura:** Cuando se escribe en el fichero, hay que indicar el buffer y el nímero de bytes, para leer. Desde el buffer se tranferirá los datos a la posición a la que apunte el puntero. Si el puntero apunta al EOF, se añaden los datos al final del fichero. Las operaciones de escritura con ficheros tienen muchas limitaciones:
  - No es posible insertar o eliminar bloques de bytes o de caracteres en mitad de un fichero.
  - No es posible reemplazar un bloque de un fichero por otro a no ser que tenga el mismo tamaño en bytes.
  
  Para estas operaciones es necesario el uso de ficheros temporales auchiliares.

### Acceso secuencial

Las operaciones secuenciales en Java se realizan usando flujos (*streams*) mediante las clases del paquete **java.io**. Un flujo es una abstracción de alto nivel para cualquier secuencia de datos. Los ficheros secuenciales son flijos, lo mismo que los datos enviados a través de una conexión de red.

Este paquete saca partido de la herencia, y proporciona clases con funcionalidad genérica de entrada y salida, común para cualquier tipo de flujo, y clases con funcionalidad específica para los distintos tipos de flujos.

Existe una jerarquía de clases derivada de cuatro clases, correspondiente alas cuatro combinaciones posibles, considerando, por una parte, los flujos biarios y de texto y, por otra, flujos de entrada/salida.

#### Flujo de datos

Para leer o escibir en un fichero hay que crear un flujo (*stream*) asociado al mismo.

Los flujos binarios son simples:
- Leen bytes de un stream binario hacia una variable de tipo byte[].
- Escriben bytes de una variable de tipo byte[] a un stream binario.

Los flujos de texto, sin embargo, son más complejos dada la codificación de los caracteres. La codificación de caracteres que toma por defecto Java la coge de la configuración por defecto de la máquina virtual, o en su defecto de la configuración del SO o bien asume UTF-8. Sin embargo, para almacenar texto en memoria, Java usa UTF-16, por lo tanto, las lecturas y escrituras de texto suelen llevar implícitas una recodificación de caracteres.

#### Clases para *buffering*

El *buffering* es una técnica que permite acelerar las operaciones de lectura o escritura, usando una zona de intercambio en memoria llamada buffer.

Existen clases que proporcionan buffering, permitiendo leer y escribir textos en ficheros.

Cuando se lee un fichero con buffer, la lectura no se limita a la posición solicitada, sino que se traen datos suficientes para llenar el buffer, si la siguiente lectura es en posiciones consecutivas, no hará falta un nuevo acceso al fichero, porque los datos ya se encontrarán en el buffer. De forma análoga ocurre cuando la operacións es de escritura.

### Acceso aleatorio

Para el acceso aleatorio a ficheros se usa la clase RandomAccessFile.

En todo momento el cursor se puede situar en cualquier posición mediante la función *seek()*.

Sobre el fichero se pueden realizar operaciones tanto de lectura como de escritura.

#### RandomAccessFile

**Constructores:**
- RandomAccessFile(String path, String modo)
- RandomAccessFile(File objetoFile, String modo)

El argumento *modo* indica el modo de acceso en el que se abre el fichero. Los valores permitidos son:
- *"r":* Abre el fichero en modo lectura. El fichero debe existir. Una operación de escritura en este fichero lanzará una *"IOException"*.
```java
RandomAccessFile fichero = new RandomAccessFile("/ficheros/clientes.dat", "r")
```
- *"rw":* Abre el fichero en modo lectura y escritura. Si el fichero no existe lo crea.
```java
RandomAccessFile fichero = new RandomAccessFile("/ficheros/clientes.dat", "r")
```

Para acceder de forma aleatoria a los datos contenidos en el ffichero, la clase RandomAccessFile dispone de varios métodos:
- long **getFilePointer():** Devuelve la posición actual del puntero del fichero. Indica la posición (bytes) donde se va a escribir.
- long **length():** Devuelve la longitud del fichero.
- void **seek(long pos):** Coloca el puntero ddel fichero en una posición pos determinada. La posición se da como un despazamient en bytes desde el comienzo del fichero. La posición 0 indica el principio del fichero. La posición length() indica el final del fichero.

Además, dispone de métodos de lectura/escritura:
- public int **read():** Devuelve el byte leído en la posición marada por el puntero