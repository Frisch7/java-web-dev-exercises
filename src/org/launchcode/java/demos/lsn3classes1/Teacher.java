package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
private String firstName;
private String lastName;
private String subject;
private Double yearsTeaching;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(Double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
