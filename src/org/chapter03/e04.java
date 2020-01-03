package org.chapter03;

 class Person1 {
	 String name;
	 int age;
	 public Person1() {
	 }
	 public Person1(String n) {
	  name = n;
	 }
	 public Person1(String n, int a) {
	  name = n;
	  age = a;
	 }
	 public void show() {
	  System.out.println(name + "---"+ age);
	 }
	}

public class e04 {
	 public static void main(String[] args) {
		  Person1 p1 = new Person1();
		  Person1 p2 = new Person1("林青霞");
		  Person1 p3 = new Person1("林青霞",27);
		  p1.show();
		  p2.show();
		  p3.show();
		 }
}
