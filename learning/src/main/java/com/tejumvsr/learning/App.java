package com.tejumvsr.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tejumvsr.learning.dsa.dp.Recursion;
import com.tejumvsr.learning.dsa.linkedlist.LinkedList;
import com.tejumvsr.learning.dsa.queue.Queue;
import com.tejumvsr.learning.dsa.stack.DStack;
import com.tejumvsr.learning.model.Laptop;
import com.tejumvsr.learning.model.Student;
import com.tejumvsr.learning.spring.AppConfig;
import com.tejumvsr.learning.spring.Samsung;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("running main program");
//		App.springMainFunc(null);
	}

	private static void hibernateMainFunc() {
		Student st = new Student();
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		SessionFactory sessionFactory = cfg.buildSessionFactory(registry);

		Session session = sessionFactory.openSession();

		// ******* testing second level cache START ************

		/*
		 * session.beginTransaction(); st = session.get(Student.class, 1); st =
		 * session.get(Student.class, 1); // level 1 cache works by default within the
		 * same session // System.out.println(st); session.getTransaction().commit();
		 * session.close();
		 * 
		 * Session session2 = sessionFactory.openSession(); session2.beginTransaction();
		 * st = session2.get(Student.class, 1); // System.out.println(st);
		 * session2.getTransaction().commit(); session2.close();
		 */

		// ******* testing second level cache END ************

		// ******* testing second level cache with query START ************

		/*
		 * session.beginTransaction(); Query q1 =
		 * session.createQuery("from Student where id=1"); q1.setCacheable(true); st =
		 * (Student)q1.uniqueResult(); // System.out.println(st);
		 * session.getTransaction().commit(); session.close();
		 * 
		 * Session session2 = sessionFactory.openSession(); session2.beginTransaction();
		 * Query q2 = session2.createQuery("from Student where id=1");
		 * q2.setCacheable(true); st = (Student)q2.uniqueResult(); //
		 * System.out.println(st); session2.getTransaction().commit(); session2.close();
		 */

		// ******* testing second level cache with query END ************

		// creating a new entity with transaction
		// get the entity
//				st = session.get(Student.class, 1);
//				System.out.println(st);
//		if(st == null) {
//
//			Laptop laptop = new Laptop();
//			laptop.setlId(1);
//			laptop.setlName("MacBook Pro");
//
//			StudentName name = new StudentName();
//			name.setfName("Thejaswini");
//			name.setmName("Melanahalli");
//			name.setlNmae("Shivarudraiah");
//
//			st = new Student();
//			st.setsRollNo(1);
//			st.setsName(name);
//			st.setsAge(25);
//			st.getLaptops().add(laptop);
//
//			laptop.getStudents().add(st);
//			Transaction transaction = session.beginTransaction();
//			session.persist(laptop);
//			session.persist(st);
//			transaction.commit();
//		}
	}

	private static void recursionMainFunc() {
		int n = 1;
		int sum = Recursion.sumOfNNaturalNumbers(n);
		System.out.println("Sum of " + n + " natural numbers is " + sum);

		n = 100;
		sum = Recursion.sumOfNNaturalNumbers(n);
		System.out.println("Sum of " + n + " natural numbers is " + sum);

		n = 1;
		sum = Recursion.sumOfNOddNaturalNumbers(n);
		System.out.println("Sum of " + n + " odd natural numbers is " + sum);

		n = 10;
		sum = Recursion.sumOfNOddNaturalNumbers(n);
		System.out.println("Sum of " + n + " odd natural numbers is " + sum);

		n = 1;
		sum = Recursion.sumOfNEvenNaturalNumbers(n);
		System.out.println("Sum of " + n + " even natural numbers is " + sum);

		n = 10;
		sum = Recursion.sumOfNEvenNaturalNumbers(n);
		System.out.println("Sum of " + n + " even natural numbers is " + sum);
	}

	private static void queueMainFunc(String[] args) {
		System.out.println("****** Queue Practice****");
		Queue queue = new Queue();
		System.out.println(queue.isEmpty());
		System.out.println("Size : " + queue.size());
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println("Size : " + queue.size());
		queue.show();
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println("Size : " + queue.size());
		queue.show();
		queue.dequeue();
		queue.dequeue();
		System.out.println("Size : " + queue.size());
		queue.show();
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println("Size : " + queue.size());
		queue.show();
	}

	private static void stackMainFunc(String[] args) {
//		System.out.println("****** Stack Practice****");
//
//		Stack stack = new Stack();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//
//		stack.show();
//		stack.peek();
//
//		stack.pop();
//		stack.show();
//
		System.out.println("****** Dynamic Stack Practice****");
		DStack dStack = new DStack();
		dStack.push(10);
		dStack.push(20);
		System.out.println(dStack.size());
		dStack.push(30);
		dStack.push(40);
		System.out.println(dStack.size());
		dStack.push(50);
		dStack.push(60);
		dStack.show();
		System.out.println(dStack.size());
		dStack.pop();
		dStack.pop();
		dStack.pop();
		dStack.pop();
		dStack.pop();
		dStack.show();
		System.out.println(dStack.size());
		dStack.push(50);
		dStack.push(60);
		dStack.show();
	}

	private static void LLMainFunc(String[] args) {
		System.out.println("******Linked List Practice****");

		// *****Linked List *****
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insertAtStart(5);

		list.insertAt(2, 15);
		list.show();

		list.deleteAt(2);

		System.out.println();
		System.out.println("Final List");
		list.show();
	}

	private static void springMainFunc(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//      Vehicle vehicle = (Vehicle) context.getBean("car");
//      vehicle.drive();
//      Tyre ty = (Tyre)context.getBean("tyre");
//      System.out.println(ty);
//      ((ClassPathXmlApplicationContext) context).close();

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
		((AnnotationConfigApplicationContext) factory).close();
	}
}
