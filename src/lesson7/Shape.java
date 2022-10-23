package lesson7;

public abstract class Shape {
    protected double width;
    protected double high;
    public Shape() {

    }
    public Shape(double width, double high) {
    }
    public Shape(double high) {
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getPerimeter ();
    public abstract double getArea ();

    public abstract String dataAboutShape();
}


