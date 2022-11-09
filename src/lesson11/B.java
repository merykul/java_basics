package lesson11;

public class B extends A {
    public B(int number) throws ArithmeticException {
        super(number);
    }

    @Override
    public int division(int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        } else return (getNumber() / divisor);
    }
}
