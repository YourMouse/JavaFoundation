package org.chapter06;


//枚举被设计出来也是一种单例，本身不存在构造器不能本new可以防止反射来调用，比较安全
public class EumnTest {
	public static void main(String[] args) {
	Season spring = Season.SPRING;
	Season springAgain = Season.SPRING;
	Season spring1 = Season.SUMMER;
	System.out.println(spring.showInfo());
		
	System.out.println(spring == springAgain);  //true 枚举类中相同的枚举
	System.out.println(spring == spring1);  //false：枚举类中不同的枚举
	
	}
}


//枚举类中的每个枚举都是单例模式
enum Season {
	
	//这个相当于调用了带有两个参数的私有构造方法
	SPRING("春天","春暖花开"),
	SUMMER("夏天","炎炎夏日"),
	AUTUMN("秋天","秋高气爽"),
	WINTER("冬天","寒风凛冽");
	
	private final String name;
	private final String desc;
	
	private Season(String name,String desc)
	{
		this.name = name;
		this.desc = desc;
	}

	public String showInfo() {
		return this.name + ":" + this.desc;
	}
}