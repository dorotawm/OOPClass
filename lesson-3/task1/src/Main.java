public class Main {
    public static void main(String[] args) {
        Euro euro = new Euro(200);
        Euro euro2 = euro.subtractedCurrency(100, "GBP");
        System.out.println(euro2.balance());
        System.out.println(euro.symbol());

    }
}