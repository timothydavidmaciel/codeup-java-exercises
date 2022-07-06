package shapes;
import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);
protected int length;
protected int width;

public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
}

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }


//    public static void main(String[] args) {
//        System.out.println("What is the length of the rectangle");
//        int lengthInput = scanner.nextInt();
//
//        System.out.println("What is the width of the rectangle");
//        int widthInput = scanner.nextInt();
//
//        System.out.println("Your area is " + getArea(lengthInput, widthInput));
//        System.out.println("Your perimeter is " + getPerimeter(lengthInput, widthInput));
//    }
}
