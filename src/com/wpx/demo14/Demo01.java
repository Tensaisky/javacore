package com.wpx.demo14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO��(Input Output) ��

	IO������Ҫ�������ǽ���豸���豸֮�� �����ݴ������⡣ ���磺 Ӳ��--->�ڴ�          �ڴ������---->Ӳ����            �Ѽ��̵�����------->�ڴ���
	
	IO������Ӧ�ó�����
		 �������� �� �ϴ���ͷ��   �� ���� �� ����xml�ļ� ... 
	
	���ݱ��浽Ӳ���ϣ������ݾͿ������������Եı��档   ����һ�������ļ�����ʽ���浽Ӳ����
	
	sunʹ����һ��File���������ļ������ļ��еġ�
	
	File���������һ���ļ�����һ���ļ��С�
	
	
	File��Ĺ��췽����
	
		File(String pathname)  ָ���ļ������ļ��е�·������һ��File�ļ���
		
		File(File parent, String child)   ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 
	
		File(String parent, String child) 
	
	Ŀ¼�ָ�����  ��windows������ ��Ŀ¼�ָ����� \  ,��linux�����ϵ�Ŀ¼�ָ�����/ .
	
	ע�⣺  ��windows����\ �� / ������ʹ����ΪĿ¼�ָ����� ���ң����д/ ��ʱ��ֻ��Ҫдһ�����ɡ�

 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
	
	File file = new File("F:/demo01.java");
	FileOutputStream o=new FileOutputStream(file);
	o.write("hello IO".getBytes());
	System.out.println("is exist "+file.exists());
	System.out.println("is a File "+file.isFile());
	
	//...
	System.out.println("file separator "+file.separator);
	
	File file2 = new File("D:\\demo01.txt");
	System.out.println(file2.exists());
	}
}
