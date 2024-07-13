package org.example.studentmanager.model;

public class Student {
    private String name;
    private int StudentID;
    private String Department;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentID=" + StudentID +
                ", Department='" + Department + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
