package org.chapter03;

class Student{
	private String name;
	private String sex;
	public void setterName(String name)
	{
		this.name = name;
	}
	public String getterName()
	{
		return name;
	}
	public void setterSex(String sex)
	{
		this.sex = sex;
	}
	public void setterSex() 
	{
		this.setterSex("男");
	}
	public String getterSex()
	{
	return sex;	
	}
	public void introduce()
	{
		System.out.println("大家好，我叫"+name+"，是个"+sex+"的！");
	}
}
public class e03 {
 public static void main(String[] args) {
	Student stu = new Student();
	stu.setterName("艺行");
	stu.setterSex("女");
	stu.introduce();
}
}
