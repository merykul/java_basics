package tasks8.second;

public class Pigeon extends Animal implements Flyable {
    public Pigeon(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return getName() + " eats seeds and small insects";
    }

    @Override
    public String say() {
        return getName() + " is saying prpr";
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }

    @Override
    public String fly() {
        return getName() + " can fly";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
