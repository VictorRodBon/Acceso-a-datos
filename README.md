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

#### Tipos de ficheros según su contenido

Un fichero es simplemente una secuencia de *bytes*, con lo que en principio se puede almacenar cualquier tipo de información.

Un fichero se identifica por su nombre y su ubicación dentro de una jerarquía de directorios.

Cabe destacar dos tipos de ficheros:
- **Ficheros de texto:** Contienen única y exclusibamente unca secuencia de caracteres, por lo que su contenido se puede modificar en cualquier editor de texto. Los caracteres pueden ser *visibles* (letras, números, signos de puntuación) o *invisibles* (espacioes, tabuladores, retornos de carro).
- **Ficheros binarios:** Son el resto de ficheros, pueden contener cualquier tipo de información. En general, hacen falta programas o visores especiales para mostrar la información que contienen.

#### Codificaciones para textos

Un texto es una secuencia de caracteres. Como cualquier tipo de información, se almacena en memoria o en cualquier dispositivo de almacenamiento como una secuencia de *bytes*.

Una codificación es un método para representar cualquier texto cmo una secuencia de *bytes*.

El mismo texto, según la codificación, se puede almacenar como una secuencia de *bytes* distinta.

#### Clase File en Java

Nos permite obtener información relativa a directorios y ficheros, y realizar diferentes operaciones con ellos (borrar, renombtrar, etc.).

#### Gestión de excepciones en Java

Cualquier programa en java debe realizar una adecuada gestión de Excepciones.

Una **Excepción** es un evento que ocurre durante la ejecución de un programa y que interrumpe su cueso normal de ejecución.

Cuando no se gestiona debidamente una excepción se aborta el programa. Para gestionar la excepción el uso de la estrucura *try{---}catch(---){---}*.

Las excepciones son objetos de java, pertenecientes a la clase **Exception**, o a una subclase de esta. A su vez la clase *Exception* tiene como clase padres *Throwable*.

Si el compulador es capaz de determinar que un método de una clase puede originar un tipo de excepción, pero no lo gestiona mediante un bloque *catch*, la compilación terminará con un error. Otra psibilidad es añadir el modificador *throws* seguido de la clase de excepción indicado que esa excepción se capturará en un método de una clase superior.

Es importante añadir la necesidad de liberar los recursos incluso en el caso de excepción, por ello el bloque try catch se complementa con un cbloque *finally{}*.

Los bloques ***try whith resources*** son de utilidad para simplificar la gestión de recursos de las clases que implementan un ade las interfaces Closeable o AutoCloseable.

#### Acceso a los ficheros

Existen dos formas de acceder:

- **Acceso secuencial:** Se accede comenzando desde el principio del fichero. Para llegar a cualquier parte del fichero hay que pasar por todos los contenidos anteriores.
- **Acceso aleatorio:**: Se accede directamente al los datos situados en cualquier posición del fichero.

#### Operaciones

El mecanismo de acceso a un fichero está basado en un puntero y en una zona de memoria que se llama *buffer*. El pountero siempre apunta a un lugar del fichero o bien a un aposición especial de fin de fichero, que a veces se denomina EOF, situada inmediatamente después del último byte del fichero.

Indempendientemente del tipo de fichero y de acceso, las operaciones básicas sobre ficheros son:

- **Apertura:** Antes de hacer nada con un fichero hay que abrirlo. Esto se hace para crear una instancia de una clase que se usará para operar con él.
- **Lectura:** Mediante el método *read()*. Consiste en leer contenidos de un fichero para volcarlos a memoria y poder trabajar con ellos. El puntero se sitúa justo después del último caracter leído.
- **Salto:** Mediante el método *skip()*. Consiste en hacer avanzar el puntero un número determinado de bytes o caracteres hacia delante.
- **Escritura:** Mediante el método *write()*. Consiste en escribir contenidos de memoria en un lugar determinado del fichero. El puntero se sitúa justo depués del último caracter escrito.
- **Cierre:** Mediante el métoso *close()*. Para terminar hay que cerrar el fichero.
