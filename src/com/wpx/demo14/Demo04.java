package com.wpx.demo14;

import java.io.File;

/**
 * 
 * ɾ����
	delete()		ɾ���ļ���һ�����ļ��У�������ļ����Ҳ�Ϊ�գ�����ɾ�����ɹ�����true��ʧ�ܷ���false��
	deleteOnExit()	���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼����֤�����쳣ʱ��������ʱ�ļ�Ҳ���Ա�ɾ��
	
	
		�жϣ�
			exists()		�ļ����ļ����Ƿ���ڡ�
			isFile()		�Ƿ���һ���ļ�����������ڣ���ʼ��Ϊfalse��
			isDirectory()	�Ƿ���һ��Ŀ¼����������ڣ���ʼ��Ϊfalse��
			isHidden()		�Ƿ���һ�����ص��ļ����Ƿ������ص�Ŀ¼��
			isAbsolute()	���Դ˳���·�����Ƿ�Ϊ����·������

 * @author wangpx
 */
public class demo04 {

	public static void main(String[] args) {
		File file =new File("D:/javacore");
		//delete����������ɾ��һ���ļ��� delete������������ɾ���ǿյ��ļ��С�
		System.out.println("is delete success "+file.delete());
		file.deleteOnExit();  //jvm�˳���ʱ��ɾ���ļ���  һ������ɾ����ʱ �ļ�
		
		//�Ƿ�      ��true
		System.out.println("exist ?"+ file.exists()); 
		System.out.println("is File ? "+file.isFile());
		System.out.println("is Directoty ?"+file.isDirectory());
		System.out.println("is Hidden File ? "+file.isHidden());
		System.out.println("is absolute Path? "+file.isAbsolute());
	}
}
