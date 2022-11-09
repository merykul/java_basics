package lesson11;

public class AccountCreating {
    private String firstName;
    private String lastName;
    private int age;
    public AccountCreating(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public int ageCheckingField(int age) throws CheckAgeAccess {
        this.age = age;
        if (age < 14) {
            throw new CheckAgeAccess("You are too young! Please, wait " + (14 - age) + " years.");
        }
        else if (age > 120) {
            throw new CheckAgeAccess("You entered invalid age.");
        }
        else return this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
