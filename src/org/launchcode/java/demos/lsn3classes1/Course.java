package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private int number;
    private String courseName;
    private ArrayList<Student> roster;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student){
        roster.add(student);
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}
