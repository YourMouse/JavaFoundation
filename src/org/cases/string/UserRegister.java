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
		System.out.print("�������û�������");
		String userName = scan.nextLine();
		System.out.print("���������룺");
		String password = scan.nextLine();
		System.out.print("���ظ��������룺");
		String repassword = scan.nextLine();
		System.out.print("�������ڣ�");
		String birthday = scan.nextLine();
		System.out.print("�绰���룺");
		String telNumber = scan.nextLine();
		System.out.print("���䣺");
		String email = scan.nextLine();
		
		Check ck = Check.getCheck(); //��ֹÿ�ζ�ȥnew
		String result = ck.Chack(userName, password, repassword, birthday, telNumber, email);
		System.out.print("ע������" + result);
		scan.close();
	}
	
	public static void itinList()
	{
		User user1 = new User("����","suv123",new Date(),"13154234569","zz@123");
		User user2 = new User("����","123suv",new Date(),"17685626493","zq@321");
		UR.add(user1);
		UR.add(user2);
	}
}
