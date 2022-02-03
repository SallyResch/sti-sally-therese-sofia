package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;

import java.util.ArrayList;

public interface StiService {

    Student createStudent(String givenName, String surName, int persNumber, ArrayList<Course> coursesList);
    void getStudent();

    Course createCourse(int yhPoints, int courseCode, Teacher teacher, int hours, String courseName);
    Course removeCourse(Course course);

    /*
    Teacher createTeacher(String givenName, String surName, int persNummer, int salaryPerHour);
    */

}