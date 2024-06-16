package Controller;

import Dao.StudentDao;

public class FetchAll
{
	public static void main(String[] args) 
	{
		StudentDao studentDao = new StudentDao();
		
		studentDao.fetchAll();
	}
}