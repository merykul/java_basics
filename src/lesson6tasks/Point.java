package lesson6tasks;

public class Point {
    private double x;
    private double y;
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double calculateDistance (Point first) {
        return Math.sqrt(Math.pow((this.x - first.x), 2) + Math.pow((this.y - first.y), 2));
    }
}
