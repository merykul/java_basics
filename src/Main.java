import lesson6tasks.Circle;
import lesson6tasks.Dog;
import lesson6tasks.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(12,23);
        Circle circleFirst = new Circle(12,3.14);
        Dog dogFirst = new Dog("Retriever",2,"Doggy");

        System.out.println(rectangleFirst.calculateArea(12,23));
        System.out.println(rectangleFirst.calculatePerimeter(12,23));

        System.out.println(circleFirst.circleArea(12,3.14));
        System.out.println(circleFirst.circlePerimeter(12,3.14));

        System.out.println(dogFirst.sit("Retriever", 2,"Doggy"));
        System.out.println(dogFirst.eat("Retriever", 2,"Doggy"));

        Point first = new Point(5, 4);
        Point second = new Point(6, 8);
        System.out.println(second.calculateDistance(first, second));
    }
}