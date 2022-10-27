package tasks8.second;

public class Lion extends Animal implements Runable {
    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return getName() + " often eats meat";
    }

    @Override
    public String say() {
        return getName() + " often says rrr";
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }

    @Override
    public String run() {
        return "Lion is able to run";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
