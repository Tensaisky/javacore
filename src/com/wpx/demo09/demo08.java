package com.wpx.demo09;

import java.util.Random;

/**
 * ��дһ���������������λ����֤�롣
 * @author wangpx
 */
public class demo08 {

	public static void main(String[] args) {
	
		Random r=new Random();
		int nextInt = r.nextInt(10); //0-9
		System.out.println(nextInt);
		
	char[] arr = {'��','��','��','��','Ǯ','Ƥ'};
	StringBuffer sb=new StringBuffer();
	Random random=new Random();
	//��Ҫ�ĸ��������ͨ���������ȡ�ַ������е��ַ���
	for(int i  = 0 ; i< 4 ; i++) {
		int index= random.nextInt(arr.length);
		sb.append(arr[index]);
	}
	System.out.println("��֤�룺"+ sb);
	}
}
