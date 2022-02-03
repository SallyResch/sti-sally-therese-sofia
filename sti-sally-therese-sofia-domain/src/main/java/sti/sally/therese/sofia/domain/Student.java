package sti.sally.therese.sofia.domain;

import java.util.ArrayList;

public class Student {
    private String givenName;
    private String surName;
    private int persNumber;
    ArrayList<Course> coursesList;
    private Vault vault;

    //constructor 1
    public Student(String givenName, String surName, int persNumber, ArrayList<Course> coursesList){
        this.givenName = givenName;
        this.surName = surName;
        this.persNumber = persNumber;
        this.coursesList = coursesList;
    }

    public String getGivenName() {return givenName;}

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public long getPersNumber() {
        return persNumber;
    }

    public void setPersNumber(int persNumber) {
        this.persNumber = persNumber;
    }

    public ArrayList<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString(){
        Course course1 = vault.course1;
        Course course2 = vault.course2;
        Course course3 = vault.course3;
        Course course4 = vault.course4;
        Course course5 = vault.course5;
        return "Studenten heter: " + givenName + " " + surName + " och går kurserna: " + course1.toString() + ", " + course2.toString() + ", " + course3.toString() + ", " + course4.toString() + " och " + course5.toString();
    }
}