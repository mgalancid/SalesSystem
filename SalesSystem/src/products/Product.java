package products;

public class Product {
    private final int id;
    private String name;
    private double price;
    private static int productCounter;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = ++Product.productCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product: {" + "Id: " + this.id
                + " Name: " + this.name
                + " Price: " + this.price
                + '}';
    }
}
