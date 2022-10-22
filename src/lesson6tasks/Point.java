package lesson6tasks;

public class Point {
    private double x;
    private double y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double calculateDistance (Point first, Point second) {
        return Math.sqrt((first.x - second.x) * (first.x - second.x) +
                (first.y - second.y) * (first.y - second.y));
    }
}
