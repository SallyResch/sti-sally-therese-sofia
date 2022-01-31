package sti.sally.therese.sofia.domain;


public class Teacher {
    String givenName;
    String surName;
    int persNummer;
    int salaryPerHour;
    //List of courses


    public Teacher(String givenName, String surName, int persNummer, int salaryPerHour) {
        this.givenName = givenName;
        this.surName = surName;
        this.persNummer = persNummer;
        this.salaryPerHour = salaryPerHour;
    }
}
