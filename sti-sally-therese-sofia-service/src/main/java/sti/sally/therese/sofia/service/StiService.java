package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;

import java.util.ArrayList;

public interface StiService {

    Student createStudent(String givenName, String surName, int persNumber, ArrayList<Course> coursesList);
    Student getStudent(int persNumber);

    Course createCourse(int yhPoints, int courseCode, String teacher, int hours);
    Course removeCourse(Course course);

    /*
    Teacher createTeacher(String givenName, String surName, int persNummer, int salaryPerHour);
    */

}