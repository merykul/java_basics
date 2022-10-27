package tasks8.second;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Boo",5,3);
        Cat o = new Cat("Mia",6,5);
        System.out.println(c.compareTo(o));
        System.out.println(c.say());

        Crucian cr = new Crucian("Fish", 1,2);
        System.out.println(cr.swim());

        Dog d  = new Dog("Doggy",2,10);
        System.out.println(d.run());

        Lion l = new Lion("Leo",6,130);
        Lion l2 = new Lion("Ilay",4,150);
        System.out.println(l.compareTo(l2));
        System.out.println(l.say());

        Pigeon p = new Pigeon("Pigy",3,1);
        System.out.println(p.fly());

    }
}
