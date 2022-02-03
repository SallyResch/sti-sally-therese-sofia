package sti.sally.therese.sofia.domain;

public class Course {
private int yhPoints;
private int courseCode;
private Teacher teacher;
private int hours;
private String courseName;

    public Course(int yhPoints, int courseCode, Teacher teacher, int hours, String courseName) {
        this.yhPoints = yhPoints;
        this.courseCode = courseCode;
        this.teacher = teacher;
        this.hours = hours;
        this.courseName = courseName;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString(){
        return courseName;
    }
}
