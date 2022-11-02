package tasks8;

public class Main {
    public static void main(String[] args) {
        MusicianFirst david = new MusicianFirst("David");
        System.out.println(david.sound());

        MusicianSecond karl = new MusicianSecond("Karl");
        System.out.println(karl.sound());

        MusicianThird aria = new MusicianThird("Aria");
        System.out.println(aria.sound());
    }
}
