import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String []args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        // 0 to 100 (real quick)
//        int start = 0;
//        do {
//            System.out.println(start);
//            start += 2;
//        } while (start <= 100);

        // 100 to -10
//        int start = 100;
//        do {
//            System.out.println(start);
//            start -= 5;
//        } while (start >= -10);

        // square
//        long start = 2;
//        do {
//            System.out.println(start);
//            start *= start;
////             start = (int) Math.pow(start, 2);
//        } while (start <= 1000000);

        // FOR LOOP
        // 100 to -10

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
        // FOR LOOP
        // squares
//        for(long i = 2; i <= 10000000; i*=i) {
//            System.out.println(i);
//        }

        // FizzBuzz
//        for (int c = 1; c <= 100; c++) {
//            if (c % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (c % 5 == 0){
//                System.out.println("Buzz");
//            } else if (c % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(c);
//            }
//        }


        // Luis solution
//        for(int c = 1; c <= 100; c++) {
//            if (c % 15 == 0) System.out.println("FizzBuzz");
//            else if (c % 5 == 0) System.out.println("Buzz");
//            else if (c % 3 == 0) System.out.println("Fizz");
//            else System.out.println(c);
//        }

        // Display Table of Powers
        Scanner sc = new Scanner(System.in);

//        boolean decision = true;
//
//        while(decision) {
//            System.out.println("Please enter a number.");
//            int userNum = sc.nextInt();
//            String title = "Here is your table!\n\nnumber | squared | cubed\n------ | ------- | -----";
//            System.out.println(title);
//            for (long table = 1; table <= userNum; table++) {
//                long squared = table * table;
//                long cubed = table * table * table;
//                System.out.printf("%-6d | %-7d | %-5d %n", table, squared, cubed);
//            }
//            System.out.println("Do you want to enter another number? (Y/N)");
//            String userChoice = sc.next();
//            if(userChoice.equalsIgnoreCase("n")) {
//                decision = false;
//            }
//        }

        // GRADES

        boolean decision = true;

        while (decision) {
            System.out.println("Please enter your grade (0 - 100)");
            int userGrade = sc.nextInt();
            if (userGrade > 0 && userGrade <= 59) {
                System.out.println('F');
            } else if (userGrade > 59 && userGrade <= 66) {
                System.out.println('D');
            } else if (userGrade > 66 && userGrade <= 79) {
                System.out.println('C');
            } else if (userGrade > 79 && userGrade <= 87) {
                System.out.println('B');
            } else if (userGrade > 87 && userGrade <= 100) {
                System.out.println('A');
            }
            System.out.println("Do you want to enter another grade? (Y/N)");
            String userChoice = sc.next();
            if(userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }

    }
}
