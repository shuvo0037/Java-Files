package gameProject;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(1, 200);

        while (true) {
            System.out.print("Enter a number: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congrats! You guessed the number.");
                break;
            } else if (guess > number) {
                System.out.println("The number is less than your guess.");
            } else {
                System.out.println("The number is greater than your guess.");
            }
        }
    }
}