package orders;

import products.Product;

public class Order {
    private final int id;
    private Product[] products;
    private static int productCount;
    private static final int MAX_PRODUCTS = 10;
    private static int orderCount;

    public Order(int id, Product[] products) {
        this.id = id;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public int getId() {
        return id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        if (productCount < Order.MAX_PRODUCTS) {
            this.products[productCount++] = products;
        } else {
            System.out.println("Maximum limit of products: " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            var product = this.products[i];
            total += this.products[i].getPrice(); // total = total + product.getPrice()
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order ID: " + this.id);
        var totalOrder = this.calculateTotal();
        System.out.println("\tOrder total: " + totalOrder);
        System.out.println("\tProduct Order: ");
        for (int i = 0; i < productCount; i++) {
            System.out.println("\t\t" + this.products[i]);

        }
    }
}
