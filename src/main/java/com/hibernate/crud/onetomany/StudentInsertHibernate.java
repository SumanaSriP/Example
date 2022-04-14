package com.hibernate.crud.onetomany;



	import java.util.HashSet;

import org.hibernate.HibernateException;
	import org.hibernate.Transaction;
	import org.hibernate.classic.Session;
import org.hsqldb.lib.Set;

import com.hibernate.util.HibernateUtil;

	public class StudentInsertHibernate {
		public void saveOneToManyHibernateMapping(Student student) {
			 
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null ;
			try {
				transaction = session.beginTransaction();
				session.save(student);
				transaction.commit();
			}catch(HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			}}
		
			public static void main(String[]args) {
				StudentInsertHibernate sh = new StudentInsertHibernate();
				Student student =new Student();
				student.setStudent_roll_no("101");
				StudentFees stu1=new StudentFees();
				stu1.getStudent_batch_year();
				stu1.setStudent_fees(200);
				StudentFees stu2 = new StudentFees();
				stu2.setStudent_batch_year(2);
				stu2.setStudent_fees(233);
				StudentFees stu3= new StudentFees();
				stu3.setStudent_batch_year(3);
				stu3.getStudent_fees();
				
				HashSet set= new HashSet();
				set.add(stu1);
				set.add(stu2);
				set.add(stu3);
				student.setStudentFees(set);
				sh.saveOneToManyHibernateMapping(student);;
				
			}}
				
			
		




