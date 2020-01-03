package org.cases.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Check {
	//做成单例模式
	private static Check check = new Check();
	
	private HashSet<User> UR = new HashSet<User>(); 
	
	private Check(){}
	
	public static Check getCheck() {
		return check;
	}
	
	public String Chack(String userName, String password, String repassword, String birthday,String telNumber,String email) throws ParseException
	{
		int steat = 1;  //1为ture  2为false
		StringBuffer sb = new StringBuffer();
		
		//判断输入密码一致
		if(!(password.equals(repassword)))
		{
			sb.append("您输入的密码不一致，请重新输入!");
			steat = 2;
		}
		
		//判断输入日期格式
		//判断日期有10字符
		if(birthday.length() != 10)
		{
			sb.append("您输入的出生日期不合法，请重新输入!");
			steat = 2;
		}
		else
		{
			//判断第四位第七位是“ - ”
			for(int i = 0 ; i < birthday.length();i++)
			{
				Character thisChar = birthday.charAt(i);
				if(i == 4 || i == 7)
				{
					if(!(thisChar == '-'))
					{
						sb.append("您输入的出生日期不合法，请重新输入!");
						steat = 2;
					}
				}
				//除了第四位和第七位其他位数必须是数字
				else if(!(Character.isDigit(thisChar)))
				{
					sb.append("您输入的出生日期不合法，请重新输入!");
					steat = 2;
				}	
			}
		}
		//判断手机号格式，长度为11
		if(!(telNumber.length() == 11))
		{
			sb.append("您输入的电话号码不合法，请重新输入!");
			steat = 2;
		}
		else if(!(telNumber.startsWith("13") || telNumber.startsWith("15") || telNumber.startsWith("17") || telNumber.startsWith("18"))) 
		{
			sb.append("您输入的电话号码不合法，请重新输入!");
			steat = 2;
		}
		if(!(email.contains("@")))
		{
			sb.append("您输入的邮箱格式不合法，请重新输入!");
			steat = 2;
		}
		if(steat == 1 )
		{
			DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
			Date dateBirthday = null;
			dateBirthday = df.parse(birthday); //将字符串格式转换成日期格式
			
			User newur = new User(userName,password,dateBirthday,telNumber,email);
			if(!UR.add(newur))
			{
				sb.append("用户已存在!");
				steat = 2;
			}
			if(steat == 1)
			{
				sb.append("注册成功!");
			}
			
		}		
		return sb.toString();
	}
	
}
