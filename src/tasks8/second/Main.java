package tasks8.second;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Boo",5,3);
        System.out.println(c.say());

        Crucian cr = new Crucian("Fish", 1,2);
        System.out.println(cr.swim());

        Dog d  = new Dog("Doggy",2,10);
        System.out.println(d.run());

        Lion l = new Lion("Leo",6,130);
        System.out.println(l.say());

        Pigeon p = new Pigeon("Pigy",3,1);
        System.out.println(p.fly());

    }
}
