package lesson7;

public class Circle extends Shape {
    private double pi = 3.14;
    private double d;

    public Circle (double d) {
        super();
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return d * pi;
    }

    @Override
    public void countArea() {

    }
}
