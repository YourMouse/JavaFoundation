package org.chapter04;

public class Student {
	public static void main(String[] args) {
		try 
		 {
			int result = divide(4,0);
			System.out.println(result);
		 }
		catch(Exception e)
		 {
			System.out.println("��ĸ����Ϊ0"); 
			return ;
		 }
		finally 
		 {
			System.out.println("��ĸ����Ϊ0"); 
		 }
	}
	public static int divide(int x, int y)throws Exception
	{
		return x / y;
	}
}






