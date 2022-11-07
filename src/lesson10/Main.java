package lesson10;

public class Main {
    public static void main(String[] args) {

        GenericModule.SaveNew saveNew = new GenericModule.SaveNew<>(28);
        System.out.println(saveNew.getData());

        GenericModule.SaveValueWithMinAndMax saveValue = new GenericModule.SaveValueWithMinAndMax<>(); // 2-nd task
        System.out.println(saveValue.setMax(12, 45, 56));
        System.out.println(saveValue.setMin(12, 45, 56));
        System.out.println(saveValue.setValue(12, 45, 56));
        System.out.println(saveValue.getValue());


        GenericModule.Define<Integer, String> definedConverter = s -> s.toString();            // 3-rd task
        System.out.println(definedConverter.convert(154));


        GenericModule.MaxFinding maxFinding = new GenericModule.MaxFinding<>(12);     // 4-th task
        System.out.println(maxFinding.put(16));
        System.out.println(maxFinding.getMaxValue());

    }
}
