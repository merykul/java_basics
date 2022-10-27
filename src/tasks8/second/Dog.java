package tasks8.second;

public class Dog extends Animal implements Runable {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return getName() + " eats meat and special treats";
    }

    @Override
    public String say() {
        return getName() + " often say gav";
    }

    @Override
    public String run() {
        return getName() + " is able to run";
    }
}
