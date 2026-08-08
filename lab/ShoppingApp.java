//2022831039
public class ShoppingApp {

    public static void main(String[] args) {
        
        Item drink = new Item("Drink", 120.0, 3);
        Item chips = new Item("Chips", 50.0, 4);

        drink.displayItem();
        System.out.println("Total Cost: " + drink.calculateTotalCost()+"tk");
        System.out.println();

        chips.displayItem();
        System.out.println("Total Cost:  " + chips.calculateTotalCost()+"tk");

    }
}

class Item {

    String name;
    double unit;
    int quantity;

    Item(String name, double unit, int quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return unit * quantity;
    }

    void displayItem() {
        System.out.println("Item Name: " + name);
        System.out.println("Unit Price:  " + unit+"tk");
        System.out.println("Quantity Purchased: " + quantity);
    }
}

