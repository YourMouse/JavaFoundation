package org.chapter06;

import java.util.HashSet;
import java.util.Set;

class Student {	
	 String name;
	 String age;
	 public Student(String name, String age) {
	  this.name = name;
	  this.age = age;
	 }
	 public String toString() {
		  return name + ":" + age;
		 }
	}


public class e1{
 public static void main(String[] args) {
  Set<Student> set = new HashSet<Student>();
  set.add(new Student("Tom", "10"));
  set.add(new Student("Jerry", "10"));
  set.add(new Student("Tom", "10"));
  System.out.println(set);
 }
}