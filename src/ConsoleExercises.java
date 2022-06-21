package src;
import java.util.Scanner;

public class ConsoleExercises {

    // Main Method
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        // How to use format??
        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + pi + ". %n%n", "", "");
        //
        System.out.println("Please enter a number");
        int userNum = scanner.nextInt();
        System.out.println("You entered " + userNum + ".");
        //
        System.out.println("Please type out three words.");
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();
        System.out.printf("You entered:%n %s %s %s %n %n", one, two, three);
        // why does it skip it?
        System.out.println("Please enter a sentence.");
        String test1 = scanner.nextLine();
        System.out.println(test1);
          //
        System.out.println("What is the length of the classroom?");
        int classLength = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width of the classroom?");
        int classWidth = Integer.parseInt(scanner.nextLine());
        System.out.printf("Your length was %d and your width was %d. When you combine them together you will get the area of %d and a perimeter of %d", classLength, classWidth, classLength * classWidth, (classLength * 2) + (classWidth *2));
    };
};
