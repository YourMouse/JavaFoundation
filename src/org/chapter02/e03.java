package org.chapter02;

public class e03 {
	public static void main(String[] args) {
		int grade=5;
		if(grade>=90) 
			{
			System.out.println("A级");
			}
		else if(grade>=80) 
			{
			System.out.println("B级");
			}
		else if(grade>=70) 
			{
			System.out.println("C级");
			}
		else if(grade>=60) 
			{
			System.out.println("D级");
			}
		else if(grade>=0) 
			{
			System.out.println("E级");
			}
		else 
			{
			System.out.println("不合法");
			}
	}
}
