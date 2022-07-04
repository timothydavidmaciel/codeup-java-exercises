import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newHuman) {
        Person[] human = Arrays.copyOf(array, array.length + 1);
        human[array.length] = newHuman;
        return human;
    }

    public static void main(String[] args) {
        Person[] humans = new Person[3];

        humans[0] = new Person("Timothy");
        humans[1] = new Person("Ralph");
        humans[2] = new Person("Larry");

        for (Person humanName : humans) {
            System.out.println(humanName.getName());

            System.out.println("Adding new human......");
            Person Joey = new Person("Joey");
            humans = addPerson(humans, Joey);
            for (Person humanNames : humans) {
                System.out.println(humanNames.getName());
            }
        }
    }
}
