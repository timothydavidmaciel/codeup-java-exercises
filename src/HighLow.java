import java.util.Scanner;

public class HighLow {
    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean letsPlay = true;
        int numOfGuess = 3;

        System.out.println("Hello, what is your name?");
        String userFirstInput = scanner.next();

        System.out.printf("Well Hello " + userFirstInput + ".%nDo you want to play game? (Y/N)%n");
        String userSecondInput = scanner.next();

        if (userSecondInput.equalsIgnoreCase("y")) {
            System.out.println("Then let the game begin!");
        } else {
            System.out.println("Well your no fun!");
            System.exit(0);
        }

        System.out.printf("%nWe will be playing a guessing game.%nYou will pick a number between 1 and 100.%nYou will have three tries to guess the correct number.%nWhat is your first guess?%n");
        int userThirdInput = scanner.nextInt();


            for (int i = 1; i <= numOfGuess; i++) {
                if (userThirdInput != randomNumber) {
                    if (i == numOfGuess) {
                        System.out.printf("Yikes! You have no more tries left " + userFirstInput + "%n%nThe number was " + randomNumber + " %n%nYOU LOSE!");
                        System.exit(0);
                    }

                    if (userThirdInput < randomNumber) {
                        System.out.println("You need to guess Higher!");
                    } else {
                        System.out.println("You need to guess Lower!");
                    }

                    System.out.printf("You have " + (numOfGuess - i) + " tries left!%n%nPlease try again.%n");

                } else {
                    System.out.printf("%n%nLucky Guess " + userFirstInput + "!");
                    System.exit(0);
                }

                userThirdInput = scanner.nextInt();
            }

        }

    public static void main (String[]args){
        helloUser();
    }
}
