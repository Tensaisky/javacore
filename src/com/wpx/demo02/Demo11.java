package com.wpx.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ʹ������ͼƬ���ݽ��м���.
 * @author wangpx
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		// �ҵ�ͼƬ�ļ�
		File inFile = new File("e:\\���ܵ�ͼƬ.jpg");
		File outFile = new File("e:\\���ܵ�ͼƬ.jpg");

		// ��������ͨ������ͼƬ�Ķ�������������
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		// �߶����Ѷ������������һ�����ݣ��Ѱ�����д��

		int content = 0; // �ñ��������ڴ洢��ȡ��������
		while ((content = input.read()) != -1) { // ���û�е��ļ���ĩβ����ô������ȡ���ݣ���ȡ���������Ѿ��洢��content�������ˡ�
			output.write(content ^ 2);
		}

		// �ر���Դ
		output.close();
		input.close();

	}
}
