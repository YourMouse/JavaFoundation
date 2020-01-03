package org.cases;

public class BubbleSort {
	public static void main(String[] args) {
		int[] x = {5,9,6,4,8};
		System.out.print("冒泡初始数据：");
		bianli(x);
		Kmaopao(x);
		System.out.print("冒泡结束数据：");
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
			System.out.print("第" + (i+1) + "次排序后：" );
			bianli(x);
		}
	}
}
