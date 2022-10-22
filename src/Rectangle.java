
public class Rectangle {
    public int length;
    public int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea (int length, int width) {
    return  length * width;
    }

    public int calculatePerimeter (int length, int width) {
    return (length + width) * 2;
    }

}

