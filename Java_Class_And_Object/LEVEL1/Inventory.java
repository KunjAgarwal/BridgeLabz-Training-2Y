class Item {
    int itemCode;
    String itemName;
    double price;
    Item(int code, String name, double pr) {
        itemCode = code;
        itemName = name;
        price = pr;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Inventory {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 50.0);

        item1.displayDetails();

        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: " + item1.calculateTotalCost(quantity));
    }
}
