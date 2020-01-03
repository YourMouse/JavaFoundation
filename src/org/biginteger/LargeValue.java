package org.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

//用大整形数据类型（引用）包装起来，进行运算
//此算法根据c++改编的，java原本是没有的
public class LargeValue {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		while(input.hasNext())
//		{
			int n = input.nextInt();
			BigInteger ans = BigInteger.valueOf(n);
			for(int i = 1; i <= n; i++)
			{
				ans = ans.multiply(BigInteger.valueOf(i));
			}
			System.out.println(ans);
//		}
		input.close();
	}
	
}
