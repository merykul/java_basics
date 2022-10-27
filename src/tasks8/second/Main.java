package tasks8.second;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Boo", 5, 3);
        System.out.println(cat.say());

        Crucian fish = new Crucian("Fish", 1, 2);
        System.out.println(fish.swim());

        Dog dog = new Dog("Doggy", 2, 10);
        System.out.println(dog.run());

        Lion lion = new Lion("Leo", 6, 130);
        System.out.println(lion.say());

        Pigeon pigeon = new Pigeon("Pigy", 3, 1);
        System.out.println(pigeon.fly());

        Animal[] animal = {cat, fish, dog, lion, pigeon};
        for (Animal a : animal) {
            System.out.println(a);
        }
        Arrays.sort(animal);
        System.out.println(cat.compareTo(dog));
    }

    public int compareTo(Animal a, Animal b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
