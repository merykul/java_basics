package lesson4;

public class AverageWithoutMinAndMax {
    public static void main (String[] args) {
        int[] array = {23, -1, 10, 12, 45};
        int max = array[0];
        int min = array[0];
        float sum = array[0];
        for(int i = 1; i < array.length; i++) {
            sum  += array[i];
            if(array[i] > max)
                max = array[i];
            else if(array[i] < min)
                min = array[i];
        }
        float x = ((sum - max - min) / (array.length - 2));
        System.out.println("Average without max and min elements: " + x);
    }
}
