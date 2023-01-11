package lesson20;

import java.util.List;

public class DisplayDateWithoutTime extends DataSourceDecorator {

    DisplayDateWithoutTime(DataSource source) {
        super(source);
    }
    @Override
    public void writeDate() {
        super.writeDate();
    }

    @Override
    public String readData() {
        return dateCutTime(super.readData()).toString();
    }

    List dateCutTime(String date) {
        List<String> dateSpitedIntoList = List.of(date.split(" "));
        System.out.println(dateSpitedIntoList);
        return dateSpitedIntoList.stream().filter(s -> s.length() < 5).toList();
    }
}