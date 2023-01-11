package lesson20;

public class Main {
    public static void main(String[] args) {
        DataSourceDecorator standardDateView = new DataSourceDecorator(new FileDataSource());
        DataSourceDecorator onlyDateDisplay = new DisplayDateWithoutTime(new FileDataSource());

        System.out.println("Data with default view: " + standardDateView.readData() + "\n");
        System.out.println("Data without default time: " + onlyDateDisplay.readData());
    }
}
