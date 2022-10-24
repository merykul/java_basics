package lesson7;

public class Rectangle extends Shape {
    private double high;
    private double width;
    private double diagonal;
    public Rectangle (double width, double high, double diagonal) {
        this.high = high;
        this.width = width;
        this.diagonal = diagonal;

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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
