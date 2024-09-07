/* File name:
	 
*/
package lv2.assignment2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class helps manage a group of students.
 * It has methods to add, remove, sort, and display students.
 */
public class StudentManagement {

    // This is a list to store student objects.
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * This method adds a student to the list.
     *
     * @param s the student to be added
     */
    public void addStudent(Student s) {
        students.add(s);
    }

    /**
     * This method removes a student from the list.
     *
     * @param s the student to be removed
     */
    public void removeStudent(Student s) {
        students.remove(s);
    }

    /**
     * This method sorts the students in the list.
     * It assumes that the Student class can be compared.
     */
    public void sortStudent() {
        Collections.sort(students);
    }

    /**
     * This method shows the details of all students in the list.
     * It uses the toString() method of each student to show the details.
     */
    public void display() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

