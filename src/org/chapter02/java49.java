package org.chapter02;

public class java49 {
	public static void main(String[] args) 
	{
		int[] x= {9,8,3,5,2};
		System.out.print("Ã°ÅÝÇ°£º");
		bl(x);
		bobb(x);
		System.out.print("Ã°ÅÝºó£º");
		bl(x);
	}
	public static void bl(int[] arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void bobb(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("µÚ"+(i+1)+"´ÎÃ°ÅÝÅÅÐò:");
			bl(arr);
		}
	}
}
