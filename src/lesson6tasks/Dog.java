package lesson6tasks;

public class Dog {
    private int age;
    public String name;
    public String breed;
    public Dog (String breed, int age, String name) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    public String sit (String breed, int age, String name) {
        return "Dog is sitting";
    }
    public String eat (String breed, int age, String name) {
        return "Dog is eating";
    }
}
