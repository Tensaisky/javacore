package com.wpx.demo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * SequenceInputStream(������)
 * 
 * �ϲ��ļ�
 * 
 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
	

	}
	//��ͳ��ʽ
	public static void merge01() throws IOException {
		//�ҵ�(�򴴽�)Ŀ���ļ�
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File outFile=new  File("D:/demo03.java");
		//�������ݵ�����/���ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//���������洢�������У�Ȼ���ٴӼ����ж�ȡ
		ArrayList<FileInputStream> arrayList = new ArrayList<FileInputStream>();
		arrayList.add(fileInputStream1);
		arrayList.add(fileInputStream2);
		//׼��һ����������
		byte[] buf=new byte[1024];
		int length=0;
		for(int i=0;i<arrayList.size();i++) {
			FileInputStream fileInputStream = arrayList.get(i);
			while((length=fileInputStream.read(buf))!=-1) {
				fileOutputStream.write(buf, 0, length);
			}
			fileInputStream.close();
		}
		fileOutputStream.close();
	}
	
	@SuppressWarnings("all")
	//	ʹ��SequenceInputStream�ϲ��ļ���
	public static void merge02()throws IOException {
		//�ҵ�(�򴴽�)Ŀ���ļ�
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File outFile=new  File("D:/demo03.java");
		//�������ݵ�����/���ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//��������������
		SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		byte[] buf=new byte[1024];
		int length=0;
		while((length=sequenceInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	
	//�������ļ��ϲ���һ���ļ�
	@SuppressWarnings("all")
	public static void merge03() throws IOException {
		//�ҵ�(�򴴽�)Ŀ���ļ�
		File inFile1=new File("D:/demo01.java"); 
		File inFile2=new File("D:/demo02.java");
		File inFile3=new  File("D:/demo03.java");
		File outFile=new  File("D:/demo04.java");
		//������Ӧ ���������������
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		FileInputStream fileInputStream3 = new FileInputStream(inFile3);
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		//��������������
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();
		SequenceInputStream sequenceInputStream = new  SequenceInputStream(e);
		//��ȡ�ļ�����
		byte[] buf=new byte[1024];
		int length = 0;
		while((length=sequenceInputStream.read())!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}
	
}

