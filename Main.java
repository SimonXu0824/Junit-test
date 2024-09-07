/* 
*/
package lv2.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main class to test the functionality of Student and StudentManagement classes.
 */
public class Main {
    public static void main(String[] args) {
        // Create some student objects
        Student student1 = new Student("Alice", 1, "alice@example.com", 3.5);
        Student student2 = new Student("Bob", 3, "bob@example.com", 3.8);
        Student student3 = new Student("Charlie", 2, "charlie@example.com", 3.2);
        Student student4 = new Student("Diana", 4, "diana@example.com", 3.9);
        
        // Create an array of students
        Student[] students = { student1, student2, student3, student4 };
        
        // Print the array before sorting
        System.out.println("Array before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        
        System.out.println(); // Empty line for separation
        
        // Sort the array of students
        System.out.println("Array after sorting:");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
        
        // Create a StudentManagement object to manage the students
        StudentManagement studentList = new StudentManagement();
        
        // Add students to the StudentManagement object
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);
        
        System.out.println(); // Empty line for separation
        
        // Print the list of students before sorting
        System.out.println("ArrayList before sorting:");
        studentList.display();
        
        System.out.println(); // Empty line for separation
        
        // Sort the list of students
        studentList.sortStudent();
        
        // Print the list of students after sorting
        System.out.println("ArrayList after sorting:");
        studentList.display();
    }
}
