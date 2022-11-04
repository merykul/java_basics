package lesson10;

public class Main {
    public static void main(String[] args) {

        //GenericModule.Defined defined = new GenericModule.Defined();
        //System.out.println(defined.convert(1));

        // 4-th task

        GenericModule.MaxFinding maxFinding = new GenericModule.MaxFinding<>(56);
        System.out.println(maxFinding.put(56, 12));
        System.out.println(maxFinding.getMaxValue());


    }
}
