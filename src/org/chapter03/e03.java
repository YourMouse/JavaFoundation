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
		this.setterSex("��");
	}
	public String getterSex()
	{
	return sex;	
	}
	public void introduce()
	{
		System.out.println("��Һã��ҽ�"+name+"���Ǹ�"+sex+"�ģ�");
	}
}
public class e03 {
 public static void main(String[] args) {
	Student stu = new Student();
	stu.setterName("����");
	stu.setterSex("Ů");
	stu.introduce();
}
}
