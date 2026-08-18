package oop;

public class ConstuctorOverload {

    public static void main(String[] args) {

        ByCycle cycle1 = new ByCycle("veloce", 8, 20000);
        cycle1.print();

        ByCycle cycle2 = new ByCycle("veloce", 8, 20000, "V40");
        cycle2.print();
    }
}

class ByCycle {

    String name;
    int gear;
    int price;
    String model;

    // Constructor 1
    ByCycle(String name, int gear, int price) {
        this.name = name;
        this.gear = gear;
        this.price = price;
    }

    // Constructor 2 -> Constructor Overloading
    ByCycle(String name, int gear, int price, String model) {
        this.name = name;
        this.gear = gear;
        this.price = price;
        this.model = model;
    }

    void print() {
        System.out.println(name + " " + gear + " " + price + " " + model);
    }
}