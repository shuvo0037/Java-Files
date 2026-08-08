public class NumberSystemConversion {
    static void main(String[] args) {
        int num=1_00_000;
        String binary=Integer.toBinaryString(num);
        String Hexa=Integer.toHexString(num);
        String octa=Integer.toOctalString(num);

        System.out.println(binary);
        System.out.println(Hexa);
        System.out.println(octa);
    }
}
