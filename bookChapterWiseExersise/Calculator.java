package bookChapterWiseExersise;
import java.util.Scanner;
public class Calculator {
    public static double Calculate(int a,int b,char c){
        if(c=='+')
            return a+b;
        else if(c=='-')
            return a-b;
        else if(c=='*')
            return a*b;
        else if(c=='/')
        {
            if(b==0)
            {
                System.out.println("The Operation is not possible");
                return 0;
            }
            else
            {
                return (double)a/b;
            }
        }
        else if(c=='%')
            return a%b;
        else{
            System.out.println("Invalid Operation ");
            return 0;
        }

    }
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

       System.out.println("Enter First Number: ");
       int a=input.nextInt();

       System.out.println("Enter Second Number : ");
       int b=input.nextInt();

       System.out.println("Enter Operation: ");
       char c=input.next().charAt(0);

       double ans=Calculate(a,b,c);
       System.out.println("The ans of "+a +c+b+"is equal==" + ans);

    }
}
