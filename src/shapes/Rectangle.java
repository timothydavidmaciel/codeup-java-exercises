package shapes;
import java.util.Scanner;

public class Rectangle {
    Scanner scanner = new Scanner(System.in);
private int area;
private int getPerimeter;


    public static int getArea(int length,int width) {
        int area = length * width;
        return area;
    }

    public static int getPerimeter(int length, int width) {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public static void main(String[] args) {
        System.out.println("What is the length of the rectangle");
        int lengthInput = scanner.nextInt();

        System.out.println("What is the width of the rectangle");
        int widthInput = scanner.nextInt();

        System.out.println("Your area is " + getArea(lengthInput, widthInput));
        System.out.println("Your perimeter is " + getPerimeter(lengthInput, widthInput));
    }
}
