package org.chapter06;


//ö�ٱ���Ƴ���Ҳ��һ�ֵ������������ڹ��������ܱ�new���Է�ֹ���������ã��Ƚϰ�ȫ
public class EumnTest {
	public static void main(String[] args) {
	Season spring = Season.SPRING;
	Season springAgain = Season.SPRING;
	Season spring1 = Season.SUMMER;
	System.out.println(spring.showInfo());
		
	System.out.println(spring == springAgain);  //true ö��������ͬ��ö��
	System.out.println(spring == spring1);  //false��ö�����в�ͬ��ö��
	
	}
}


//ö�����е�ÿ��ö�ٶ��ǵ���ģʽ
enum Season {
	
	//����൱�ڵ����˴�������������˽�й��췽��
	SPRING("����","��ů����"),
	SUMMER("����","��������"),
	AUTUMN("����","�����ˬ"),
	WINTER("����","��������");
	
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