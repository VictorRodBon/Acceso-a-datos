package repaso.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto(1, "Laptop", 850.00, 10));
        inventario.agregarProducto(new Producto(2, "Ratón USB", 15.50, 5));
        inventario.agregarProducto(new Producto(3, "Teclado USB", 40.50, 3));

        try {
            // Venta exitosa
            inventario.venderProducto(1, 3);
            System.out.println("Venta realizada. Stock restante de Laptop: " + inventario.buscarProducto(1).getStock());

            // Intento de venta con stock insuficiente (lanza excepción)
            inventario.venderProducto(2, 10);
        } catch (StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}