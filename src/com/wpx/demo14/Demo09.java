package com.wpx.demo14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  ����ֽ�����
 
 --------| OutputStream ����������ֽ��� �ĸ��ࡣ  ������
 -----------| FileOutStream ���ļ�������ݵ�����ֽ�����
 
	FileOutputStream���ʹ���أ�
		1. �ҵ�Ŀ���ļ�
		2. �������ݵ����ͨ����
		3. ������ת�����ֽ�����д����
		4. �ر���Դ
	
	FileOutputStreamҪע���ϸ�ڣ�
		1. ʹ��FileOutputStream ��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ����� 
		2. ʹ��FileOutputStreamд���ݵ�ʱ�����Ŀ���ļ��Ѿ����ڣ���ô�������Ŀ���ļ��е����ݣ�Ȼ����д�����ݡ�
		3.ʹ��FileOutputStreamд���ݵ�ʱ��, ���Ŀ���ļ��Ѿ����ڣ���Ҫ��ԭ�����ݻ�����׷�����ݵ�ʱ��Ӧ��ʹ��new FileOutputStream(file,true)���캯�����ڶ�����Ϊtrue��
		4.ʹ��FileOutputStream��write����д���ݵ�ʱ����Ȼ���յ���һ��int���͵����ݣ���������д����ֻ��һ���ֽڵ����ݣ�ֻ��
		�ѵͰ�λ�Ķ���������д����������ʮ��λ����ȫ��������
		 
		 00000000-000000000-00000001-11111111   511
	 
	 
	 11111111---> -1 

 * 
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) throws IOException {
		writerFile02();
	}
	public static void writerFile01() throws IOException {
		/**
		 *	1. �ҵ�Ŀ���ļ�
			2. �������ݵ����ͨ����
			3. ������ת�����ֽ�����д����
			4. �ر���Դ
		 */
		File file=new File("D:/deme09.txt");
		FileOutputStream os=new  FileOutputStream(file);
		os.write("Hello IO".getBytes());
		os.close();
	}
	
	//ʹ���ֽ����������д����
	public static void writerFile02() throws IOException {
		File file=new File("D:/deme09.txt");
		FileOutputStream os=new  FileOutputStream(file);
		//�����ݼ��뻺��
		String data="Hello Wolrd! ?IO";
		byte[] buf=data.getBytes();
		os.write(buf, 0, buf.length);
		os.close();
	}
	
}
