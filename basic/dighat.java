import java.util.Scanner;

public class dighat {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
      System.out.println("enter a= ");
      int a=input.nextInt();

      System.out.println("Enter b= ");
      int b=input.nextInt();

      System.out.println("enter c = ");
      int c= input.nextInt();

      double determenant = b*b - 4.0*a*c;

      if(determenant<0.0)
        System.out.println("NO Solution");
    else
    {
        double x1= (-b + Math.sqrt(determenant))/ (2.0*a);
         double x2= (-b - Math.sqrt(determenant))/ (2.0*a);

         System.out.println("roots are : " + x1 + "  and  " + x2);
    }

    
    }
}
