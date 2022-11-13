package lesson11;

public class A {
    private int number;

    public A(int number) throws ArithmeticException {

    }
    public int division(int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("You cannot divide by zero");
        } else return (getNumber() / divisor);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
