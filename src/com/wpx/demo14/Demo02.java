package com.wpx.demo14;

import java.io.File;

/**
 * ·�����⣺ 

	����·���� ���ļ���Ӳ���� ������·��������·��һ�㶼�����̷���ͷ�ġ�
	
	���·��:  ���·��������Դ�ļ�����ڵ�ǰ�������ڵ�·����
	
	 . ��ǰ·��
	 
	 .. ��һ��·��
	 
	ע�⣺ �������ǰ���ڵ�·������Դ�ļ�������ͬһ�������棬��û��д���·�� �ġ�

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
	File file =new File(".");
	//����·��
	System.out.println("file absolutePath is "+file.getAbsolutePath());
	//    javacore/demo14Ϊ·��
	System.out.println("./demo02.java");  // ->  javacore/demo14/demo02.java
	System.out.println("../demo02'");     // ->  javacore/demo02
	}
}
