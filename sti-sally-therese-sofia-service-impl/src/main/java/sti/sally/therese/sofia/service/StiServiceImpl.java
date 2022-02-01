package sti.sally.therese.sofia.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sti.sally.therese.sofia.domain.Courses;
import sti.sally.therese.sofia.domain.Students;
import sti.sally.therese.sofia.domain.Teacher;

public class StiServiceImpl implements StiService {

    private static final Logger LOGGER= LoggerFactory.getLogger(StiServiceImpl.class);


    @Override
    public Students createStudent(String givenName, String surName, int courses) {
        LOGGER.trace("created student successfully");
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
