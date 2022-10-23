package lesson7;

public class Mouse extends Animal{
    @Override
    public String speak() {
        return  "pi-pi";
    }
    @Override
    public String sleep() {
        return getName() + " sleeps 10 hours per night";
    }

    @Override
    public String eat() {
        return getAge() + " yeas old mouse eats bread, fruits, carrot, apples, etc.";
    }

    @Override
    public String drink() {
        return getName() + " drinks milk and water";
    }
}
