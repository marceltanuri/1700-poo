public class Envio {

    private String numeroGuia;
    private String ciudadDestino;
    private int    diasEntrega;
    private double costoEnvio;

    // Constructor por defecto
    public Envio() {
        this.numeroGuia = "SIN-GUIA";
        this.ciudadDestino = "Sin definir";
        this.diasEntrega = 0;
        this.costoEnvio = 0.0;
    }

    // Constructor con parámetros
    public Envio(String numeroGuia, String ciudadDestino, int diasEntrega, double costoEnvio) {
        this.numeroGuia = numeroGuia;
        this.ciudadDestino = ciudadDestino;
        this.diasEntrega = diasEntrega;
        this.costoEnvio = costoEnvio;
    }

    // Constructor copia
    public Envio(Envio otro) {
        this.numeroGuia = otro.numeroGuia;
        this.ciudadDestino = otro.ciudadDestino;
        this.diasEntrega = otro.diasEntrega;
        this.costoEnvio = otro.costoEnvio;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("=== Envío ===");
        System.out.println("Guía:            " + this.numeroGuia);
        System.out.println("Ciudad destino:  " + this.ciudadDestino);
        System.out.println("Días de entrega: " + this.diasEntrega);
        System.out.println("Costo de envío:  $" + this.costoEnvio);
        System.out.println();
    }
}
