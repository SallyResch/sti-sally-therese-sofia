package sti.sally.therese.sofia.service;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;
import sti.sally.therese.sofia.domain.Vault;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StiServiceImpl implements StiService {

    //private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);
    private Vault vault;
    public StiServiceImpl(){}
    public StiServiceImpl(Vault vault) {
        this.vault = vault;
    }

    @Override
    public Student createStudent(String givenName, String surName, int persNumber, ArrayList<Course> coursesList) {
        Student student = new Student(givenName, surName, persNumber, coursesList);
     //   LOGGER.trace("created student successfully");
        return student;
    }

    @Override
    public void getStudent() {
        System.out.println("Vilket personnummer har du? (10 siffror tack!)");
        Scanner s = new Scanner(System.in);
        try {
            int persNumberInput = s.nextInt();
            if (persNumberInput == 1345678910) {
                Student student1 = vault.student1;
                System.out.println(student1.toString());
            } else if (persNumberInput == 1345678914) {
                Student student2 = vault.student2;
                System.out.println(student2.toString());
            } else if (persNumberInput == 1948674673) {
                Student student3 = vault.student3;
                System.out.println(student3.toString());
            } else {
                System.out.println("Studenten finns inte!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Aj, aj. Det där var inte rätt. Skriv ditt tiosiffriga personnummer, tack!");
        }

    }

    @Override
    public Course createCourse (int yhPoints, int courseCode, Teacher teacher, int hours, String courseName){
        Course course = new Course(yhPoints, courseCode, teacher, hours, courseName);
        //    LOGGER.trace("created course successfully");
            return null;
    }

    @Override
    public Course removeCourse (ArrayList<Course> courseList){
   /*     System.out.println("Vilken kurs vill du ta bort? Ange kurskoden.");
        Scanner s = new Scanner(System.in);
        try{
            int courseNumber = s.nextInt();
            if()
        }catch(InputMismatchException e){
            System.out.println("Aj, aj. Det där var inte rätt. Skriv kurskoden, tack!");
        }
        course.remove(course2);*/
        return null;
    }



    /* @Override
    public Teacher createTeacher (String givenName, String surName,int persNummer, int salaryPerHour){
         LOGGER.trace("created student successfully");
         return null;
    }*/



}
