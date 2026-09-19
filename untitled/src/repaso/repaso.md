# REPASO JAVA
## Bloque 1: Condiciones y bucles
### Ejercicio 1:
Crea un programa que pida por consola las notas de 3 exámenes de un alumno.
- Calcula la nota media.
- Muestra por consola la nota media formateada a dos decimales.
- Imprime la calificación correspondiente según la escala:
  - <5: suspenso
  - 5<= nota <7: aprobado
  - 7<= nota <9: notable************
  - 9<= nota <=10: sobresaliente

### Ejercicio 2:
El programa debe generar un número aleatorio entre 1 y 100 (Math.random).
- El usuario debe interntar adivinar el número mediante entradas de teclado.
- En cada intento, el programa dirá si el número secreto es mayor o menor que el introducido.
- El juego termina**** cuando el usuario acierta o cuando suera el límite de 7 intentos. Muestra un mensaje acorde en cada caso.

## Repaso general

### Ejercicio 3: Gestión de Inventario y excepciones Personalizadas

Diseña un sistema para gestionar el stock de un almacen aplicando POO y manejo de errores.

**Requisitos:**
- Crea una clase producto con los atributos: id (int), nombre (String), precio (double) y stock (int)
- Crea una excepción personalizada llamada "StockInsuficienteException"
- Crea una clase inventario que utilice un HashMap<Integet, Producto> para almacenar productos por su id
- Implementa los métodos "agregarProducto(Producto p)", buscarProducto(int id) y venderProducto(int id, int cantidad).
- El método venderProducto debe lanzar StockInsuficienteException si la cantidad solicitada supera el stock disponible o si el producto no existe.
