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

<<<<<<< HEAD
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
=======


## Ficheros

### Persistencia de datos en ficheros

Los ficheros son el método de almacenamiento más elemental. De hecho, en última instancia todos los métodos de almacenamiento alnmacenan en ficheros.

Para almacenar las búsquedas en ficheros se usan ficheros auxiliares de índice, permitiendo acceder a los registros según un orden determinado.

**Inconvenientes:**
- Limitada escalabilidad.
- Dificultad àra realizar consultas complejas.
- Rendimiento bajo para volúmenes de datos altos u operaciones de borrado y modificación de datos frecuentes.
- Difícil estaablecer restricciones de integridad.
- Necesidad de elaborar complejos mecanismos de control de acceso para evitar inconsistencia en los datos.

### Tipo de fichero según su contenido

Un tipo de fichero es simplemente una secuencia de *bytes*, con lo que en principio puede almacenar cualquier tipo de infoemación.

Un fichero se identifica por su nombre y su ubicación dentro de una jerarquía de directorios.

**Dos tipos principales:**
- *Ficheros de texto*: Contienen única y exclusivamente una secuencia de caracteres. Pos tanto, su contenido se puede modificar en cualquier editor de texto. Los caracteres pueden ser:
  - Visibles (letras, números, etc.)
  - Invisibles (espacios, tabulaciones, saltos de línea, etc.)
- *Ficheros binarios*: Son el resto de ficheros. Pueden contener cualquier tipo de información. En general, hacen falta programas o visores especiales para mostrar la información que contienen. Los programas también se almacenan en ficheros binarios.

### Codificaciones para texto

Aunque se ha añadido en esta unidad, la codificación es relevante para cualquier tipo de almacenamiento de datos. Allá donde se almacena texto, debe hacerse con una codificación determinada.

Un texto es una secuencia de caracteres. Un texto como cualquier tipo de información se almacena en memoria, o en cualquier dispositivo de almacenamiento como una secuencia de *bytes*.

Una codificación es un método para representar cualquier texto como una secuencia de bytes.

El mismo texto, según la codificación elegida, puede almacenar una secuencia de bytes distinta.

La codificación más extendida es *UTF-8*, compatible con ASCII, pero todavñia es relativamente frecuente encontrar textos con otras codificaciones, como ISO 8859-1 y Windows-1252.

### Clase File en Java

Permite obtener información relativa a directorios y ficheros y realizar diferentes operaciones con ellos (renombrar, borrar, crear...).

### Gestión de excepciones en Java

cualquier programa en Java debe realizar una adecuada gestión de excepciones.

Una excepción es un evento que ocurre cuando la ejecuciónn de un programa y que interrumpe su curso normal de ejecución.

Cuando no se gestiona debidamente una excepción se aborta le ejecución del programa. Para poder gestionar las excepciones es necesario un bloque **try {} catch () {}**. 

Las excepciones son objetos en Java, pertenecientes a la clase **Exception**, o a una subclase de esta. A su vez la clase *Exception* tiene como clase padre *Thowable*.

En un bloque _try {} catch () {}_ se pueden gestionar por separado distintos tipos de excepciones, siendo conveniente incluir un manejador para clase *Exception* al final para que ninguna excepción se quede sin gestionar.

Si el compilador es capaz de determinar que un método de una clase puede originar un tipo de excepción, pero no lo gestiona mediante un bloque _catch_, la compilación terminará con un error. Otra posibilidad es añadir el modificador _throws_ seguido de la clase de excepción indicando que esa excepción se capturará en un método de una clase superior. 

Es importante añadir la necesidad de liberar los recursos incluso en el caso de excepción, por ello el bloque _try {} catch () {}_ se complementa con un bloque _finally {}_

Los bloques _**try with resources**_, son de utilidad para simplificar la gestión de recursos de clases que implementan una de las interfaces _Closeable_ o _AutoCloseable_.

### Acceso a los ficheros

Existen dos formas de acceder a los ficheros:

- **Acceso secuencial**: Se accede comenzando desde el principio del fichero. Para llegar a cualquier parte del fichero, hay que pasar antes por todos los contenidos anteriores.
- **Acceso aleatorio**: Se accede directamente a los datos situados en cualquier posición del fichero.

