package lesson6tasks;

public class Circle {
    private double pi = 3.14;
    private double radius;
    public Circle (double radius) {
       this.pi = pi;
       this.radius = radius;
    }
    public double circleArea () {
        return  pi * radius;
    }
    public double circlePerimeter () {
        return  2 * pi * radius;
    }
}
