package org.chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Student {

	public void sayHi() {
		System.out.println("Hello!!!");
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Properties pro = new Properties();
		pro.load(new FileReader("class.txt"));
		
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		Class<?> clazz = Class.forName(className);
		Method method = clazz.getDeclaredMethod(methodName);
		method.invoke(clazz.newInstance());
		
	}
}
