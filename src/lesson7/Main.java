package lesson7;

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(8,12,23,15);
        System.out.println(t.dataAboutShape());

        Circle c = new Circle(15);
        System.out.println(c.dataAboutShape());

        Rectangle r = new Rectangle(12,16, 22);
        System.out.println(r.dataAboutShape());

        Lion l = new Lion(6,"Honey");
        System.out.println(l.eat());

        Horse h = new Horse(4,"Bae");
        System.out.println(h.sleep());

        Mouse m = new Mouse(1,"Miki");
        System.out.println(m.speak());

        Python p = new Python(1,"Ruby");
        System.out.println(p.drink());
    }
}
