package com.wpx.demo15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * ����ַ���:
---------| Writer ��������ַ����Ļ��ࡣ  ������
----------------| FileWriter ���ļ�������ݵ�����ַ���  
----------------| BufferedWriter ��������ַ���
        ������ֵ�Ŀ����Ϊ�����д�ļ����ݵ�Ч������չFileWriter��(newLine)����.


 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) throws IOException {
		writerFile02();
	}
	public static void writerFile01() throws IOException{
		//�����ļ�
		File file=new File("D:/demo01.java");
		//�½��ļ�����ַ����ܵ�
		FileWriter fw=new FileWriter(file);
		//д������
		fw.write("��� IO");
		//�ر���Դ
		fw.close();
	}
	
	public static void writerFile02() throws IOException{
		//�����ļ�
		File file=new File("D:/demo01.java");
		//�½��ļ�����ַ����ܵ�
		FileWriter fw=new FileWriter(file);
		//ʹ�û�������ַ������Ч��
		BufferedWriter bw=new BufferedWriter(fw);
		//д������
		bw.write("��� IO02");
		//ˢ�»���
		bw.flush();
		//�ر���Դ
		fw.close();
	}
}
