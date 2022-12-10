public class Logarithm implements Number {

    private double base, argument;

    @Override
    public double doubleValue() {
        return Math.log(this.argument) / Math.log(this.base);
    }

    public Logarithm(double inputBase, double inputArgument) throws InvalidArgumentException{
        if (inputBase <= 0.0) {
            throw new InvalidArgumentException("Base should be a positive integer");
        }
        if (inputBase == 1) {
            throw new InvalidArgumentException("Base cannot be equal 1");
        }
        if (inputArgument <= 0) {
            throw new InvalidArgumentException("Argument should be a positive integer");
        }
        this.base = inputBase;
        this.argument = inputArgument;
    }
}