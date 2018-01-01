package com.wpx.demo15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 *  ת����:
 
	�����ֽ�����ת������InputStreamReader ���ֽ���ͨ���ַ�������
	 	InputStreamReader
	 
	����ֽ�����ת������
		OutputStreamWriter   ���԰�����ֽ���ת��������ַ��� ��  
	 	
	ת���������ã�
		1. ���Ŀǰ�� ��ȡ������һ���ֽ�����Ҫת���ַ���ʹ�ã���ʱ��Ϳ���ʹ��ת������  �ֽ���----> �ַ���
	 	2. ʹ��ת��������ָ���������ж�д�ļ���
	 	
 * 
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) throws Exception {
		readFile();
	}
	
	public static void writerFile() throws Exception{
		File file=new File("D:/demo08.java");
		FileOutputStream os=new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, "utf-8");
		outputStreamWriter.write("����");
		outputStreamWriter.close();
	}
	
	@SuppressWarnings("all")
	public static void readFile() throws Exception{
		File file=new File("D:/demo08.java");
		FileInputStream in=new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(in, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line=null;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		inputStreamReader.close();
	}
}
