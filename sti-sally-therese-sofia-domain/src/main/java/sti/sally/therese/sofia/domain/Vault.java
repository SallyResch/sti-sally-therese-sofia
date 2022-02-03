package sti.sally.therese.sofia.domain;

import java.util.ArrayList;

public class Vault {

    public static ArrayList<Course> allCourses = addAllCourses();
    public static ArrayList<Student> allStudents =addAllStudents();
    public static ArrayList<Teacher> allTeachers =addAllTeachers();

    public static Teacher teacher1 = new Teacher("Rubeus", "Hagrid", 1133224455, 220);
    public static Teacher teacher2 = new Teacher("Minerva", "McGonagoll", 1010303022, 243);
    public static Teacher teacher3 = new Teacher("Severus", "Snape", 139472648, 230);
    public static Teacher teacher4 = new Teacher("Filius", "Flitwick", 1807462850, 236);

    public static Course course1 = new Course(25, 1, teacher3, 200, "Defence against dark arts");
    public static Course course2 = new Course(30, 2, teacher2, 240, "Transfiguration");
    public static Course course3 = new Course(20, 3, teacher3, 160, "Potions");
    public static Course course4 = new Course(25, 4, teacher1, 200, "Care of Magical Creatures");
    public static Course course5 = new Course(25, 5, teacher4, 230, "Charms");

    public static Student student1 = new Student("Harry", "Potter", 1345678910, allCourses);
    public static Student student2 = new Student("Hermione", "Granger", 1345678914, allCourses);
    public static Student student3 = new Student("Ron", "Weasley", 1948674673, allCourses);

    public static ArrayList<Teacher> addAllTeachers(){
        ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
        allTeachers.add(teacher1);
        allTeachers.add(teacher3);
        allTeachers.add(teacher2);
        allTeachers.add(teacher4);
        return allTeachers;
    }
    public static ArrayList<Student> addAllStudents() {
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        return allStudents;
    }
    public static ArrayList<Course> addAllCourses() {
        ArrayList<Course> allCourses = new ArrayList<Course>();
        allCourses.add(course1);
        allCourses.add(course2);
        allCourses.add(course3);
        allCourses.add(course4);
        allCourses.add(course5);
        return allCourses;
    }

    public static ArrayList<Course> getCourses() {
        return allCourses;
    }

    public String toString (){
        for(Course course:allCourses){
            return course.getCourseName();
        }
        return null;
    }
}
