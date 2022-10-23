package lesson7;

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.setSide1(12);
        t.setSide2(23);
        t.setSide3(15);
        System.out.println(t.getPerimeter());

        Circle c = new Circle(15);
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle(12,16);
        System.out.println(r.getPerimeter());


    }
}
