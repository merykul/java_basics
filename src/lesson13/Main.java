package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//1
        String string = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        Collection<String> words = new ArrayList<>(List.of(string.split(" ")));
        System.out.println(words.size()); // number of words = 70;

        System.out.println("----------------------------------------");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 6) {
                words.remove(iterator.next());
            } else if (iterator.next().length() < 3) {
                iterator.next().concat("*");
            } System.out.println(iterator.next());
        }

        System.out.println("----------------------------------------");

        System.out.println(words.size()); //59

// 2
        Set setSorted = new HashSet<String>(words);
        System.out.println(setSorted.size()); //50
        Iterator<String> it = setSorted.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

// 3
        Student s0 = new Student("Mariia Kulyk", 256255256, "Testing");
        Student s1 = new Student("Jon Ng", 4589522,"Programming");
        Student s2 = new Student("Angy Kit", 989898988, "Managing");
        Student s3 = new Student("Sofy Oly", 454545454, "PM");
        Student s4 = new Student("Denis Fly", 454545122, "Testing");
        Student s5 = new Student("Lily Lio", 121212123, "PM");
        Student s6 = new Student("Mariia Kulyk", 256255256, "Testing");
        Student s7 = new Student("Aria Civil", 565368955, "Managing");
        Student s8 = new Student("Asly Kit", 454554545, "Programming");
        Student s9 = new Student("Cit Joy", 787287522, "PM");

        HashSet students = new HashSet<>();
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

        System.out.println(students.size());

    }
}
