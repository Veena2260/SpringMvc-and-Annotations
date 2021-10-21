package org.impelsys.StudentDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Profile;
import com.example.Student;
public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
     /*Student student = (Student) context.getBean("student");
       System.out.println("Name : " + student.getName() );
       System.out.println("Age : " + student.getAge() );*/
       Profile profile = (Profile) context.getBean("profile");
       profile.printAge();
       profile.printName();
   }
}