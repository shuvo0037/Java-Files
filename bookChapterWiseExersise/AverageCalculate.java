package bookChapterWiseExersise;

import java.util.Scanner;

public class AverageCalculate {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double d;
        d = input.nextDouble();

        double ave=(double)((a+b+c+d)/4);

        System.out.println("Average is "+ave);
    }
}
