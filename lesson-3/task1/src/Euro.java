public class Euro implements Currency {
    private float balance;
    private String abbreviation = "EUR";
    private String symbol = "\u20ac";
    private FakeCantor cantor = new FakeCantor();

    public Euro(float value) {
        balance = value;
    }

    private float euroAmountFromCurrency(float value, String currency) {
        float rate = cantor.euroToRate(currency);
        return value / rate;
    }

    public Euro addedCurrency(float value, String currency) {
        return new Euro(balance + euroAmountFromCurrency(value, currency));
    }

    public Euro subtractedCurrency(float value, String currency) {
        float amountToSubtract = euroAmountFromCurrency(value, currency);
        if (amountToSubtract <= this.balance) {
            return new Euro(balance - amountToSubtract);
        }
        // Should some Error be raised here?
        return this;
    }

    public String abbreviation() {
        return abbreviation;
    }

    public String symbol() {
        return symbol;
    }

    public String balance() {
        return Float.toString(this.balance);
    }

    public float toDollarExchangeRate() {
        // How many Euro you need to buy 1 Dollar
        float euroRate = cantor.euroToRate("USD");
        return 1 / euroRate;
    }

}
