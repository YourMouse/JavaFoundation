package org.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

//�ô������������ͣ����ã���װ��������������
//���㷨����c++�ı�ģ�javaԭ����û�е�
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
