package tasks8.second;

public class Cat extends Animal implements Runable {
    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return getName() + " eats special treat, meat and sometimes mouse";
    }

    @Override
    public String say() {
        return getName() + " say miy-miy";
    }

    @Override
    public String run() {
        return "Cat can run";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
