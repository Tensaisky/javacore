package com.wpx.demo09;
/**
 *  �ַ����ص㣺�ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ���.
 
	 �ַ���������һ�������˱仯����ô���ϻᴴ��һ���� �Ķ���
	 
	 ע�⣺ �ַ��������ݲ�����Ƶ���޸ģ���Ϊһ���޸����Ͼͻᴴ��һ���µĶ���
	 
 * @author wangpx
 */
public class Demo02 {
	public static void main(String[] args) {
		String str1="hello";
		char[] str2= {'h','e','l','l','o'};
		System.out.println(str1 == new String(str2));
		System.out.println(str1.equals(new String(str2)));
		
		System.out.println(str1.hashCode());
		System.out.println(new String(str2).hashCode());
		
		String str3="hello";
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
	}
}
