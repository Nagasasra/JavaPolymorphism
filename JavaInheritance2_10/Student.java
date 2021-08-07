package JavaInheritance2_10;

import java.util.Arrays;

public class Student extends Person {
    private int numCourses = 0;
    private String[] courses = {};
    private int[] grades = {};

    public Student(String name, String address) {
        super(name, address);
        courses = new String[30]; // maximum amount of courses are 30 for students
        grades = new int[30];
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses += 1;
    }
    public void printGrades() {
        for (int i=0; i<numCourses; ++i) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
    public double getAverageGrade () {
        double sum = 0;
        for (int i=0; i<numCourses; i++) {
            sum += grades[i];
        }
        return sum/numCourses;
    }
}
