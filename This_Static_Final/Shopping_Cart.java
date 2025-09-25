public class Shopping_Cart {

    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product product1 = new Product("Laptop", "P101", 1200.0, 1);
        Product product2 = new Product("Mouse", "P102", 25.0, 2);

        System.out.println("--- Product Details ---");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
        System.out.println();

        System.out.println("--- Instanceof Check ---");
        Object anObject = product1;
        if (anObject instanceof Product) {
            Product product = (Product) anObject;
            System.out.println("Object is an instance of Product. Displaying details:");
            product.displayDetails();
        } else {
            System.out.println("Object is not an instance of Product.");
        }
        System.out.println();
    }
}
class Product {
    private static double discount;

    private final String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, String productId, double price, int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productId);
        System.out.println("Price: $" + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price with Discount: $" + (this.price * this.quantity * (1 - discount / 100)));
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}
