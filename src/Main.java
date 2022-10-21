import lesson6tasks.Circle;
import lesson6tasks.Dog;
import lesson6tasks.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(12,23);
        Circle circleFirst = new Circle(12,3.14);
        Dog dogFirst = new Dog("Retriever",2,"Doggy");
        Point pointFirst = new Point(2,5,4,6);

        System.out.println(rectangleFirst.area(12,23));
        System.out.println(rectangleFirst.perimeter(12,23));

        System.out.println(circleFirst.circleArea(12,3.14));
        System.out.println(circleFirst.circlePerimeter(12,3.14));

        System.out.println(dogFirst.sit("Retriever", 2,"Doggy"));
        System.out.println(dogFirst.eat("Retriever", 2,"Doggy"));

        System.out.println(pointFirst.distance(2,5,4,6));
    }
}