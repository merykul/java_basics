package lesson10;

public class Main {
    public static void main(String[] args) {

        GenericModule.MaxFinding max = new GenericModule.MaxFinding();
        System.out.println(max.put(1,1));

        GenericModule.Defined defined = new GenericModule.Defined();
        System.out.println(defined.convert(1));

    }
}
