package lesson6tasks;

public class Dog {
    private String name;
    private int age;
    public Dog (String name, int age) {
        this.age = age;
        this.name = name;
    }
    public String sit () {
        return name + " is sitting";
    }
    public String yearsOld () {
        return name + " is " + age + " years old";
    }
}
