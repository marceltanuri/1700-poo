public class Cliente {

    private String nombre;
    private String correo;
    private String ciudad;
    private String telefono;

    // Constructor por defecto
    public Cliente() {
        this.nombre = "Desconocido";
        this.correo = "Desconocido";
        this.ciudad = "Desconocido";
        this.telefono = "Desconocido";
    }

    // Constructor con parámetros
    public Cliente(String nombre, String correo, String ciudad, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    // Constructor copia
    public Cliente(Cliente otro) {
        this.nombre = otro.nombre;
        this.correo = otro.correo;
        this.ciudad = otro.ciudad;
        this.telefono = otro.telefono;
    }

    // Getters necesarios para Pedido
    public String getNombre() {
        return this.nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("=== Cliente ===");
        System.out.println("Nombre:   " + this.nombre);
        System.out.println("Correo:   " + this.correo);
        System.out.println("Ciudad:   " + this.ciudad);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println();
    }
}
