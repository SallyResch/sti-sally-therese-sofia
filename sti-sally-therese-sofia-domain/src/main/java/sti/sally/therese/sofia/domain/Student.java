package sti.sally.therese.sofia.domain;

import java.util.ArrayList;

public class Student {
    private String givenName;
    private String surName;
    private int persNumber;
    ArrayList<Course> coursesList;

    //constructor 1
    public Student(String givenName, String surName, int persNumber, ArrayList<Course> coursesList){
        this.givenName = givenName;
        this.surName = surName;
        this.persNumber = persNumber;
        this.coursesList = coursesList;
    }

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
        return "Studenten heter: " + givenName + " " + surName + " och går kurserna: " + coursesList;
    }
}