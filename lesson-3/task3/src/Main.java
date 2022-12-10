public class Main {
    public static void main(String[] args) {
        Logarithm logarithm;
        try {
            logarithm = new Logarithm(10, 100);
        } catch (InvalidArgumentException ex) {
            System.out.println(ex);
            return;
        }
        double doubleVal = logarithm.doubleValue();
        System.out.println(doubleVal);
    }
}