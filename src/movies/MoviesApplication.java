package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movieArray = MoviesArray.findAll();
        System.out.printf("Hello!, thanks for using our Movie Application%n%n");
        System.out.printf("1. Would you like to see a list of all the movies?%n" +
                "2. View movies in the animated category%n" +
                "3. View movies in the drama category%n" +
                "4. view movies in the horror category%n" +
                "5. view movies in the scifi category%n" +
                "0. Exit the application%n");

                int options = input.getInt();

        if (options == 0) {
            System.out.println("Please confirm you want to quit. (Y/N)");
            boolean confirmed = input.yesNo();
            if (confirmed) {
                System.exit(0);
            } else if (options == 1) {
                System.out.println(movieArray);
            }
        }

    }
}
