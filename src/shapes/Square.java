package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}


//Inheritance and Poly down below

//public class Square extends Rectangle {
//        public Square(int side) {
//            super(side, side);
//        }
//
//    @Override
//    public int getArea() {
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * length;
//    }
//
//}
