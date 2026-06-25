public class Vendedor {

    private String  nombre;
    private String  codigo;
    private double  comision;
    private boolean activo;

    // Constructor por defecto
    public Vendedor() {
        this.nombre = "Sin asignar";
        this.codigo = "V-000";
        this.comision = 0.0;
        this.activo = false;
    }

    // Constructor con parámetros
    public Vendedor(String nombre, String codigo, double comision, boolean activo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.comision = comision;
        this.activo = activo;
    }

    // Constructor copia
    public Vendedor(Vendedor otro) {
        this.nombre = otro.nombre;
        this.codigo = otro.codigo;
        this.comision = otro.comision;
        this.activo = otro.activo;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("=== Vendedor ===");
        System.out.println("Nombre:   " + this.nombre);
        System.out.println("Código:   " + this.codigo);
        System.out.println("Comisión: " + this.comision + "%");
        System.out.println("Activo:   " + this.activo);
        System.out.println();
    }
}
