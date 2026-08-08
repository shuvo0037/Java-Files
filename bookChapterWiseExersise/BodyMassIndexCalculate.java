package bookChapterWiseExersise;
import java.util.Scanner;
public class BodyMassIndexCalculate {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Weight: ");
        int weight=input.nextInt();

        System.out.println("Enter Your Height in Meter: ");
        double height=input.nextDouble();

        double bmi=(weight)/(height*height);

        System.out.println("Your BMI is -> "+bmi);
    }
}
