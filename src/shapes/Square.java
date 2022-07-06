package shapes;

public class Square {
    class Square extends Rectangle{
        public Square(int side) {
            getArea(side, side);
        }

        public static int getArea(int length,int width) {
            int area = side * side;
            return area;
        }

        public static int getPerimeter(int length, int width) {
            int perimeter = (4 * side);
            return perimeter;
        }
    }
}
