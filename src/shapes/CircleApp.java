package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Okay, we are making a circle today!");
        System.out.println("What is the radius of the circle?");
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println("Your circumference is " + circle.getCircumference() + ".");
        System.out.println(("Your area is " + circle.getArea() + "."));
    }
}
