package com.wpx.demo04;
/**
 ����һ���������ӷ����ܡ�

���������أ���һ�����г������������������ϵ�ͬ���������������Ϊ���������ء�

�������ص����ã� ͬһ�����������Գ����˲�ͬ�ĺ�������Ӧ�Բ�ͬ�������߲�ͬ�������͵Ĳ�����

�������ص�Ҫ��
	1. ������һ�¡�
	2. �β��б�һ�¡�����ʽ�����ĸ��������Ƕ�Ӧ���������Ͳ�һ�£�
	3. �뺯���ķ���ֵ�������޹صġ�
	
 * @author wangpx
 */
public class Demo03 {

	public static void main(String[] args) {
	System.out.println(add(1,3,4,5));
	System.out.println(add("hello","world"));
}
	public static int add(int a,int b) {
		return a+b;
	}
	public static String add(String a,String b) {
		return a+b;
	}
	public static int add(int a,int...b) {
		int sum = 0;
		for(int c:b) {
			sum=sum+c;
		}
		return sum+a;
	}
	
	
}
