package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        boolean valid;

        Student student1 = new Student("John");
        Student student2 = new Student("Tim");
        Student student3 = new Student("Larry");
        Student student4 = new Student("Jerry");

        student1.addGrade(99);
        student1.addGrade(98);
        student1.addGrade(97);

        student2.addGrade(96);
        student2.addGrade(95);
        student2.addGrade(94);

        student3.addGrade(93);
        student3.addGrade(92);
        student3.addGrade(91);

        student4.addGrade(90);
        student4.addGrade(89);
        student4.addGrade(88);

        students.put("tacoMan", student1);
        students.put("pacoMan", student2);
        students.put("tataMan", student3);
        students.put("picoMan", student4);


        //TODO: Test code
//        System.out.println(students.values());

        System.out.println("Bypassing security measurements, please wait.......");
        System.out.println("....................................................");
        System.out.println("WARNING!!! You have enter an restricted area! Keyloggers have been activated. Enter at your own risk!");
        System.out.printf("%nWelcome!%n");
        System.out.printf("%nHere are the GitHub usernames of our students:%n");

        for (String key : students.keySet()) {
            System.out.printf("%n" + key);
        }

        valid = false;

do {
    System.out.printf("%n%nWhat student would you like to see more information on?%n");
    String usernameInput = scanner.next();

    if (usernameInput.equals("tataMan") || usernameInput.equals("picoMan") || usernameInput.equals("pacoMan") || usernameInput.equals("tacoMan")) {
        System.out.println("Here is the current information for the username " + usernameInput);
        System.out.println(students.get(usernameInput));
    } else {
        System.out.printf("Sorry, no student found with the GitHub username of \"%s\"%n", usernameInput);
    }

    System.out.printf("%nWould you like to see another student?%n");
    if (input.yesNo()) {
        valid = true;
    } else {
        System.out.println("Goodbye, and have a wonderful day!");
        System.exit(0);
    }
} while (valid);
    }
}


