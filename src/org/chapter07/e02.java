package org.chapter07;

import java.io.File;
import java.util.Arrays;


@SuppressWarnings("unused")
public class e02 {
	//遍历该目录下所有文件夹
	public static void main(String[] args) {
		File f = new File("F:\\pass"); 
		//System.out.print(Arrays.toString(file));
		if(f.isDirectory())//判断该根目录是否存在
		{
			String[] file = f.list();
			for(String a : file)
			{
				System.out.println(a);
			}
		}
	}
}
