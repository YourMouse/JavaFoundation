package org.cases.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Check {
	//���ɵ���ģʽ
	private static Check check = new Check();
	
	private HashSet<User> UR = new HashSet<User>(); 
	
	private Check(){}
	
	public static Check getCheck() {
		return check;
	}
	
	public String Chack(String userName, String password, String repassword, String birthday,String telNumber,String email) throws ParseException
	{
		int steat = 1;  //1Ϊture  2Ϊfalse
		StringBuffer sb = new StringBuffer();
		
		//�ж���������һ��
		if(!(password.equals(repassword)))
		{
			sb.append("����������벻һ�£�����������!");
			steat = 2;
		}
		
		//�ж��������ڸ�ʽ
		//�ж�������10�ַ�
		if(birthday.length() != 10)
		{
			sb.append("������ĳ������ڲ��Ϸ�������������!");
			steat = 2;
		}
		else
		{
			//�жϵ���λ����λ�ǡ� - ��
			for(int i = 0 ; i < birthday.length();i++)
			{
				Character thisChar = birthday.charAt(i);
				if(i == 4 || i == 7)
				{
					if(!(thisChar == '-'))
					{
						sb.append("������ĳ������ڲ��Ϸ�������������!");
						steat = 2;
					}
				}
				//���˵���λ�͵���λ����λ������������
				else if(!(Character.isDigit(thisChar)))
				{
					sb.append("������ĳ������ڲ��Ϸ�������������!");
					steat = 2;
				}	
			}
		}
		//�ж��ֻ��Ÿ�ʽ������Ϊ11
		if(!(telNumber.length() == 11))
		{
			sb.append("������ĵ绰���벻�Ϸ�������������!");
			steat = 2;
		}
		else if(!(telNumber.startsWith("13") || telNumber.startsWith("15") || telNumber.startsWith("17") || telNumber.startsWith("18"))) 
		{
			sb.append("������ĵ绰���벻�Ϸ�������������!");
			steat = 2;
		}
		if(!(email.contains("@")))
		{
			sb.append("������������ʽ���Ϸ�������������!");
			steat = 2;
		}
		if(steat == 1 )
		{
			DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
			Date dateBirthday = null;
			dateBirthday = df.parse(birthday); //���ַ�����ʽת�������ڸ�ʽ
			
			User newur = new User(userName,password,dateBirthday,telNumber,email);
			if(!UR.add(newur))
			{
				sb.append("�û��Ѵ���!");
				steat = 2;
			}
			if(steat == 1)
			{
				sb.append("ע��ɹ�!");
			}
			
		}		
		return sb.toString();
	}
	
}
