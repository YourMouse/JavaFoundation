package org.chapter07;

import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) throws IOException {
		//在获取路径时，‘\’表示为路径分隔符，但是在java编译程序中表示转义符
		//若想表示路径分隔符就用 ‘\\’ 或者 ‘/’或者用File.separator表示
		File f1 = new File("E:\\链表.txt");
		File f2 = new File("F:\\pass");
		File f3 = new File("E:\\学资","代码雨.html");
		System.out.println(f1.getName());
		System.out.println(f2.getName());//返回最后一层文件夹或者文件名
		System.out.println(f2.getPath());//返回对应路径
		System.out.println(f3.getPath());//返回对应路径
		System.out.println(f3.exists());
		System.out.println(f1.delete());
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.lastModified());
		System.out.println(f2.list());
	}
}
