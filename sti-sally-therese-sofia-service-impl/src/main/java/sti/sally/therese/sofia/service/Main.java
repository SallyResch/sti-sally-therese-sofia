package sti.sally.therese.sofia.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private StiService service;
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-sally-therese-sofia.xml");

    public Main(StiService service){
        this.service=service;
    }

    public static void main(String[] args) {
        Main main = (Main) applicationContext.getBean("main");
        main.service.createStudent("Sally", "Resch", 1583084833);
        //anropa createStudent

      /* System.out.println("Vad vill du göra? \n 1.Hämta en student \n 2.Lägga till en Student \n 3.Lägga till/ta bort kurser för Student");
       Scanner snew = new Scanner(System.in);
       int val = snew.nextInt();
       if (val==1){
           Anropa student personnummer och verifiera
       }
       else if (val==2) {
           skapar input där man skriver in förnamn, efternamn, persNr, kurser den läser
       }
       else{
           Lägga till eller ta bort en kurs för en student
       }
        System.out.println("Okej, du heter....")
    }*/
    }
}
