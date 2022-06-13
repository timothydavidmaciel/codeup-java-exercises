import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        //Need to be explain below
        System.out.format("The value of pi is approximately %.2f%n", pi);
        Scanner scan = new Scanner(System.in);
        //Need to be explain below
        scan.useDelimiter("\n");
        System.out.println("Gimme 3 words");
        String one = scan.next();
        String two = scan.next();
        String three = scan.next();
        //Need to be explain the % with char
        System.out.printf("You said:%n %s%n %s%n %s%n", one, two, three);
        System.out.println("Hey what's the length of your room?");
        double length = Double.parseDouble(scan.next());
        System.out.println("Hey what's the width of your room?");
        double width = Double.parseDouble(scan.next());
        System.out.printf("A room with a length of %f and width of %f results in an area of %f and perimeter of %f", length, width, length * width, length * 2.0D + width * 2.0D);
    };
}
