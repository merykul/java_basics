package lesson7;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double r;

    public Circle (double r) {
        super();
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * r * PI;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
    @Override
    public String dataAboutShape () {
        return "Perimeter of circle is: " + this.getPerimeter() + " and area of circle is: " + this.getArea();
    }
}
