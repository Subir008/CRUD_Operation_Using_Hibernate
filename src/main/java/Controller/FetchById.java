package Controller;

import java.util.Scanner;

import Dao.StudentDao;
import Dto.Student;

public class FetchById 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentDao studentdao = new StudentDao();
		
		System.out.println("Enter Student Id To Fetch The Data : ");
		int student_id = sc.nextInt();
		
		studentdao.fetchById(student_id);
		
		
	}
}