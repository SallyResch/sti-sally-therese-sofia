package sti.sally.therese.sofia.domain;


public class Teacher {
    private String givenName;
    private String surName;
    private int persNumber;
    private int salaryPerHour;


    public Teacher(String givenName, String surName, int persNumber, int salaryPerHour) {
        this.givenName = givenName;
        this.surName = surName;
        this.persNumber = persNumber;
        this.salaryPerHour = salaryPerHour;
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

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
