package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create the objects
			Instructor tempInstructor = new Instructor("Jess", "Cav", "Jess@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube2", "Luv 2 Sleep!!!");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			//
			// Note: this will ALSO save the details object
			// because of CascadeType.ALL = save the actual object and associated objects - 
			// - or - will cascade to any object associated with it
			System.out.println("Saving Instructor: " + tempInstructor);
			session.save(tempInstructor);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}

	}

}
