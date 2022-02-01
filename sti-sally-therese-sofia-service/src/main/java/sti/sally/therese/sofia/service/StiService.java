package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Courses;
import sti.sally.therese.sofia.domain.Students;
import sti.sally.therese.sofia.domain.Teacher;

import java.util.logging.Logger;

public interface StiService {
    //Logger logger();
    Students createStudent(String givenName, String surName, int courses);
    Teacher createTeacher(String givenName, String surName, int persNummer, int salaryPerHour);
    Courses createCourse(int yhPoints, int courseCode, String teacher, int hours);

}
/*int persNumber,*/