package org.chapter04;

/*
 * 1） 创建一个BlueException，要求继承自Exception.并提供可以自定义异常信息的构造方法
2） 创建一个BlueExceptionTest类，提供一个静态方法test。这个方法抛出BlueException
3） 在BlueExceptionTest创建一个main方法，并在main方法中调用test方法使用try-catch
        处理这个方法产生的异常。将异常信息打印到控制台上
 */




public class Exception68 {
	public static void test() throws BlueException 
	 {
		
	 }
	public static void main(String[] args) {
		
	}
}



class BlueException extends Exception{
	public BlueException () {
		
	}
	
}