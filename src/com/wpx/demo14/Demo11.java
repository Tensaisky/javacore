package com.wpx.demo14;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����ֽ���
	--------| OutputStream  ��������ֽ����Ļ���  ������
	------------| FileOutputStream ���ļ� ������� ������ֽ���
	------------| Bufferedoutputstream  ��������ֽ���    BufferedOutputStream���ֵ�Ŀ����Ϊ�����д���ݵ�Ч�ʡ� 
	        						�ڲ�Ҳ��ά����һ��8kb���ֽ�������ѡ�
	 
	 ʹ��BufferedOutputStream�Ĳ��裺
	 	1. �ҵ�Ŀ���ļ�
	 	2. �������ݵ����ͨ��
	
	 
	BufferedOutputStream Ҫע���ϸ��
		1. ʹ��BufferedOutStreamд���ݵ�ʱ������write���������Ȱ�����д�����ڲ�ά�����ֽ������С�
	 	2. ʹ��BufferedOutStreamд���ݵ�ʱ������write���������Ȱ�����д�����ڲ�ά�����ֽ������У������Ҫ������������д��Ӳ�����棬��Ҫ
	 	����flush����������close������ �������ڲ�ά�����ֽ������Ѿ��������ݵ�ʱ��
	 
 * @author wangpx
 */
public class Demo11 {

	public static void main(String[] args) throws IOException {
		//����Ŀ���ļ�
		File file=new File("D:/demo11.java");
		//�������ݵ����ͨ��
		FileOutputStream  fileOutputStream = new FileOutputStream(file);
		//������������ֽ�������
		BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(fileOutputStream);
		//������д��
		bufferedOutputStream.write("hello bufferedOutputStream".getBytes()); 
		//�ѻ����������ڲ�������д��Ӳ�����档
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
}
