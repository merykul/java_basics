package lesson14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        string = string.replaceAll("[^a-zA-Z ]", "");
        String[] words = string.split(" ");

        Map createdMap = toMap(words);
        System.out.println(createdMap);

        System.out.println(averageOfValues(createdMap)); // 28

        Map hexNumbers = new HashMap<>();
        System.out.println(createMap(hexNumbers));

        System.out.println(deleteToLongValue(createdMap));

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

    public static <K> Map<K, Integer> deleteToLongValue(Map<K, Integer> map) {
        Set<String> tobeDeleted = new HashSet<>();
        for (Map.Entry<K, Integer> pair : map.entrySet()) {
            int x = pair.getValue();
            if (x >= 5) {
                tobeDeleted.add((String) pair.getKey());
            }
        }
        for (String str : tobeDeleted) {
            map.remove(str);
        }
        return map;
    }

    public static long averageOfValues(Map map) {
        long count = map.values().stream().count();
        long sum = 0;
        long avg = 0;
        for (int i = 0; i < map.size(); i++) {
            sum += i;
        }
        return avg = sum / count;
    }

// 2-nd task

    public static Map createMap(Map map) {
        for (int i = 1; i <= 1000; i++) {
            map.put((i), Integer.toHexString(i));
        }
        return map;
    }

}
