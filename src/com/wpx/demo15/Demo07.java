package com.wpx.demo15;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ��������� 
 
	 ���룺 �ѿ��ö����ַ���ɿ�������ֵ����������ǳ���Ϊ���롣
	 
	���룺 ����ֵ���Ҷ�Ӧ���ַ������ǰ�������̳���Ϊ���롣

 * @author wangpx
 */
public class Demo07 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
		String str="����";
		byte[] bytes = str.getBytes("utf-8");
		System.out.println(Arrays.toString(bytes));
		str =new String(bytes, "utf-8");
		System.out.println(str);
		
		
	}
}
