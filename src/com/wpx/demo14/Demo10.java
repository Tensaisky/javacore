package com.wpx.demo14;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;


/**
 *  
	�����ֽ�����ϵ�� 
	----| InputStream  �����ֽ����Ļ��ࡣ ����
	----------| FileInputStream ��ȡ�ļ����ݵ������ֽ���
	----------| BufferedInputStream ���������ֽ���    ���������ֽ����ĳ�����Ҫ��Ϊ����߶�ȡ�ļ����ݵ�Ч�ʡ�    
	��ʵ�����ڲ�ֻ������ά����һ��8kb���ֽ�������ѡ� 
	
	ע�⣺ ���ǻ����������߱���д�ļ���������
	
	ʹ��BufferedInputStream�Ĳ���	:
		1. �ҵ�Ŀ���ļ���
		2. �������� ������ͨ��
		3. �������� �����ֽ�����
		4. �ر���Դ
 
 * @author wangpx
 */
public class Demo10 {

	public static void main(String[] args) {
	

	}
	//��ȡ�ļ���ʱ�����Ƕ���ʹ�û��������ȡ��Ч�ʻ���Ӹ�
	public static void readFile01() throws Exception{
	File file=new File("D:/demo11.java");	
	//��������ͨ��
	FileInputStream inputStream = new FileInputStream(file);
	//ͨ��BufferedInputStream�Զ���
	BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
	//��ȡ�ļ�
	int content=0;
	while((content=bufferedInputStream.read())!=-1) {
		System.out.println((char)content);
	}
	//�ر���Դ
	bufferedInputStream.close();
	}
}
