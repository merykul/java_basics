package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//1
        String string = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        string = string.replaceAll("[^a-zA-Z ]", "");
        List<String> words = new ArrayList<>(List.of(string.split(" ")));
        System.out.println("Number of words before any actions: " + words.size()); // number of words = 70;


        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            String val = String.valueOf(iterator.next());
            if (val.length() > 6) {
                iterator.remove();
            } else if (val.length() < 3) {
                iterator.set(val.concat("*".repeat(3 - val.length())));
            }
        }

        System.out.println("Words after deleting longer than 6 and add * to shorter than 3: ");

        for (String s : words) {
            System.out.println(s);
        }

        System.out.println(words.size()); //59

// 2
        Set<String> setSorted = new TreeSet<String>(words);
        System.out.println(setSorted.size()); //50
        Iterator<String> it = setSorted.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String s : setSorted) {
            System.out.println(s);
        }

// 3
        Student s0 = new Student("Mariia Kulyk", 256255256, "Testing");
        Student s1 = new Student("Jon Ng", 4589522, "Programming");
        Student s2 = new Student("Angy Kit", 989898988, "Managing");
        Student s3 = new Student("Sofy Oly", 454545454, "PM");
        Student s4 = new Student("Denis Fly", 454545122, "Testing");
        Student s5 = new Student("Lily Lio", 121212123, "PM");
        Student s6 = new Student("Mariia Kulyk", 256255256, "Testing");
        Student s7 = new Student("Aria Civil", 565368955, "Managing");
        Student s8 = new Student("Asly Kit", 454554545, "Programming");
        Student s9 = new Student("Cit Joy", 787287522, "PM");
        Student s10 = new Student("Cit Joy", 787287522, "PM");

        Set<Student> students = new HashSet<Student>();
        students.add(s0);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        System.out.println(students.size());

    }
}
