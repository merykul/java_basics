package lesson6tasks;

public class Circle {
    public double pi = 3.14;
    public double radius;
    public Circle (double radius, double pi) {
       this.pi = pi;
       this.radius = radius;
    }
    public double circleArea (double radius, double pi) {
        return  pi * radius;
    }
    public double circlePerimeter (double radius, double pi) {
        return  2 * pi * radius;
    }
}
