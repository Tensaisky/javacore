package com.wpx.demo15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
�����ַ���:
---------| Reader   ���������ַ����Ļ��ࡣ  �����ࡣ
----------------| FileReader ��ȡ�ļ����ݵ������ַ����� 
----------------| BufferedReader ���������ַ���     
      ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ����ݵ�Ч������չFileReader��(readLine)���ܡ�  ������Ҳֻ���������ڲ�ά����һ��8kb���ַ�������ѡ�

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) throws IOException {
		readFile02();
	}

	public static void readFile01() throws IOException {
		//�����ļ�
		File file=new File("D:/demo01.java");
		//�½��ļ�����ַ����ܵ�
		FileReader fr=new FileReader(file);
		//��ȡ����
		int content=0;
		while((content=fr.read())!=-1) {
			System.out.print((char)content);
		}
		//�ر���Դ
		fr.close();	
	}

	public static void readFile02() throws IOException {
		//�����ļ�
		File file=new File("D:/demo01.java");
		//�½��ļ�����ַ����ܵ�
		FileReader fr=new FileReader(file);
		//ʹ�û����ַ������Ч��
		BufferedReader br=new BufferedReader(fr);
		//��ȡ����
		int content=0;
		while((content=br.read())!=-1) {
			System.out.print((char)content);
		}
		//�ر���Դ
		fr.close();	
	}

}