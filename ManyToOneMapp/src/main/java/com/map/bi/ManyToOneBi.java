package com.map.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class ManyToOneBi {

	  ManyToOneBi() {
		// TODO Auto-generated constructor stub
	}
	static SessionFactory sf=null;
	public static void main(String[] args)
	{
		Employee emp=new Employee("Employee1",25000);
		Employee emp1=new Employee("Employee2",45000);
		Employee emp2=new Employee("Employee3",55000);
			
		Company cmp= new Company("IGATE","Mumbai");
		Company cmp1= new Company("XENTO","PUNE");
			
		emp.setCompany(cmp);
		emp1.setCompany(cmp1);
		emp2.setCompany(cmp1);
		
		Session session=getSessionFatory().openSession();
		Transaction transaction=session.beginTransaction();
		
		//session.save(cmp);
		//session.save(cmp1);
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
