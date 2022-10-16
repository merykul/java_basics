
public class Rectangle {
    public Rectangle(int lengthOfObject, int widthOfObject) {
        lengthOfObject = 0;
        widthOfObject = 0;
    }

    public int Area (int lengthOfObject, int widthOfObject) {
    int area = 0;
    area = lengthOfObject * widthOfObject;
    return area;
    }

    public int Perimeter (int lengthOfObject, int widthOfObject) {
    int perimeter = 0;
    perimeter = (lengthOfObject + widthOfObject) * 2;
    return perimeter;
    }

}

