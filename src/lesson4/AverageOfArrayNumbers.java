package lesson4;

public class AverageOfArrayNumbers {
    public static void main (String[] args) {
        int [] array = {4, 5, 89, 2, 96};
        System.out.println("Average of all elements is: " + findAverage(array));
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double findAverage(int[] array) {
        int sum = findSum(array);
        return (double) sum / array.length;
    }
}
