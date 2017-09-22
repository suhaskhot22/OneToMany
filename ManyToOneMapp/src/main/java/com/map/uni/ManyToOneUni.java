package com.map.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ManyToOneUni {

	
	static SessionFactory sf=null;
	public static void main(String[] args)
	{
		Employee emp=new Employee("FirstEmp",30000);
		Employee emp1=new Employee("SecondEmp",40000);
		Employee emp2=new Employee("ThirdEmp",50000);
			
		Company cmp= new Company("Cognizant","Pune");
		
		emp.setCompany(cmp);
		emp1.setCompany(cmp);
		emp2.setCompany(cmp);
		
		Session session=getSessionFatory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(cmp);
		session.save(emp);
		session.save(emp1);
		session.save(emp2);
		
		transaction.commit();
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		
		session.flush();
		session.close();
		

		 
		
		

	}
	private static SessionFactory getSessionFatory() {
	  if(null==sf)
		    return new AnnotationConfiguration().configure().buildSessionFactory();
	  
		return sf;
	}

}
