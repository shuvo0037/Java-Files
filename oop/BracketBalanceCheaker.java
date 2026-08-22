
package oop;
import java.util.Scanner;

public class BracketBalanceCheaker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String input = sc.nextLine();

        BracketBalanceCheaker checker = new BracketBalanceCheaker();

        if (checker.isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }

    boolean isBalanced(String input) {

        // Odd number of brackets can never be balanced
        if (input.length() % 2 == 1) {
            return false;
        }

        CharStack stack = new CharStack();

        for (char c : input.toCharArray()) {

            // Opening bracket
            if (c == '(') {
                stack.push(c);
            }

            // Closing bracket
            else if (c == ')') {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                // Top bracket is not '('
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }

        // Stack empty হলে সব bracket match করেছে
        return stack.isEmpty();
    }
}



// CharStack Class


class CharStack {

    private char[] stack;
    private int top;

    CharStack() {
        stack = new char[100];
        top = -1;
    }

    // Push
    void push(char c) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = c;
    }

    // Pop
    char pop() {

        if (isEmpty()) {
            return '\0';
        }

        return stack[top--];
    }

    // Check Empty
    boolean isEmpty() {
        return top == -1;
    }
}