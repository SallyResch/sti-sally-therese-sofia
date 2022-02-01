package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Courses;
import sti.sally.therese.sofia.domain.Students;
import sti.sally.therese.sofia.domain.Teacher;

import java.util.logging.Logger;

public interface StiService {
    //attribut
    Logger logger();
    Students student(String givenName, String surName, int persNumber, int courses);
    Teacher teacher(String givenName, String surName, int persNummer, int salaryPerHour);
    Courses course(int yhPoints, int courseCode, String teacher, int hours);

}
