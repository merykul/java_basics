package lesson7;

public class Lion extends Animal {

    public Lion (int age, String name) {
        super(age, name);
    }

    @Override
    public String speak() {
        return  "rrrr";
    }

    @Override
    public String sleep() {
        return this.getName() + " sleeps 8 hours per night";
    }

    @Override
    public String eat() {
       return this.getName() + " eats lambs and rabbits";
    }

    @Override
    public String drink() {
        return this.getName() + " drinks water";
    }
}
