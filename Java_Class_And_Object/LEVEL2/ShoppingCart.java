class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " " + itemName + "(s) added to the cart.");
        }
    }

    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Invalid quantity to remove!");
        }
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity in cart: " + quantity);
        System.out.println("Total cost: " + total);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Pen", 10.0, 2);

        item1.displayTotalCost();
        item1.addItem(3);
        item1.displayTotalCost();
        item1.removeItem(4);
        item1.displayTotalCost();
    }
}
