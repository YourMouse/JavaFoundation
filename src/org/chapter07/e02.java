package org.chapter07;

import java.io.File;
import java.util.Arrays;


@SuppressWarnings("unused")
public class e02 {
	//������Ŀ¼�������ļ���
	public static void main(String[] args) {
		File f = new File("F:\\pass"); 
		//System.out.print(Arrays.toString(file));
		if(f.isDirectory())//�жϸø�Ŀ¼�Ƿ����
		{
			String[] file = f.list();
			for(String a : file)
			{
				System.out.println(a);
			}
		}
	}
}
