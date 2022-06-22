package src;

public class Person {

    // Person Info?

    private String name;

    public String getName(){
    return this.name;
    }

    public void setName(String name){
    this.name = name;
    }
    public void sayHello(){
        System.out.println(this.name);
    }

    public Person(String name) {
        this.name = name;
    }


    // Main Method

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
