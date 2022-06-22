package src;
import java.util.Scanner;

public class Bob {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your question?");
    String userResponse = sc.nextLine();
    if(userResponse.endsWith("?")) {
        System.out.println("Sure.");
    } else if (userResponse.endsWith("!")) {
        System.out.println("Whoa, chill out!");
    } else if (userResponse.isEmpty()) {
        System.out.println("Fine. Be that way!");
    } else {
        System.out.println("Whatever.");
    }
}
}
