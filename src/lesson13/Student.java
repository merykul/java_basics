package lesson13;

import java.util.Objects;

public class Student {

    private enum faculty{
        PROGRAMMING, TESTING, PM, MANAGING
    }
    private String fullName;
    private long telNumber;

    public Student (String fullName, long telNumber, String faculty) {
        this.fullName = fullName;
        this.telNumber = telNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return telNumber == student.telNumber && Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, telNumber);
    }
}
