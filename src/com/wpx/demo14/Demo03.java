package com.wpx.demo14;

import java.io.File;
import java.io.IOException;

/**
 * ������
	createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
	mkdir()			��ָ��λ�ô���Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ����쳣��
	mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
	renameTo(File dest)	
	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,����ʱ���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��
 * 
 * @author wangpx
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
	
		File f1=new File("D:/javacore.txt");
		//����һ��ָ�����ļ���������ļ������ˣ��򲻻��ٴ����������û�д����򴴽��������ɹ�����true�����򷵻�false��
		System.out.println(" is exist "+f1.createNewFile());
		
		File f2=new File("D:/javacore");
		//��������Ŀ¼
		System.out.println("is make dir success "+f2.mkdir());
		
		File f3=new File("D:/javacore/demo01");
		System.out.println("is make dirs success "+f3.mkdirs());
		
		//renameTo() 
		//���Ŀ���ļ���Դ�ļ�����ͬһ��·���£���ôrenameTo����������������
		//���Ŀ���ļ���Դ�ļ�������ͬһ��·���£���ôrenameTo�����þ��Ǽ��У����һ����ܲ����ļ��С� 
		File destFile=new File("D:/java");
		System.out.println(destFile.renameTo(f2));
	}
}
