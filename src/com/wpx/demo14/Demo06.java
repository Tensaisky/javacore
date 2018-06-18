package com.wpx.demo14;

import java.io.File;

/**
 * �ļ�����أ�
	staic File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
	list()						����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
	listFiles()					����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��


	list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
 * 
 * @author wangpx
 */
public class Demo06 {

	public static void main(String[] args) {
		File[] listRoots = File.listRoots();
		for (File file : listRoots) {
			System.out.println(file);
		}
		//�� ��ǰ�ļ���������������ļ��������ļ����� �洢��һ��String���� �������� ���ء�
		File file=new File("D:\\nodejs\\javacore\\src\\com/wpx/");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2.getName());
		}
	}
}
