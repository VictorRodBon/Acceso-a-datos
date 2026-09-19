package repaso.ejercicio3;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<Integer, Producto> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    // Agrega o actualiza un producto en el mapa utilizando su ID como clave
    public void agregarProducto(Producto p) {
        productos.put(p.getId(), p);
    }

    // Busca un producto por ID; retorna null si no se encuentra
    public Producto buscarProducto(int id) {
        return productos.get(id);
    }

    // Vender un producto
    public void venderProducto(int id, int cantidad) throws StockInsuficienteException {
        Producto producto = productos.get(id);

        // 1. Verificación de existencia
        if (producto == null) {
            throw new StockInsuficienteException("Error: El producto con ID " + id + " no existe.");
        }

        // 2. Verificación de stock (Mensaje corregido)
        if (producto.getStock() < cantidad) {
            throw new StockInsuficienteException("Error: Stock insuficiente para " + producto.getNombre()
                    + ". Disponible: " + producto.getStock() + ", Solicitado: " + cantidad);
        }

        producto.setStock(producto.getStock() - cantidad);
    }
}