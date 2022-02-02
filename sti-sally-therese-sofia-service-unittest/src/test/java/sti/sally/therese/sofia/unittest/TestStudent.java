package sti.sally.therese.sofia.unittest;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.sally.therese.sofia.domain.Student;

public class TestStudent {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-sally-therese-sofia.xml");

    private Student student;

    @Before
    public void before(){
        student = (Student) applicationContext.getBean("service");
    }


    //public void before(){
    //        forestService = (ForestService)applicationContext.getBean("forestService");
    //    }

}
