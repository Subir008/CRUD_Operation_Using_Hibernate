package Controller;

import java.util.Scanner;

import Dao.StudentDao;
import Dto.Student;

public class Update 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id Want To Updated : ");
		int student_id = sc.nextInt();
		
		System.out.println("Enter Student Name Want To Updated : ");
		String student_name = sc.next();
				
		System.out.println("Enter Student Class Want To Updated : ");
		int student_class = sc.nextInt();
		
		System.out.println("Enter Student Contact Want To Updated : ");
		String student_contact = sc.next();
		
		Student student = new Student();
		StudentDao studentdao = new StudentDao();
		
		student.setStudent_id(student_id);
		student.setStudent_name(student_name);
		student.setStudent_class(student_class);
		student.setStudent_contact(student_contact);
		
		studentdao.update(student);
	}
}