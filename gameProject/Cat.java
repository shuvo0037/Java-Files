package gameProject;

public class Cat {

    public String name;
    public String action = "sitting";

    public void changeAction(String action) {
        this.action = action;
    }

    public void changeAction(String action, int qn) {
        this.action = action;
        System.out.println(name + " the cat is " + action + ". There are " + qn + " cats.");
    }

    public void detail() {
        System.out.println(name + " " + action);
    }
}

class Tester {

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.name = "Rani";
        c1.changeAction("jumping");
        c1.changeAction("eating", 5);
        c1.detail();
    }
}