public class Un_boxing {
    public int add(int a, int b) {
        return a + b;
    }

    // Unboxing holo -> "reference data type theke primitive data type e convert"
    public static void main(String[] args) {
        Un_boxing example = new Un_boxing();

        Integer a = 10;
        Integer b = 17;

        System.out.println(example.add(a, b));
    }
}
