package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String toString() {
        return "name: " + name + "\ngrades:" + grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }

        double average = (sum / grades.size());

        return average;
    }

}
