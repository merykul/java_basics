package lesson10;

public class Main {
    public static void main(String[] args) {
        GenericModule genericModule = new GenericModule();
        GenericModule.SaveWithReferences save = new GenericModule.SaveWithReferences();

        GenericModule.MaxFinding max = new GenericModule.MaxFinding();
        System.out.println(max.getMax(1,1));


    }
}
