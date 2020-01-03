package org.cases;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
	public static void main(String[] args) {
		int ran = new Random().nextInt(101);
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你所猜的数字：");
		int x = scan.nextInt();
		while(x != ran) 
		{
		    if(x < 0 || x > 100)
		    {
		    	System.out.print("你输入的数字不符合规则，请重新输入：");
		    }
			else if(x > ran)
			{
				System.out.print("你猜大了，请重新猜：");
			}
			else
			{
				System.out.print("你猜小了，请重新猜：");
			}
			x = scan.nextInt();
		}
		System.out.println("恭喜你，猜对了！");
		scan.close();
	}
}
