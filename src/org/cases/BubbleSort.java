package org.cases;

public class BubbleSort {
	public static void main(String[] args) {
		int[] x = {5,9,6,4,8};
		System.out.print("ð�ݳ�ʼ���ݣ�");
		bianli(x);
		Kmaopao(x);
		System.out.print("ð�ݽ������ݣ�");
		bianli(x);
	}
	
	public static void bianli(int[] x)
	{
		for(int i = 0 ; i < x.length; i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	public static void Kmaopao(int[] x)
	{
		for(int i = 0; i < x.length-1; i++)
		{
			int temp = 0;
			for(int j = 0; j < x.length-1-i; j++)
			{
				if(x[j] > x[j+1])
				{
					temp = x[j+1];
					x[j+1] = x[j];
					x[j] = temp;
				}
			}
			System.out.print("��" + (i+1) + "�������" );
			bianli(x);
		}
	}
}
