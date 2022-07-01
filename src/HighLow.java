import java.util.Scanner;

public class HighLow {
    private static Scanner scanner = new Scanner(System.in);

    public static String helloUser() {
        String greetUser = "Hello, what is your name?";
        System.out.println(greetUser);
        String userFirstInput = scanner.next();

    }

    public static void main(String[] args) {
        helloUser();
    }
}
