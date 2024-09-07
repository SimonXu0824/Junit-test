/* 
*/
package lv2.assignment2;

/**
 * This class represents a student.
 * It includes the student's name, ID, email, and grade.
 */
public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private String email;
    private double grade;

    /**
     * Constructor to create a new student.
     *
     * @param name  the name of the student
     * @param id    the ID of the student
     * @param email the email of the student
     * @param grade the grade of the student
     */
    public Student(String name, int id, String email, double grade) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.grade = grade;
    }

    /**
     * Gets the student's name.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student's ID.
     *
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the student's ID.
     *
     * @param id the new ID of the student
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the student's email.
     *
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email.
     *
     * @param email the new email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the student's grade.
     *
     * @return the grade of the student
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the student's grade.
     *
     * @param grade the new grade of the student
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return a string with the student's details
     */
    @Override
    public String toString() {
        return "Student{name=" + "'" + this.name + "'" + "," + 
               "id=" + this.id + "," + 
               "email=" + "'" + this.email + "'" + "," +
               "grade=" + this.grade + "}";
    }

    /**
     * Compares this student with another student by grade.
     * This is used to sort students by their grades.
     *
     * @param otherStudent the other student to compare with
     * @return -1 if this student's grade is less, 1 if it is greater, and 0 if they are equal
     */
    @Override
    public int compareTo(Student otherStudent) {
        if (this.grade < otherStudent.grade) {
            return -1;
        }
        if (this.grade > otherStudent.grade) {
            return 1;
        }
        return 0;
    }
}
