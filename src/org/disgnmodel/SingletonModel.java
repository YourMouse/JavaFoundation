package org.disgnmodel;

import java.lang.reflect.Constructor;

//单例设计模式(饿汉式)  Runtime类就是单例典型
class Singleton {
	private Singleton() {
		
	}
	
	private static Singleton sl = new Singleton();
	private String name = "张三";
	public String getName() {
		return name;
	}
	
	public static Singleton getSl() {
		return sl;
	}
	
	public void invalidate()
	{
		sl = null;
	}
}


public class SingletonModel{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		
		//1.获得反射入口
		Class clazz = Class.forName("model.Singleton");
		
		Constructor con = clazz.getDeclaredConstructor(null);
		System.out.println(con);
		con.setAccessible(true);
		System.out.println(con);
		Singleton test1 = (Singleton)clazz.newInstance();
		Singleton test2 = (Singleton)clazz.newInstance();
		System.out.println(test1 == test2);
		
		
		
		
		
		/*Singleton s = Singleton.getSl();
		Singleton s1 = Singleton.getSl();
		System.out.println(Singleton.getSl());
		System.out.println(s == s1);*/
	}
}