package sti.sally.therese.sofia.unittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.sally.therese.sofia.domain.Student;

public class TestStudent {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-sally-therese-sofia-service.xml");

    private Student student;

    @Before
    public void before(){
        student = (Student) applicationContext.getBean("student");
    }

    @Test
    public void studentConstructor2Test(){
        Student student = new Student("Luna", "Lovegood", 1234567891);
        Assert.assertEquals("Luna", student.getGivenName());
        //Assert.assertNotEquals(nånting här);
    }
}
