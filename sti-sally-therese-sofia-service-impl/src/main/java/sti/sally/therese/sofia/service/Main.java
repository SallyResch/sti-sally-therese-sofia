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
        main.service.createStudent("Sally", "Resch", 1583084833,vault.addAllCourses());

        System.out.println("Vilket personnummer har du? (10 siffror tack!)");
        Scanner s = new Scanner(System.in);
        try{
            int persNumber = s.nextInt();
            System.out.println(main.service.getStudent(persNumber));
        }catch(InputMismatchException ex){
            System.out.println("Aj, aj. Det där var inte rätt. Skriv ditt tiosiffriga personnummer, tack!");
        }


    }
}
