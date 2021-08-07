package JavaInheritance2_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses = {};

    public Teacher(String name, String address) {
        super(name, address);
    }
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public String[] getCourses() {
        return courses;
    }

    public boolean addCourse(String course) {
        if (new ArrayList<>(Arrays.asList(courses)).contains(course) || courses.length == 5) {
            return false; // course already exists and courses can't exceed 5 for teachers
        }
        else {
            numCourses += 1;
            String[] newCourses = new String[numCourses]; // creating new array
            for (int i=0; i<numCourses-1; i++) { // using loop to add courses from old array to the new array
                newCourses[i] = courses[i];
            }
            newCourses[numCourses-1] = course; // adding new course to the array
            this.courses = newCourses; // replacing the old array
            return true;
        }
    }
    public boolean removeCourse(String course) {
        if (!new ArrayList<>(Arrays.asList(courses)).contains(course)) {
            return false; // course doesn't exist
        }
        else {
            numCourses -= 1;
            String[] newCourses = new String[numCourses]; // creating new array
            for (int i1=0, i2=0; i2<numCourses; i1++, i2++) { // using loop to add courses from old array to the new array (excluding the one meant to be removed)
                if (courses[i1].equals(course)) {
                    i2--;
                }
                else {
                    newCourses[i2] = courses[i1];
                }
            }
            this.courses = newCourses; // replacing the old array
            return true;
        }
    }
}
