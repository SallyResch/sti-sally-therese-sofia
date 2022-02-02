package sti.sally.therese.sofia.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sti.sally.therese.sofia.domain.Course;
import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.domain.Teacher;
import sti.sally.therese.sofia.domain.Vault;

import java.util.ArrayList;

public class StiServiceImpl implements StiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StiServiceImpl.class);
    private Vault vault;

    public StiServiceImpl(Vault vault) {
        this.vault = vault;
    }

    @Override
    public Student createStudent(String givenName, String surName, int persNummer, ArrayList<Course> coursesList) {
        Student student = vault.addStudent(new Student(givenName, surName, persNummer, coursesList));
        LOGGER.trace("created student successfully");
        return student;
    }

    @Override
    public Student createStudent(String givenName, String surName, int persNummer) {
        Student student = vault.addStudent(new Student(givenName, surName, persNummer));
        LOGGER.trace("created student successfully");
        return student;
    }

    @Override
    public Student createStudent(int persNummer) {
        if (persNummer == 1345678910) {
            //anropa metoden tostring för harry studenten
        } else if (persNummer == 1345678914) {
            //anropa metoden tostring för hermione studenten
        } else if (persNummer == 1948674673) {
            //anropa metoden tostring för ron studenten
        } else {
            System.out.println("Studenten finns inte!");
        }

        Student student = vault.addStudent(new Student(persNummer));
        LOGGER.trace("created student successfully");
        return student; /* eller att det händer något annat? */
    }


        @Override
        public Teacher createTeacher (String givenName, String surName,int persNummer, int salaryPerHour){
            LOGGER.trace("created student successfully");
            return null /* eller att det händer något annat? */;
        }

        @Override
        public Course createCourse ( int yhPoints, int courseCode, String teacher,int hours){
            LOGGER.trace("created student successfully");
            return null /* eller att det händer något annat? */;
        }


        //vad vill du göra?
        //1 hämta student
        //a (ange personnummer)
        //b nu visas studentens namn + kursnamnen
        //2. skapa student
        //använd konstruktorn
        //3. lägg till/ta bort kurs



        /*välkommenmetoden

        System.out.println("Välkommen till STI!\n1. Vill du veta mer om studenter?\n2. Vill du veta mer om lärare?\n3.Vill du veta mer om kurser?");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        if(val==1){
            anropa createStudentmetoden från StiServiceImpl
        }else if(val==2){
            anropa createTeachermetoden från StiServiceImpl
        }else if(val==3){
            anropa createCoursemetoden från StiServiceImpl
        }*/

    /*public static void studentsMeny (){
        try{System.out.println("Skriv in personnummer: ");
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
    }
        }catch(Exception e){}

    */

}
