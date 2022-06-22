package src;
import java.util.Scanner;

public class MethodsExercises {
    Scanner scanner = new Scanner(System.in);

    // Basic Arithmetic

    // Addition

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    // Subtraction

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    // Multiplication

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Division

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    // Modulus

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println(addition(3, 4));
        System.out.println(subtract(4, 3));
        System.out.println(multiply(4, 3));
        System.out.println(divide(4, 3));
        System.out.println(modulus(10, 3));
    }
}
