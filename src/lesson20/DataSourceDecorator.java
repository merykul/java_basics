package lesson20;

public class DataSourceDecorator implements DataSource{
    private DataSource wrapper;
    DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }
    @Override
    public void writeDate() {
        wrapper.writeDate();
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
