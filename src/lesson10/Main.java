package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GenericModule.Defined defined = new GenericModule.Defined();  // 3-rd task
        System.out.println(defined.convert(1));


        GenericModule.MaxFinding maxFinding = new GenericModule.MaxFinding<>(12);     // 4-th task
        System.out.println(maxFinding.put(11));

    }
}
