public class IntegerPair {
    private int a;
    private int b;

    public IntegerPair(int firstInteger, int secondInteger) {
        a = firstInteger;
        b = secondInteger;
    }

    public int max() {
        return a > b ? a : b;
    }

    public int min() {
        return a < b ? a : b;
    }

    public float avg() {
        return (a + b) / 2.0f;
    }
}
