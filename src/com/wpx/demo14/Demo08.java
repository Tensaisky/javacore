package com.wpx.demo14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * IO�����ࣺ
	����ǰ������ݵ����򻮷֣�	
		������	
		�����	
	������մ���ĵ�λ����	
		�ֽ���: �ֽ�����ȡ�ö����ļ��ж��������ݣ���ȡ�����������ݲ��ᾭ���κεĴ���
		�ַ����� �ַ�����ȡ�����������ַ�Ϊ��λ�� �� �ַ���Ҳ�Ƕ�ȡ�ļ��еĶ��������ݣ����������Щ����������ת���������� ʶ����ַ���  
					�ַ��� = �ֽ��� + ����				
	�����ֽ�����
	--------| InputStream ���������ֽ����Ļ���  ������
	------------| FileInputStream  ��ȡ�ļ����ݵ������ֽ��� 
				
	ʹ��FileInputStream��ȡ�ļ����ݵĲ��裺
		1. �ҵ�Ŀ���ļ�
		2. �������ݵ�����ͨ����
		3. ��ȡ�ļ��е����ݡ�
		4. �ر� ��Դ.
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) throws Exception {
		readFile04();
}
	//�������ȡ�ļ���ʽ    
	public static void readFile01() throws IOException{
		// �ҵ�Ŀ���ļ�
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//�������ݵ�����ͨ����
		FileInputStream in=new FileInputStream(file);
		//��ȡ�ļ��е�����
		int read = in.read();// read() ��ȡһ���ֽڵ����ݣ��Ѷ�ȡ�����ݷ��ء�
		System.out.println("read data is  "+(char)read);
		//�ر���Դ
		in.close();
	}
	//ѭ����ȡ�����ļ�    read��ȡ���־����-1
	public static void readFile02() throws Exception{
		// �ҵ�Ŀ���ļ�
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//�������ݵ�����ͨ����
		FileInputStream in=new FileInputStream(file);
		int content=0;
		while((content=in.read())!=-1) {
			System.out.print((char)content);
		}
		//�ر���Դ
		in.close();
	}
	
	//ʹ�û��� ���� ��ȡ  
	public static void readFile03() throws IOException{
		// �ҵ�Ŀ���ļ�
		File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
		//�������ݵ�����ͨ����
		FileInputStream in=new FileInputStream(file);
		//���������ֽ����飬��ȡ�ļ������ݡ�
		byte[] buf=new byte[1024];
		//��ȡ�ļ��е�����
		//���ʹ��read��ȡ���ݴ����ֽ����飬��ô�����Ǵ洢���ֽ������еģ�����ʱ��read�����ķ���ֵ�Ǳ�ʾ���Ǳ��ζ�ȡ�˼����ֽ����ݵ��ֽ������С�
		int read = in.read(buf);
		//ʹ���ֽ����鹹���ַ���
		String string = new String(buf,0,read);
		System.out.println(string);
		//�ر���Դ
		in.close();
	}
	
	//ʹ�û��� ���� ��ȡ �����ļ� 
		public static void readFile04() throws IOException{
			// �ҵ�Ŀ���ļ�
			File file=new File("D:\\nodejs\\javacore\\src\\com\\wpx\\demo01/demo01.java");
			//�������ݵ�����ͨ����
			FileInputStream in=new FileInputStream(file);
			//���������ֽ����飬��ȡ�ļ�������    �洢��ȡ�������� 
			byte[] buf=new byte[1024];
			//����ÿ�ζ�ȡ�����ֽڸ�����
			int length=0;
			//��ȡ�ļ��е�����
			while((length = in.read(buf))!=-1) {
				System.out.println(new String(buf, 0, length));
			}
			//�ر���Դ
			in.close();
		}
		
}
