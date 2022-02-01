package sti.sally.therese.sofia.domain;


public class Teacher {
    private String givenName;
    private String surName;
    private int persNummer;
    private int salaryPerHour;
    //List of courses


    public Teacher(String givenName, String surName, int persNummer, int salaryPerHour) {
        this.givenName = givenName;
        this.surName = surName;
        this.persNummer = persNummer;
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

    public int getPersNummer() {
        return persNummer;
    }

    public void setPersNummer(int persNummer) {
        this.persNummer = persNummer;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
