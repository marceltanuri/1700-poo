public class Pedido {

    private String   numeroPedido;
    private Cliente  cliente;
    private Producto producto;
    private int      cantidad;
    private double   total;

    // Constructor por defecto
    public Pedido() {
        this.numeroPedido = "SIN-NUMERO";
        this.cliente  = new Cliente();
        this.producto = new Producto();
        this.cantidad = 0;
        this.total    = 0.0;
    }

    // Constructor con parámetros
    public Pedido(String numeroPedido, Cliente cliente, Producto producto, int cantidad) {
        
        if(cantidad < 1){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        
        this.total = producto.getPrecio() * cantidad;
    }

    // Constructor copia
    public Pedido(Pedido otro) {
        this.numeroPedido = otro.numeroPedido;
        this.cliente = new Cliente(otro.cliente);
        this.producto = new Producto(otro.producto);
        this.cantidad = otro.cantidad;
        this.total = otro.total;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("======== PEDIDO ShopCo ========");
        System.out.println("Número:   " + this.numeroPedido);
        System.out.println("Cliente:  " + this.cliente.getNombre() + " | " + this.cliente.getCiudad());
        System.out.println("Producto: " + this.producto.getNombre() + " | $" + this.producto.getPrecio());
        System.out.println("Cantidad: " + this.cantidad + " unidades");
        System.out.println("TOTAL:    $" + this.total);
        System.out.println("================================");
        System.out.println();
    }
}
