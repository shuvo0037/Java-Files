public class Auto_boxing {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    // autoboxing -> "primitive data type theke reference data type e convert"
    public static void main(String[] args) {
        Auto_boxing example = new Auto_boxing();
        int a = 5;
        int b = 10;

        System.out.println(example.add(a, b));

    }
}
