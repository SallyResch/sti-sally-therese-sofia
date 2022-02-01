package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;

public interface StiService {
    //Logger logger();
    Student createStudent(String givenName, String surName, int courses);
    Teacher createTeacher(String givenName, String surName, int persNummer, int salaryPerHour);
    Course createCourse(int yhPoints, int courseCode, String teacher, int hours);

}
/*int persNumber,*/