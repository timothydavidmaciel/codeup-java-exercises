package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Testing in progress.");
        box1.getArea();
        System.out.println("The area is " + box1.getArea());
        box1.getPerimeter();
        System.out.println("The perimeter is " + box1.getPerimeter());
        System.out.printf("Testing is done.%n%n");

        Rectangle box2 = new Square(5);
        System.out.println("Testing in progress.");
        box2.getArea();
        System.out.println("The area is " + box2.getArea());
        box2.getPerimeter();
        System.out.println("The perimeter is " + box2.getPerimeter());
        System.out.println("Testing is done.");
    }
}


