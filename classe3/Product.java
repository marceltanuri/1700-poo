import java.util.List;

class Product{

    private Product(){

    }

    public Product(String id, String name, double price, List<String> tags, int rating){
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
        this.rating = rating;
    }


    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String id, String name, double price, List<String> tags){
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    // metodos de fabrica
    public static Product of(){
        return new Product();
    }


    // state
    String id;
    
    double price;

    String name;

    List<String> tags;

    int rating;



}