package oop;

public class LearnigSuperKeyword {
    public static void main(String[] args) {

        car c1 = new car("Toyota", "Sedan", "Corolla");

        c1.Start();
        c1.gear();
        c1.print();
    }
}

class Vicle {
    String name;
    String type;

    Vicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void Start() {
        System.out.println("Started");
    }

    void print() {
        System.out.println(name + " " + type);
    }
}

class car extends Vicle {
    String Model;

    car(String name, String type, String Model) {

        // Parent class constructor call
        super(name, type);

        this.Model = Model;
    }

    @Override
    void Start() {
        System.out.println("Car started");
    }

    void gear() {
        System.out.println("The car has 6 gear");
    }

    @Override
    void print() {

        // Parent class print() call
        super.print();

        System.out.println(Model);
    }
}