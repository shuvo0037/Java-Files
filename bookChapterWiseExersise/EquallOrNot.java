package bookChapterWiseExersise;
import java.util.Scanner;
public class EquallOrNot
{
    static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();

        if(a==b && b==c &&c==d)
        {
            System.out.println("All Are Equal!");
        }
        else
        {
            System.out.println("All Are NOt Equal !");
        }
    }
}
