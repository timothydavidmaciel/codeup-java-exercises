package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}

//Inheritance and Poly down below

//public class Rectangle {
//protected int length;
//protected int width;
//
//public Rectangle(int length, int width) {
//    this.length = length;
//    this.width = width;
//}
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//}
