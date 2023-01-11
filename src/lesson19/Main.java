package lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> textList = new ArrayList<>();
        File fileText = new File("C:\\Users\\User\\IdeaProjects\\java_kulyk\\src\\lesson19\\text.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileText))) {
            textList = reader.lines().collect(Collectors.toList());
        }
        System.out.println(textList);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileText))) {
            textList.stream()
                    .filter(s -> s.length() <= 5)
                    .map(s -> s + "\n")
                    .forEach(c -> {
                       try {
                         writer.write(c, 0, c.length());
                       } catch (IOException e) {
                         throw new RuntimeException(e);
                       }
                    });
        }

        Date date = new Date();
        File dateFile = new File("C:\\Users\\User\\IdeaProjects\\java_kulyk\\src\\lesson19\\date.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dateFile))) {
            bufferedWriter.write(String.valueOf(date));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
