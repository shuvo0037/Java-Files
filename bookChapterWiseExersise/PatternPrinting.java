package bookChapterWiseExersise;

public class PatternPrinting {
    public static void BoxPrint(){
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void BorderPrint(){
        int n=5;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i == 0) || (j == 0) || (i == (n - 1)) || (j == n - 1 )){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int n=5;
      for(int i=n;i>=1;i--){
          for(int j=0;j<=i;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
}
