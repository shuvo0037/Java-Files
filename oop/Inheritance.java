package oop;

public class Inheritance {
    public static void main(String[] args) {

        // Multilevel Inheritance
        SWEEngineeringStudent s1 = new SWEEngineeringStudent();

        s1.name = "Shuvo";
        s1.age = 23;
        s1.college = "SUST";
        s1.course = "00182W";

        s1.print();
        s1.attendance();
        s1.attendLab();
        s1.programming();


        System.out.println("----------------");


        // Hierarchical Inheritance
        MedicalStudent s2 = new MedicalStudent();

        s2.name = "Rahim";
        s2.age = 25;
        s2.hospital = "Sylhet MAG Osmani";

        s2.print();
        s2.attendance();
        s2.attendHospital();
    }
}


// Parent Class
class Student {

    String name;
    int age;

    void attendance() {
        System.out.println("Attendance marked");
    }
}


// Child Class 1
class EngineeringStudent extends Student {

    String college;

    void attendLab() {
        System.out.println("Lab attendance marked");
    }

    void print() {
        System.out.println(name + " " + age + " " + college);
    }
}


// Child of EngineeringStudent
class SWEEngineeringStudent extends EngineeringStudent {

    String course;

    @Override
    void print() {
        System.out.println(name + " " + age + " " + college + " " + course);
    }

    void programming() {
        System.out.println("Programming class attended");
    }
}


// Child Class 2 of Student
class MedicalStudent extends Student {

    String hospital;

    void attendHospital() {
        System.out.println("Hospital attendance marked");
    }

    void print() {
        System.out.println(name + " " + age + " " + hospital);
    }
}