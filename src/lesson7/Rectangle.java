package lesson7;

public class Rectangle extends Shape {
    public Rectangle (double width, double high) {
        super(width, high);
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + high);
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public String dataAboutShape() {
        return "Perimeter of rectangle is: " + this.getPerimeter() + " and area is: " + this.getArea();
    }
}
