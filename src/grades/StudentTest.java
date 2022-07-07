package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Name Test
        Student test1 = new Student("john");
        System.out.println(test1.getName());

        // Add Grade Test
        test1.addGrade(98);
        test1.addGrade(95);
        test1.addGrade(91);
        test1.addGrade(83);
        test1.addGrade(79);
        for (int i = 0; i < test1.getGrades().size(); i++) {
            System.out.println(test1.getGrades().get(i));
        }

        // Grade Average Test
        System.out.println(test1.getGradeAverage());
    }
}
