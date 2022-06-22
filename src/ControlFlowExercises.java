import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While Loop

//        int i = 5;
//        while (i <= 15) {
//          System.out.println(i + " ");
//          i++;
//        };

        // Do While Loop

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        //Count backwards by 5

//        int i = 100;
//        do {
//          System.out.println(i);
//          i -= 5;
//        } while (i >= -10);

        // Do While to 1mil!

//        long atTwo = 2;
//        do {
//            System.out.println(atTwo);
//            atTwo *= atTwo;
//        } while (atTwo <= 1000000);

        // While loop but with For loop instead

//        for (int i = 5; i <= 15; i+=1) {
//            System.out.println(i);
//        };

        // Do While Loop counting to 100

//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }

        // Do While Loop counting backwards to -10

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

        // Do While up 1mil but with For Loop

//        for (long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        };

        // FizzBuzz

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        // The Table of Power!!!
//
//        boolean theWay = true;
//
//        while(theWay) {
//            System.out.println("Please enter a number.");
//            int userInput = scanner.nextInt();
//            String tableSetup = "Here is you table!\n\nnumber | squared | cubed\n------ | ------- | -----";
//            System.out.println(tableSetup);
//            for (long table = 1; table <= userInput; table++) {
//                long squared = table * table;
//                long cubed = table * table * table;
//                System.out.printf("%-6d | %-7d | %-5d %n", table, squared, cubed);
//            }
//            System.out.println("Do you want to enter another number? (Y/N)");
//            String userChoice = scanner.next();
//            if (userChoice.equalsIgnoreCase("n")) {
//                theWay = false;
//            }
//        }

        // Grades!!!!!!

        boolean decision = true;

//        while (decision) {
//            System.out.println("Please enter your grade (0 - 100)");
//            int userGrade = scanner.nextInt();
//            if (userGrade > 0 && userGrade <= 59) {
//                System.out.println('F');
//            } else if (userGrade > 59 && userGrade <= 66) {
//                System.out.println('D');
//            } else if (userGrade > 66 && userGrade <= 79) {
//                System.out.println('C');
//            } else if (userGrade > 79 && userGrade <= 87) {
//                System.out.println('B');
//            } else if (userGrade > 87 && userGrade <= 100) {
//                System.out.println('A');
//            }
//            System.out.println("Do you want to enter another grade? (Y/N)");
//            String userChoice = scanner.next();
//            if(userChoice.equalsIgnoreCase("n")) {
//                decision = false;
//            }
//        }
    }
}
