
public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea () {
    return  this.length * this.width;
    }

    public int calculatePerimeter () {
    return (this.length + this.width) * 2;
    }

}

