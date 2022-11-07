package lesson10;

public class Main {
    public static void main(String[] args) {

        GenericModule.Define<Integer, String> definedConverter = s -> s.toString();            // 3-rd task
        System.out.println(definedConverter.convert(154));


        GenericModule.MaxFinding maxFinding = new GenericModule.MaxFinding<>(12);     // 4-th task
        System.out.println(maxFinding.put(16));
        System.out.println(maxFinding.getMaxValue());

    }
}
