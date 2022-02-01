package sti.sally.therese.sofia.domain;

import java.util.ArrayList;

public class Vault {

    public static void database (){
        Teacher hagrid = new Teacher("Rubeus", "Hagrid",1133224455, 220);
        Teacher minerva = new Teacher("Minerva", "McGonagoll", 1010303022,243);
        Teacher severus = new Teacher("Severus", "Snape", 139472648, 230);
        Teacher filius = new Teacher("Filius", "Flitwick", 1807462850, 236);

        Course kurs1 = new Course (25,1,severus,200, "Defence against dark arts");
        Course kurs2 = new Course (30, 2,minerva,240,"Transfiguration");
        Course kurs3 = new Course(20, 3,severus, 160,"Potions");
        Course kurs4 = new Course (25, 4, hagrid,200, "Care of Magical Creatures");
        Course kurs5 = new Course(25,5,filius, 230, "Charms");

        //harrys lista på kurser
        ArrayList<Course> harrysCourses = new ArrayList<>();
        harrysCourses.add(kurs1);
        harrysCourses.add(kurs4);

        //hermiones lista på kurser
        ArrayList<Course> hermionesCourses = new ArrayList<Course>();
        hermionesCourses.add(kurs1);
        hermionesCourses.add(kurs2);
        hermionesCourses.add(kurs3);
        hermionesCourses.add(kurs4);
        hermionesCourses.add(kurs5);

        //rons lista på kurser
        ArrayList<Course> ronsCourses = new ArrayList<Course>();
        ronsCourses.add(kurs1);
        ronsCourses.add(kurs2);
        ronsCourses.add(kurs4);

        Student harry = new Student("Harry","Potter", 1345678910, harrysCourses);
        Student hermione = new Student("Hermione", "Granger", 1345678914, hermionesCourses);
        Student ron = new Student ("Ron", "Weasley", 1948674673, ronsCourses);
    }
}
