package repaso.ejercicio3;

public class Producto {
    // atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // constructor
    public Producto(int id, String nombre, double precio, int stock){
        this.id = id;          // Asigna el parámetro recibido al atributo de la clase
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // getter y setter
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; } // actualizar stock
}