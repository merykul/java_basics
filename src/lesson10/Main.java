package lesson10;

public class Main {
    public static void main(String[] args) {
        GenericModule genericModule = new GenericModule();
        GenericModule.SaveWithReferences save = new GenericModule.SaveWithReferences();

        GenericModule.Max.MaxFinding max = new GenericModule.Max.MaxFinding();
        System.out.println(max.getMax(8,10));


    }
}
