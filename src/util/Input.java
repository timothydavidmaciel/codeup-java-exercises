package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    // Instance of Scanner

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Method of getString

    public String getString() {
        System.out.println("Input string...");
        return this.scanner.nextLine();
    }

    // Method of yesNo

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String input = this.scanner.nextLine();
        input = input.toLowerCase();
        switch(input) {
            case ("no"):
                return false;
            case ("n"):
                return false;
            case ("nope"):
                return false;
            case ("denied"):
                return false;
            case ("uh uh"):
                return false;
            case ("yes"):
                return true;
            case ("y"):
                return true;
            case ("yep"):
                return true;
            case ("sure"):
                return true;
            case ("si"):
                return true;
            case ("uh huh"):
                return true;
            case ("approved"):
                return true;
            case ("maybe"):
                System.out.println("Ain't you cute?");
                return yesNo();
            default:
                return yesNo();
        }

        // Method of getInteger

        public int getInteger(int min, int max) {
            int input;
            do {
                System.out.println("Enter a number between " + min + " and " + max + ".");
                input = this.scanner.nextInt();
                if (input < min || input > max) {
                    System.out.println("Input invalid");
                }
            } while (input < min || input > max);
            System.out.println("Input acceptable");
            return input;
        }

        // Method of getInt

        public int getInt() {
            System.out.println("Input number...");
            while (true) {
                try {
                    int userInput = Integer.valueOf(this.scanner.nextLine());
                    System.out.println("Input acceptable");
                    return userInput;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Input not an integer. Try again.");
                }
            }
        }

        // Method of getDouble with 2

        public double getDouble(double min, double max) {
            double input;
            do {
                System.out.println("Enter a number between " + min + " and " + max + ".");
                input = this.scanner.nextDouble();
                if (input < min || input > max) {
                    System.out.println("Input invalid");
                }
            } while (input < min || input > max);
            System.out.println("Input acceptable");
            return input;
        }


        // Method of getDouble

        public double getDouble() {
            System.out.println("Input number...");
            while (true) {
                try {
                    double userInput = Double.valueOf(getString());
                    System.out.println("Input acceptable");
                    return userInput;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Input not an double. Try again.");
                }
            }
        }

    }
}
