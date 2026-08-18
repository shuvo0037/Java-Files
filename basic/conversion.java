public class conversion {
    public static void main(String[] args) {
        int n=1_000_000;

        String binary=Integer.toBinaryString(n);
        String Hexa=Integer.toHexString(n);
        String octal=Integer.toOctalString(n);

        System.out.println("binary = " + binary);
        System.out.println("hexa= "+ Hexa);
        System.out.println("octal= " + octal);
    }
}
