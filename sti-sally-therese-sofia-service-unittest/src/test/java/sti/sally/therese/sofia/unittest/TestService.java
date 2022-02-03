package sti.sally.therese.sofia.unittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sti.sally.therese.sofia.domain.Student;
import sti.sally.therese.sofia.service.StiService;
import sti.sally.therese.sofia.domain.Vault;


public class TestService {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-sally-therese-sofia-service.xml");
    private Student student;
    private StiService stiService;
    private Vault vault;
    @Before
    public void before(){
        stiService = (StiService) applicationContext.getBean("service");
    }

    @Test
    public void studentConstructorTest(){
        Student student = new Student("Luna", "Lovegood", 1234567890,vault.allCourses);
        Assert.assertEquals("Luna", student.getGivenName());
    }
}


