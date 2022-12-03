package lesson20;

import java.io.*;
import java.util.Date;

public class FileDataSource implements DataSource {

    public FileDataSource() {
    }

    @Override
    public void writeDate() {
        Date date = new Date();
        File dateFile = new File("C:\\Users\\User\\IdeaProjects\\java_kulyk\\src\\lesson19\\date.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dateFile))) {
            bufferedWriter.write(String.valueOf(date));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File dateFile = new File("C:\\Users\\User\\IdeaProjects\\java_kulyk\\src\\lesson19\\date.txt");
        try (FileReader reader = new FileReader(dateFile)) {
            buffer = new char[(int) dateFile.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
