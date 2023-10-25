package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDAO;

public class App 
{
    public static void main( String[] args ){
       ApplicationContext context = new ClassPathXmlApplicationContext("orm.xml");
       StudentDAO studentDao = (StudentDAO) context.getBean("studentDao");	
       
       Student student = new Student(1,"Pooja","Pune");
       int r = studentDao.insert(student);
       
       System.out.println("Added "+r);
    }
}
