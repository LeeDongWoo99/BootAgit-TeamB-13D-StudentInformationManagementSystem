package org.example.studentmanager.model;

public class Student {

    private int id;
    private String name;
    private String Department;
    private int year;

    public Student(int id, String name, String department, int year) {
        this.id = id;
        this.name = name;
        Department = department;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {

    }
}
