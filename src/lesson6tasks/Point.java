package lesson6tasks;

public class Point {
    public Point (double x1, double y1, double x2, double y2) {
        x1 = 2;
        y1 = 5;
        x2 = 4;
        y2 = 6;
    }
    public double Distance (double x1, double y1, double x2, double y2) {
       double result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); ;
       return result;
    }
}