Ambas formas de acceso se pueden usar tanto para operaciones de lectura como de escritura.

### Operaciones

El mecanismo de acceso a un fichero está basado en un puntero y en una zona de memoria que se llama _buffer_. El puntero siempre apunta a un lugar del fichero o bien a una posición especial de fin de fichero, que a veces se denomina _EOF_, situada inmediatamente después del último byte del fichero.

Independientemente del tipo de fichero (texto o binario) y del tipo de acceso (secuencial o aleatorio), las operaciones básicas sobre ficheros son siempre las mismas:

- **Apertura**: Antes de hacer nada con un fichero hay que abrirlo. Esto se hace al crear una instancia de una clase que se usará para operar con él.
- **Lectura**: Mediante el método _read()_. Consiste en leer contenidos del fichero para volcarlos a memoria y poder trabajar con ellos. El puntero se sitúa justo después del último carácter leído.
  - Cuando se lee desde el fichero, hay que indicar el buffer, que recibirá los datos que se lean desde él. Si no se indica, el número de bytes o de caracteres se leerá hasta llenar el buffer. Si el puntero apunta al _EOF_ , no se leerá nada.
- **Salto**: Mediante el método _skip()_. Consiste en hacer avanzar el puntero un número determinado de bytes o caracteres hacia delante.
- **Escritura**: Mediante el método _write()_. Consiste en escribir contenidos de memoria en un lugar determinado del fichero. El puntero se sitúa justo después del último carácter escrito.
  - Cuando se escribe en el fichero, hay que indicar el buffer y el número de bytes, para leer. Desde el buffer se transferirá los datos a la posición a la que apunte el puntero. Si el puntero apunta a _EOF_, se añaden los datos al final del fichero. 
  - Las operaciones de escritura con ficheros tienen muchas limitaciones:
    - No es posible insertar o eliminar bloques de bytes o de caracteres en mitad de un fichero.
    - No es posible reemplazar un bloque de un fichero por otro a no ser que tengan el mismo tamaño en bytes.
- **Cierre**: Mediante el método _close()_. Para terminar, hay que cerrar el fichero.

### Acceso secuencial

Las operaciones secuenciales en Java se realizan usando flujos (_streams_) mediante las clases del paquete **java.io**. Un flujo es una abstracción de alto nivel para cualquier secuencia de datos. Los ficheros secuenciales son flujo, lo mismo que los datos enviados a través de una conexión web.

Este paquete saca partido de la herencia, y proporciona clases con funcionalidad genérica de entrada y salida, común para cualquier tipo de flujo, y clases con funcionalidad específica para los distintos tipos de flujos.

Existe una jerarquía de clases derivada de cuatro clases, correspondientes a las cuatro combinaciones posibles, considerando, por una parte, flujos binarios y de texto y, por otra, flujos de entrada y de salida.

#### Flujo de datos

Para leer o escribir en un fichero hay que crear un flujo (_stream_) asociado al mismo.

Los flujos binarios son simples:

- Leen bytes de un stream binario hacia una variable de tipo byte[].
- Escriben bytes de una variable de tipo byte[] a un stream binario.

Los flujos de texto son más complejos dada la codificación de caracteres. La codificación de caracteres que toma por defecto Java la coge de la configuración por defecto de la máquina virtual, o en su defecto de la configuración del SO o asume UTF-8. Sin embargo, para almacenar texto en memoria, Java usa UTF-16, por tanto, las lecturas y escrituras de texto suelen llevar implícitas una recodificación de caracteres.

#### Paquete java.io

- El nombre indica:
  - Primero el tipo de fuente (File para ficheros, BytrArray para memoria, Piped para tubería).
  - Después si es de entrada (Input o Reader) o de salida (Output o Writer).
  - Si acaba con Stream es para flujo de bytes, y si ni para flujo de texto.

#### Recodificación

Las clases de InputStreamReader y OutputStreamWriter sirven de enlace entre ambas jerarquías dado que convierten flujos binarios en flujos de textos y viceversa.

Es necesario especificar una codificación a su constructor.

Se pueden entender como clases que permiten recodificar texto, es decir, leer o escribir texto en ficheros con una codificación diferente a la codificación por defecto.

#### Clases para buffering

