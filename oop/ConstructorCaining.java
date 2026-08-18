package oop;

import java.beans.PersistenceDelegate;

public class ConstructorCaining {
    public static void main(String[] args) {
                Person p1=new Person("Shuvo","shuvosarker@gmail.com",23);
              p1.print();
    }
}
class Person{
    String name;
    String Email;
    int age;

    Person(String name,String Email,int age){
        this(Email,age);
        this.name=name;

    }
    Person(String Email,int age){
        this.Email=Email;
        this(age);
    }
    Person(int age){
        this.age=age;
    }

    void print(){
        System.out.println(name+" "+Email+" "+age);
    }

}

