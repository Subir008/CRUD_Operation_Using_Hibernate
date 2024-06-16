package Controller;

import java.util.Scanner;

import Dao.StudentDao;

public class DeleteById 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id to be Delete : ");
		int student_id = sc.nextInt();
		
		StudentDao studentdao = new StudentDao();
		
		studentdao.deleteById(student_id);
	}
}