El buffering es una técnica que permite acelerar las operaciones de lectura o escritura, usando una zona de intercambio en memoria llamada buffer.

Existen clases que proporcionan buffering, permitiendo leer y escribir texto en ficheros.

En general, el uso de buffering aumenta el rendimiento para ficheros grandes y cuando se realizan lecturas y escrituras consecutivas (lo más habitual).

Cuando se lee de un fichero usando buffer, la lectura no se limita a la posición solicitada, sino que se traen datos suficientes para llenar el buffer, si la siguiente lectura es en posiciones consecutivas no hará falta un nuevo acceso al fichero porque los datos ya se encontraban en el buffer. De forma análoga ocurre cuando la operación es de escritura.
>>>>>>> e5f820b (apuntes tema 1)

### Acceso aleatorio

Para el acceso aleatorio a ficheros se usa la clase RandomAccessFile.

<<<<<<< HEAD
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
=======
- En todo momento el cursor se puede situar en cualquier posición mediante la función seek().
- Sobre el fichero se pueden realizar operaciones tanto de lectura como de salida.

#### RandomAccessFile

Los constructores de la clase son:

- RandomAccessFile(String path, String modo);
- RandomAccessFile(File objetoFile, String modo);

El argumento modo indica el modo de acceso en el que se abre el fichero. Los valores permitidos son:

- _r_: Abre el fichero en modo lectura. El fichero debe existir. Una operación de escritura en este fichero lanzará una IOException.
- _rw_: Abre el fichero en modo lectura y escritura. Si el fichero no existe lo crea.

Para acceder de forma aleatoria a los datos contenidos en el fichero, la clase RandomAccessFile dispone de varios métodos. Entre ellos:

- long **getFilePointer()**: Devuelve la posición actual del puntero del fichero. Indica la posición donde va a leer o escribir en bytes.
- long **length()**: Devuelve la longitud del fichero en bytes.
- void **seek(long pos)**: Coloca el puntero del fichero en una posición determinada. La posición se da como un desplazamiento en bytes desde el comienzo del fichero. La posición 0 indica el principio del fichero. La posición length() indica el final del fichero.

Además dispone de métodos de lectura/escritura:

- public int **read**(): Devuelve el byte leído en la posición marcada por el puntero. Devuelve -1 si alcanza el final del fichero. Se debe utilizar este método para leer los caracteres de un fichero de texto.
- public final String **readLine**(): Devuelve la cadena de caracteres que se lee, desde la posición marcada por el puntero, hasta el siguiente salto de línea que se encuentre.
- public xxx **readXxx**(): Hay un método read para cada tipo de dato básico.
- public void **write**(int b): escribe en el fichero el byte indicado por parámetro. Se debe utilizar este método para escribir caracteres en un fichero de texto.
- public final void **writeBytes**(String s): Escribe en el fichero la cadena de caracteres indicada por parámetro.
- public final void **writeXxx**(argumento): también existe un método para cada tipo de dato básico.

### Organización

#### Organización de ficheros

U a organización de ficheros es una manera de organizar y estructurar los datos dentro de los ficheros.

Hay muchas formas de organizar ficheros (de longitud fija, campos que identifican registros...), veremos:

- Secuencial
- Secuencial indexada

#### Organización secuencial

Los registros que forman el fichero, se almacenan uno tras otro y no están ordenados de ninguna manera.

No hay mecanismos para localizar directamente un registro dado o para agilizar búsquedas. La única manera es leer los registros uno a uno hasta encontrar lo que se busca o llegar al EOF.

**Ventajas:**

- Sencillez.
- Inserción rápida. Bastaría con añadir el nuevo registro al final. A no ser que el fichero tuviera orden.

**Inconvenientes:**

- Búsquedas ineficientes.
- Borrado de un registro ineficiente. Obliga a correr hacia atrás todos los registros siguientes.

#### Organización secuencial indexada

Se crea un fichero de índices, que no es más que un fichero secuencial ordenado, cuyo registros contienen dos campos, uno para un valor del campo para el que se crea el índice y otro que indica la posición en el fichero secuencial.

Se pueden crear todos los índices que se quieran, y además se pueden crear índices compuestos por más de un campo.

Usando esta organización no es necesario reorganizar el fichero secuencial
>>>>>>> e5f820b (apuntes tema 1)
