package org.chapter02;

import java.util.Scanner;

public class Squarectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ʾ�����Σ�");
		System.out.print("�߳�Ϊ��");
		int a = scan.nextInt();
		putsq(a);
		
		System.out.println("��ʾ�����Σ�");
		System.out.print("��Ϊ��");
		int x = scan.nextInt();
		System.out.print("��Ϊ��");
		int y = scan.nextInt();
		puyta(x,y);
		scan.close();
	}
	
	public static void putChars(char c,int n)
	{
		while(n-- > 0)
		 {
			System.out.print(c);
		 }
		System.out.println();
	}
	
	public static void putsq(int n)
	 {
		for(int i = 1; i <= n; i++)
		 {
			putChars('+', n);
		 }
	 }
	
	public static void puyta(int w, int n)
	 {
		for(int i = 1; i <= w; i++)
		 {
			putChars('*', n);
		 }
	 }
}
