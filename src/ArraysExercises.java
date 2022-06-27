import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] human = new Person[3];
        human[0] = new Person("Dorothy");
        human[1] = new Person("Linda");
        human[2] = new Person("Steven");
        for (Person person : human) {
            System.out.println(person.getName());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        Person sophia = new Person("Sophia");
        human = addPerson(human, sophia);
        for (Person person : human) {
            System.out.println(person.getName());
        }
    }
}
