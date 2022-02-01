package sti.sally.therese.sofia.domain;

public class Courses {
int yhPoints;
int courseCode;
String teacher;
int hours;
//int nrOfCourses;
    public Courses(int yhPoints, int courseCode, String teacher, int hours, int nrOfCourses) {
        this.yhPoints = yhPoints;
        this.courseCode = courseCode;
        this.teacher = teacher;
        this.hours = hours;
        //this.nrOfCourses= nrOfCourses;
    }

    public int getYhPoints() {
        return yhPoints;
    }

    public void setYhPoints(int yhPoints) {
        this.yhPoints = yhPoints;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /*public int getNrOfCourses() {
        return nrOfCourses;
    }

    public void setNrOfCourses(int nrOfCourses) {
        this.nrOfCourses = nrOfCourses;
    }*/
}
