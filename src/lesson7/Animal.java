package lesson7;

public abstract class Animal {
    private String name;
    private int age;

    public Animal (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract String speak ();
    public abstract String sleep ();
    public abstract String eat ();
    public abstract String drink ();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
