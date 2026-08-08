package gameProject;

import java.util.Scanner;



public class ShoppingCart {
     int calculator(String product,int quantity){

         switch (product){
             case "chocolate":
                 return(20*quantity);


             case "pen":
                 return (10*quantity);

             case "ice_cream":
                 return (50*quantity);


             case "biscuit":
                 return (10*quantity);


             default:
                 System.out.println("The prduct is currently unavailable");
                 return 0;
         }


    }
    public  static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String product1= input.nextLine();

        System.out.println("The price for each chocolate is 20tk");
        System.out.println("The price for each pen is 10tk");
        System.out.println("The price for each ice cream is 50tk");
        System.out.println("The price for each biscuit  is 10tk");


        System.out.println("what quantity do you want?");
        int quantity=input.nextInt();

        ShoppingCart cart=new ShoppingCart();

        System.out.printf("Your total bill is %dtk%n", cart.calculator(product1, quantity));



    }
}
