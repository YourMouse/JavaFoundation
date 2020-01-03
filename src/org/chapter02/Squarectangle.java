package org.chapter02;

import java.util.Scanner;

public class Squarectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("显示正方形：");
		System.out.print("边长为：");
		int a = scan.nextInt();
		putsq(a);
		
		System.out.println("显示长方形：");
		System.out.print("长为：");
		int x = scan.nextInt();
		System.out.print("宽为：");
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
