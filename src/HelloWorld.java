package src;

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);
        String myString = "Taco";
        System.out.println(myString);
        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // The one above is show the value of x first but still adding 1 and the next is showing th current value of x
        // THe one below is showing the value of x with 1 added and the x is showing the current value
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
        int three = (int) "three";

        int x = 4;
        x += 5;

        int x = 3;
        int y = 4;
        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        // 14. doesn't it just reset it self?

    }
}
