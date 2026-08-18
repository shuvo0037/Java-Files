package oop;

public class ConstructorCall {
    public static void main(String[] args) {

        student s1 = new student("Shuvo Sarker", 20228310, 3.0);

        s1.printStudent();
    }
}

class student {

    String name;
    int roll;
    double CGPA;

    student(String name, int roll, double CGPA) {//default constructor
        this.name = name;
        this.roll = roll;
        this.CGPA = CGPA;
    }

    void printStudent() {
        System.out.println(name + " " + roll + " " + CGPA);
    }
}