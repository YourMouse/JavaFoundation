package org.chapter07;

import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) throws IOException {
		//�ڻ�ȡ·��ʱ����\����ʾΪ·���ָ�����������java��������б�ʾת���
		//�����ʾ·���ָ������� ��\\�� ���� ��/��������File.separator��ʾ
		File f1 = new File("E:\\����.txt");
		File f2 = new File("F:\\pass");
		File f3 = new File("E:\\ѧ��","������.html");
		System.out.println(f1.getName());
		System.out.println(f2.getName());//�������һ���ļ��л����ļ���
		System.out.println(f2.getPath());//���ض�Ӧ·��
		System.out.println(f3.getPath());//���ض�Ӧ·��
		System.out.println(f3.exists());
		System.out.println(f1.delete());
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.lastModified());
		System.out.println(f2.list());
	}
}
