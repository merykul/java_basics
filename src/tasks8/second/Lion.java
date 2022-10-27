package tasks8.second;

public class Lion extends Animal implements Runable, Comparable<Lion> {
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
    public String run() {
        return "Lion is able to run";
    }

    @Override
    public int compareTo(Lion l2) {
        return Integer.compare((int) getWeight(), (int) l2.getWeight());
    }
}
