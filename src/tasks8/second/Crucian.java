package tasks8.second;

public class Crucian extends Animal implements Swimmable, Comparable<Crucian> {
    public Crucian(String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String eat() {
        return getName() + " eats zooplankton and plants";
    }
    @Override
    public String say() {
        return getName() + " isn't talking in general";
    }
    @Override
    public String swim() {
        return getName() + " is able to swim";
    }

    @Override
    public int compareTo(Crucian o) {
        return Integer.compare(getAge(),o.getAge() );
    }
}
