package lesson11;

public class AccountCreating {
    private String firstName;
    private String lastName;
    private int age;

    public AccountCreating(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public AccountCreating(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public int ageCheckingField(int age) throws CheckAgeAccess {
        this.age = age;
        try {
            if (age < 14 && age > 120) {
                throw new CheckAgeAccess("You are not in required age! ");
            } else return this.age = age;
        } catch (CheckAgeAccess c) {
            throw new CheckAgeAccess("It is not appropriate data!");
        } catch (RuntimeException r) {
            throw new RuntimeException("It is runtime problem");
        }
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
        if (lastName == null) {
            throw new NullPointerException("User didn't entered last name during registration.");
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
