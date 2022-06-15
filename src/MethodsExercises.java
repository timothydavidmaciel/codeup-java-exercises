import java.util.Scanner;

public class MethodsExercises {
    // 1. Basic Arithmetic

    // Add
    public static int addition(int num1, int num2) {
        return num1+ num2;
    }
    // Subtract
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    // Multiply
//    public static long multiply(long num1, long num2) {
//        return num1 * num2;
//    }

//    public static int multiply(int num1, int num2) {
//        int sum = 0;
//
//        for(int i = 1; i <= num1; i++) {
//            sum = sum + num2;
//        }
//        return sum;
//    }

//    public static double multiply(double num1, double num2, double product) {
//        double sum = product;
//        if (num2 <= 0) {
//            return product;
//        } else {
//            sum += num1;
//        }
//        return multiply(num1, num2 -1, sum);
//    }

    // Divide
    public static double divide(double num1, double num2) {
        return num1/num2;
    }

    // Modulus
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
        if(userInput < min || userInput > max) {
            return getInteger(min, max);
        }
        return userInput;

    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        String willContinue;
        do {
            int userInput = getInteger(1, 5);

            long userFactorial = 1;
            System.out.print(userInput + "! = ");
            for (int i = 1; i <= userInput; i++) {
                userFactorial *= i;
                if (i == userInput) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.println(userFactorial);
            System.out.println("Do you want to continue? (yes/no)");
            willContinue = sc.next();
        } while(willContinue.equalsIgnoreCase("yes"));
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int numberOfSides = sc.nextInt();
        int firstDie = (int)(Math.random() * numberOfSides) + 1;
        int secondDie = (int)(Math.random() * numberOfSides) + 1;

        System.out.printf("%d is the value of the first roll\n%d is the value of the second roll.", firstDie, secondDie);
    }



    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);


//        System.out.println(addition(12, 3));
//        System.out.println(subtract(12, 3));
//        multiply();
//        System.out.println(divide(20, 5));
//        System.out.println(modulus(19, 5));
//        System.out.println(multiply(5, 5, 0));
//        System.out.println("What is the first number?");
//        int num1 = scan.nextInt();
//        System.out.println("What is the second number?");
//        int num2 = scan.nextInt();
//        System.out.println(multiply(num1, num2));
//        System.out.println(getInteger(1, 10));
//        factorial();
        diceRoll();


    }
}