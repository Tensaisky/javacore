package com.wpx.demo02;
/**
 * ���ݽ���
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		/*
		��һ�ַ�ʽ�� ���������������
		int temp = a;  //3 
		a = b; //a = 5 
		b = temp; 
		
		��ʽ2����ӷ��� ȱ�㣺 ����int���͵�������ӣ��п��ܻ���ֳ���int�ı�ʾ��Χ��
		
		a = a+b;  // a =8
		b = a-b; //b = 8 - 5 = 3
		a = a-b; // a = 8 - 3 = 5
		
		��ʽ3�� ����ʹ����� ȱ�㣺 �߼���������
		*/
		a = a^b;  // a = 3^5
		b = a^b;  // b = (3^5)^5 = 3
		a = a^b; //  a = (5^3)^3 = 5 
		System.out.println("a = "+ a+" b="+b);
}
}
