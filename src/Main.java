import lesson6tasks.Circle;
import lesson6tasks.Dog;
import lesson6tasks.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(12,23);
        System.out.println(rectangleFirst.calculateArea());
        System.out.println(rectangleFirst.calculatePerimeter());

        Circle circleFirst = new Circle(5);
        System.out.println(circleFirst.circleArea());
        System.out.println(circleFirst.circlePerimeter());

        Dog dogFirst = new Dog("Doggy", 2);
        System.out.println(dogFirst.sit());
        System.out.println(dogFirst.yearsOld());

        Point first = new Point(5, 4);
        Point second = new Point(6, 8);
        System.out.println(second.calculateDistance(first));
    }
}