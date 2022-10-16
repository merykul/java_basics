package lesson6tasks;

public class Circle {
    public Circle (double radius, double pi) {
       pi = 3.14;
       radius = 0;
    }
    public double CircleArea (double radius, double pi) {
        double area = pi * radius;
        return area;
    }
    public double CirclePerimeter (double radius, double pi) {
        double perimeter = 2 * pi * radius;
        return perimeter;
    }
}
