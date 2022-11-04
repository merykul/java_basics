package lesson10;

public class Main {
    public static void main(String[] args) {

        //GenericModule.Defined defined = new GenericModule.Defined();
        //System.out.println(defined.convert(1));

        GenericModule.MaxFinding maxFinding = new GenericModule.MaxFinding<>(4);
        System.out.println(maxFinding.compare(4,56));
        System.out.println(maxFinding.getMaxValue());

    }
}
