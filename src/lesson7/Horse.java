package lesson7;

public class Horse extends Animal {
    @Override
    public String speak() {
        return "frr";
    }

    @Override
    public String sleep() {
        return "This horse is " + getAge() + " years old, so he sleeping 6 hours per night";
    }

    @Override
    public String eat() {
        return getName() + " eats grass and special feed";
    }

    @Override
    public String drink() {
        return getName() + " drinks water";
    }
}
