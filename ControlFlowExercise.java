import java.util.Scanner;

public class ControlFlowExercises {
    public ControlFlowExercises() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean decision = true;

        while(decision) {
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
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }

    }
}
