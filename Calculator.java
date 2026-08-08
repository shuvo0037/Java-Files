import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        char operator;
        int result = 0;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        if (operator == '+')
            result = a + b;
        else if (operator == '-')
            result = a - b;
        else if (operator == '*')
            result = a * b;
        else if (operator == '/')
            result = a / b;
        else {
            System.out.println("Invalid Operation");
            return;
        }

        System.out.println("Result is : " + a + " " + operator + " " + b + " = " + result);
    }
}
