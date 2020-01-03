package org.cases.string;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class UserRegister {
	private static HashSet<User> UR = new HashSet<User>();
	public static void main(String[] args) throws ParseException {
		itinList();
		Scanner scan= new Scanner(System.in);
		System.out.print("请输入用户姓名：");
		String userName = scan.nextLine();
		System.out.print("请输入密码：");
		String password = scan.nextLine();
		System.out.print("请重复输入密码：");
		String repassword = scan.nextLine();
		System.out.print("出生日期：");
		String birthday = scan.nextLine();
		System.out.print("电话号码：");
		String telNumber = scan.nextLine();
		System.out.print("邮箱：");
		String email = scan.nextLine();
		
		Check ck = Check.getCheck(); //防止每次都去new
		String result = ck.Chack(userName, password, repassword, birthday, telNumber, email);
		System.out.print("注册结果：" + result);
		scan.close();
	}
	
	public static void itinList()
	{
		User user1 = new User("张震","suv123",new Date(),"13154234569","zz@123");
		User user2 = new User("周齐","123suv",new Date(),"17685626493","zq@321");
		UR.add(user1);
		UR.add(user2);
	}
}
