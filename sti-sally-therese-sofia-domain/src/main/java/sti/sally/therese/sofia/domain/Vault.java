package sti.sally.therese.sofia.domain;

import java.util.ArrayList;
import java.util.List;

public class Vault {

    static List<Course> allCourses;
    static List<Course> harrysCourses;
    static List<Course> hermionesCourses;
    static List<Course> ronsCourses;
    static List<Student> allStudents;
    static List<Teacher> allTeachers;

    static Teacher hagrid = new Teacher("Rubeus", "Hagrid", 1133224455, 220);
    static Teacher minerva = new Teacher("Minerva", "McGonagoll", 1010303022, 243);
    static Teacher severus = new Teacher("Severus", "Snape", 139472648, 230);
    static Teacher filius = new Teacher("Filius", "Flitwick", 1807462850, 236);

    static Course kurs1 = new Course(25, 1, severus, 200, "Defence against dark arts");
    static Course kurs2 = new Course(30, 2, minerva, 240, "Transfiguration");
    static Course kurs3 = new Course(20, 3, severus, 160, "Potions");
    static Course kurs4 = new Course(25, 4, hagrid, 200, "Care of Magical Creatures");
    static Course kurs5 = new Course(25, 5, filius, 230, "Charms");

    static Student harry = new Student("Harry", "Potter", 1345678910, addAllCourses());
    static Student hermione = new Student("Hermione", "Granger", 1345678914, addHermionesCourses());
    static Student ron = new Student("Ron", "Weasley", 1948674673, addRonsCourses());


    public Vault() {
        allCourses = addAllCourses();
        harrysCourses = addHarrysCourses();
        hermionesCourses = addHermionesCourses();
        ronsCourses = addRonsCourses();
        allStudents = addAllStudents();
        allTeachers = addAllTeachers();
    }

    //metoder för att lägga till/ta bort kurser

    public static ArrayList<Teacher> addAllTeachers(){
        ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
        allTeachers.add(hagrid);
        allTeachers.add(severus);
        allTeachers.add(minerva);
        allTeachers.add(filius);
        return allTeachers;
    }

    public Student addStudent(Student student){
        allStudents.add(student);
        return student;
    }
    public Course addCourse(Course course){
        allCourses.add(course);
        return course;
    }
    public static void removeCourse(Course course){
        allCourses.remove(course);
    }

    public Teacher addTeacher(Teacher teacher){
        allTeachers.add(teacher);
        return teacher;
    }

    public static ArrayList<Student> addAllStudents() {
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(harry);
        allStudents.add(hermione);
        allStudents.add(ron);
        return allStudents;

    }

    public static ArrayList<Course> addAllCourses() {
        ArrayList<Course> allCourses = new ArrayList<Course>();
        allCourses.add(kurs1);
        allCourses.add(kurs2);
        allCourses.add(kurs3);
        allCourses.add(kurs4);
        allCourses.add(kurs5);
        return allCourses;
    }

    public static ArrayList<Course> addHarrysCourses() {
        ArrayList<Course> harrysCourses = new ArrayList<>();
        harrysCourses.add(kurs1);
        harrysCourses.add(kurs4);
        return harrysCourses;
    }
    public static ArrayList<Course> addHermionesCourses() {
        ArrayList<Course> hermionesCourses = new ArrayList<Course>();
        hermionesCourses.add(kurs1);
        hermionesCourses.add(kurs2);
        hermionesCourses.add(kurs3);
        hermionesCourses.add(kurs4);
        hermionesCourses.add(kurs5);
        return hermionesCourses;
    }
    public static ArrayList<Course> addRonsCourses() {
        ArrayList<Course> ronsCourses = new ArrayList<Course>();
        ronsCourses.add(kurs1);
        ronsCourses.add(kurs2);
        ronsCourses.add(kurs4);
        return ronsCourses;
    }

    public static ArrayList<Course> addNewStudentCourses() {
        ArrayList<Course> newStudentCourses = new ArrayList<Course>();
        //lägg till valfria kurser och valfritt antal kurser

        return newStudentCourses;
    }
}
