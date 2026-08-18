public class BitwiseOperatior {
    static void main(String[] args) {
        int a=2;//10
        int b=3;//11
        int c= a&b;//10
        int d=a|b;//11

        int e=~a;
        int f=a^b;//1

        System.out.println(c+" " +d+" "+e+" "+f );

        int g= b<<31;
        int h=b>>1;
        System.out.println(g+" " +h);


    }
}
