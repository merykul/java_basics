package lesson7;

public class Circle extends Shape {
    private double pi = 3.14;
    private double r;

    public Circle (double r) {
        super();
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * pi;
    }

    @Override
    public double countArea() {
        return pi * r * r;
    }
}
