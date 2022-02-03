package sti.sally.therese.sofia.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import sti.sally.therese.sofia.domain.Vault;

public class Main {
    private StiService service;
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-sally-therese-sofia-service.xml");
    private static Vault vault;

    public Main(StiService service){
        this.service=service;
    }

    public static void main(String[] args) {
        Main main = (Main) applicationContext.getBean("main");

        main.service.getStudent();
        main.service.createStudent("Sally", "Resch", 1583084833,vault.addAllCourses());
        main.service.createCourse(20,6,vault.teacher4, 160, "Advanced Charms");
        main.service.removeCourse(vault.allCourses);

    }
}
