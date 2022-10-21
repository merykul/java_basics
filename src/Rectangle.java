
public class Rectangle {
    public int lengthOfObject;
    public int widthOfObject;
    public Rectangle(int lengthOfObject, int widthOfObject) {
        this.lengthOfObject = lengthOfObject;
        this.widthOfObject = widthOfObject;
    }

    public int area (int lengthOfObject, int widthOfObject) {
    return  lengthOfObject * widthOfObject;
    }

    public int perimeter (int lengthOfObject, int widthOfObject) {
    return (lengthOfObject + widthOfObject) * 2;
    }

}

