public class TiendaMain {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("      SISTEMA ShopCo — COLOMBIA");
        System.out.println("======================================\n");

        System.out.println("--- PRODUCTOS ---");
        Producto p1 = new Producto();
        Producto p2 = new Producto("Tenis Nike", 189900.0, 25, "Calzado");
        Producto p3 = new Producto(p2);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        System.out.println("--- CLIENTES ---");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("María Gómez", "maria@gmail.com", "Medellín", "3001234567");
        Cliente c3 = new Cliente(c2);
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        System.out.println("--- VENDEDOR ---");
        Vendedor v1 = new Vendedor();
        Vendedor v2 = new Vendedor("Carlos Ramos", "V-001", 5.0, true);
        Vendedor v3 = new Vendedor(v2);
        v1.mostrar();
        v2.mostrar();
        v3.mostrar();

        System.out.println("--- ENVÍO ---");
        Envio e1 = new Envio();
        Envio e2 = new Envio("GU-20240001", "Cali", 3, 12000.0);
        Envio e3 = new Envio(e2);
        e1.mostrar();
        e2.mostrar();
        e3.mostrar();

        System.out.println("--- PEDIDOS ---");
        Cliente c = new Cliente("Juan Pérez", "juan@hotmail.com", "Bogotá", "3109876543");
        Producto p = new Producto("Camiseta Polo", 59900.0, 50, "Ropa");
        
        Pedido ped1 = new Pedido();
        Pedido ped2 = new Pedido("PED-001", c, p, 2);
        Pedido ped3 = new Pedido(ped2);
        
        ped1.mostrar();
        ped2.mostrar();
        ped3.mostrar();

        System.out.println("======================================");
        System.out.println("       FIN DEL SISTEMA ShopCo");
        System.out.println("======================================");
        
        /*
         * Preguntas de reflexión:
         * 1. ¿Qué ocurre si una clase no tiene ningún constructor? ¿Qué hace Java automáticamente?
         * R: Java crea automáticamente un constructor por defecto sin parámetros. Este inicializa 
         *    los atributos con sus valores por defecto (null para objetos, 0 para numéricos, false para booleanos).
         * 
         * 2. ¿Por qué es útil el constructor copia en lugar de simplemente asignar objeto2 = objeto1?
         * R: Al asignar objeto2 = objeto1, ambas variables apuntan a la misma dirección de memoria. 
         *    Cualquier cambio en uno afectaría al otro. El constructor copia permite duplicar 
         *    los valores en una nueva instancia completamente independiente.
         * 
         * 3. En la clase Pedido, ¿por qué el total se calcula en el constructor y no se recibe como parámetro?
         * R: Para asegurar que el total siempre sea matemáticamente consistente con la cantidad 
         *    y el precio del producto. Si se recibiera como parámetro, existiría el riesgo de 
         *    insertar un valor erróneo que no corresponda al cálculo real.
         * 
         * 4. ¿Qué ventaja tiene declarar los atributos como private?
         * R: Promueve el encapsulamiento. Evita que los atributos sean modificados directamente 
         *    desde fuera de la clase, protegiendo el estado interno del objeto y forzando el 
         *    acceso mediante métodos controlados (getters/setters).
         */
    }
}
