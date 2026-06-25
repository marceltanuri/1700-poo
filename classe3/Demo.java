import java.util.List;

public class Demo{

    public static void main(String args[]){
        Product product = new Product("sm001", "Smartphone XZY", 200, List.of("eletronicos", "smartphones"), 5);
        Product product2 = new Product("sm001", "Smartphone XYZ2 ", 300);
        Product product3 = new Product("sm001", "Smartphone XYZ2 ", 300, List.of("eletronicos", "smartphones"));
        Product product4 = Product.of();


        System.out.println(product);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }

}