package org.chapter04;

interface Animal1{
	void shout();
}

class Cat1 implements Animal1{
	public void shout()
	{
		System.out.println("����");
	}
	public void sleep()
	{
		System.out.println("è��˯��");
	}
}

class Dog implements Animal1{
	public void shout()
	{
		System.out.println("����");
	}
}

public class duotai {
public static void main(String[] args) {
	Animal1 c = new Cat1();
	Animal1 a = new Dog(); 
	Cat1 cat = (Cat1) a;

}
}
