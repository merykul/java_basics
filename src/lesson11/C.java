package lesson11;

public class C extends B {

    public C(int number) throws ArithmeticException {
        super(number);
    }

    @Override
    public int division(int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        } else return (getNumber() / divisor);
    }
}
