package sti.sally.therese.sofia.domain;

public class Students {
    private String givenName;
    private String surName;
    private int persNumber;
    private int courses;

    public Students(String givenName, String surName, int persNumber, int courses){
        this.givenName = givenName;
        this.surName = surName;
        this.persNumber = persNumber;
        this.courses = courses;

    }

    public String getGivenName() {
        return givenName;
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

    public int getPersNumber() {
        return persNumber;
    }

    public void setPersNumber(int persNumber) {
        this.persNumber = persNumber;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
