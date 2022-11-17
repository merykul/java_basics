package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        String[] words = string.split(" ");

        Map createdMap = toMap(words);
        System.out.println(createdMap);

        System.out.println(averageOfValues(createdMap)); // 28

    }
// 1-st task
    public static <K> Map<K, Integer> toMap(K[] ks) {
        Map<K, Integer> data = new HashMap<>();
        for (int i = 0; i < ks.length; i++) {
            if (data.containsKey(ks[i])) {
                data.put(ks[i], data.get(ks[i]) + 1);
            } else {
                data.put(ks[i], 1);
            }
        }
        return data;
    }

    /*public static <K> Map<K, Integer> deleteToLongValue(Map map) {
        for (int i = 0; i < map.size(); i++) {
            if (map.containsValue(i) => 5){
                map.remove(i, i);
            }
        }
    }*/

    public static long averageOfValues(Map map) {
        long count = map.values().stream().count();
        long sum = 0;
        long avg = 0;
        for (int i = 0; i < map.size(); i++) {
            sum += i;
        }
        return avg = sum / count;
    }

}
