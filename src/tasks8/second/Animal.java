package tasks8.second;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int weight;
    private int age;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract String eat();

    public abstract String say();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal o){
        return Integer.compare(this.getAge(),o.getAge());
    }
    public int compareToWeight(Animal o){
        return Integer.compare((int) this.getWeight(), (int) o.getWeight());
    }
}
