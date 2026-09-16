# Acceso-a-datos

## Repaso - Conceptos y diseño orientado a objetos

### Introducción

### Definiciones de elementos

### Colecciones

### Programación por capas

Es un modelo de desarrollo de SW, cuyo objetivo principal es lograr el **desacoplamiento**, entre las partes que componen al sistema SW. Haciendo qeu las partes (o capas) cumplan una misión simple y abstracta. Algunas de las ventajas que nos ofrece son:

- **Alta escalabilidad:** En caso de que las necesidades aumenten, podrán complicarse con facilidad.
- **Alta sostenibilidad:** El esfuerzo requerido para aplicar mantenimiento al código va a ser mucho menor.

En la arquitectura en 3 capas, las tres capas son las siguientes:

- **Capa de Datos:** Se encarga de crear, recuperar, actualizar los datos
- **Capa de Negocio (Lógica del Negocio):** Esta capa gestiona la lógica de la aplicación. Es donde se indica qué se hace con los datos.
- **Capa de presentación:** Es lo que ve el usuario. A través de ella el usuario va a pasarle las acciones que realice a la capa de negocio.

#### Arquitectura DAO

