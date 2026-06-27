public class Producto {

    private String nombre;
    private double precio;
    private int    stock;
    private String categoria;

    // Constructor por defecto
    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.stock  = 0;
        this.categoria = "Sin categoría";
    }

    // Constructor con parámetros
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock  = stock;
        this.categoria = categoria;
    }

    // Constructor copia
    public Producto(Producto otro) {
        this.nombre = otro.nombre;
        this.precio = otro.precio;
        this.stock  = otro.stock;
        this.categoria = otro.categoria;
    }

    // Getters necesarios para Pedido
    public double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        this.nombre = nome;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("=== Producto ===");
        System.out.println("Nombre:    " + this.nombre);
        System.out.println("Precio:    $" + this.precio);
        System.out.println("Stock:     " + this.stock + " unidades");
        System.out.println("Categoría: " + this.categoria);
        System.out.println();
    }
}
