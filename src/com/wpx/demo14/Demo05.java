package com.wpx.demo14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ȡ��
	getName()		��ȡ�ļ����ļ��е����ƣ��������ϼ�·����
	getPath()       ���ؾ���·�������������·��������Ŀ¼Ҫָ��
	getAbsolutePath()	��ȡ�ļ��ľ���·�������ļ��Ƿ����û��ϵ
	length()		��ȡ�ļ��Ĵ�С���ֽ�����������ļ��������򷵻�0L��������ļ���Ҳ����0L��
	getParent()		���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻�null��
	lastModified()	��ȡ���һ�α��޸ĵ�ʱ�䡣
	
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
		
	File file =new File("D:/javacore/demo01");
	System.out.println("File Name " +file.getName());
	System.out.println("Path "+file.getPath());
	System.out.println("absolute Path "+file.getAbsolutePath());
	System.out.println("file size (/byte)" +file.length());
	System.out.println("file parent path "+file.getParent());
	
	//ʹ�ú���ֵת����Date����
	long lastModified = file.lastModified();
	Date date = new Date(lastModified);	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
	System.out.println("��ȡ���һ�ε��޸�ʱ��(����ֵ)��"+ dateFormat.format(date) );
	
	}
}
