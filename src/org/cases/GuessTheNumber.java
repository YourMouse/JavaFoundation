package org.cases;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
	public static void main(String[] args) {
		int ran = new Random().nextInt(101);
		Scanner scan = new Scanner(System.in);
		System.out.print("�����������µ����֣�");
		int x = scan.nextInt();
		while(x != ran) 
		{
		    if(x < 0 || x > 100)
		    {
		    	System.out.print("����������ֲ����Ϲ������������룺");
		    }
			else if(x > ran)
			{
				System.out.print("��´��ˣ������²£�");
			}
			else
			{
				System.out.print("���С�ˣ������²£�");
			}
			x = scan.nextInt();
		}
		System.out.println("��ϲ�㣬�¶��ˣ�");
		scan.close();
	}
}
