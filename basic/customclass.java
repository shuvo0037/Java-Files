class Emplayee {
    String name;
    int id;

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My id is :" + id);
    }

}

public class customclass {

    public static void main(String[] args) {
        System.out.println("This is our custom class!");
        Emplayee shuvo = new Emplayee();
        shuvo.name = "Sushanta";
        shuvo.id = 12342;

        Emplayee john=new Emplayee();

        john.id=12424;
        john.name="Jonny Sins";

        // System.out.println("Name:"+shuvo.name );
        // System.out.println("id:"+shuvo.id);

        shuvo.printDetails();
        john.printDetails();
    }
}