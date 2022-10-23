package lesson7;

public class Python extends Animal {
    @Override
    public String speak() {
        return  "ssss";
    }
    @Override
    public String sleep() {
        return getName() + " usually sleeps near 7 hours";
    }
    @Override
    public String eat() {
        return getAge() + " years old snakes eat special feed" ;
    }

    @Override
    public String drink() {

        return getName() + " drinks water";
    }
}
