package lesson13;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", fullName='" + fullName + '\'' +
                ", telNumber=" + telNumber +
                '}';
    }

    private String faculty;
    private String fullName;
    private long telNumber;

    public Student (String fullName, long telNumber, String faculty) {
        this.fullName = fullName;
        this.telNumber = telNumber;
        this.faculty = faculty;
    }

}
