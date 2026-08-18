public class ComputeArea {
  public   static void main(String[] args) {
      if(args.length==0){
          System.out.println("Pass an argument and Try later ");
      }
        String arg0d=args[0];
        int radius= Integer.parseInt(arg0d);
      System.out.println("Area = " +(radius*radius*Math.PI));
    }
}
