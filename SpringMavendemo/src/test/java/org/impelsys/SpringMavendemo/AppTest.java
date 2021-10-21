package org.impelsys.SpringMavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

/**
 * Hello world!
 */
public class AppTest
    
{
   public static void main(String[] args)
   {
	   ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
	   System.out.println("Hello World!");
	   
	   Employee bean = (Employee) context.getBean("empBean1");
	   
	   //System.out.println("Emp name  " + bean.getName() + "  has been allocated: " + bean.getLaptopDevice1().getModelNum());
	   System.out.println(bean.getLaptopDevice1()!=null?bean.getLaptopDevice1().gettype():"No device assigned");
	   
	   
   }
}
    
