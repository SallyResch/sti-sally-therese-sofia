package sti.sally.therese.sofia.service;

import sti.sally.therese.sofia.domain.Courses;
import sti.sally.therese.sofia.domain.Students;
import sti.sally.therese.sofia.domain.Teacher;

public class StiServiceImpl implements StiService {

    @Override
    public Students createStudent(String givenName, String surName, int courses) {
        return null /* eller att det händer något annat? */;
    }

    @Override
    public Teacher createTeacher(String givenName, String surName, int persNummer, int salaryPerHour) {
        return null /* eller att det händer något annat? */;
    }

    @Override
    public Courses createCourse(int yhPoints, int courseCode, String teacher, int hours) {
        return null /* eller att det händer något annat? */;
    }
}
