package sti.sally.therese.sofia.service;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;
import sti.sally.therese.sofia.domain.Vault;

import java.util.ArrayList;

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
    public Student getStudent(int persNumber) {
        if (persNumber == 1345678910) {
            Student student1 = vault.student1;
            student1.toString();
            return vault.student1;
        } else if (persNumber == 1345678914) {
            Student student2 = vault.student2;
            student2.toString();
            return vault.student2;
        } else if (persNumber == 1948674673) {
            Student student3 = vault.student3;
            student3.toString();
            return vault.student3;
        } else {
            System.out.println("Studenten finns inte!");
            return null;
        }
    }

    @Override
    public Course createCourse (int yhPoints, int courseCode, Teacher teacher, int hours, String courseName){
        Course course = new Course(yhPoints, courseCode, teacher, hours, courseName);
        //    LOGGER.trace("created student successfully");
            return null;
    }

    @Override
    public Course removeCourse (Course course){


        return null;
    }



    /* @Override
    public Teacher createTeacher (String givenName, String surName,int persNummer, int salaryPerHour){
         LOGGER.trace("created student successfully");
         return null;
    }*/



}
