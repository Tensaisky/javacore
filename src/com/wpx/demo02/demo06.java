package com.wpx.demo02;
/**
 * �Ƚ�������� �Ƚ�������Ľ�����Ƿ���һ������ֵ�ġ�

	== (�ж��Ƿ����)
	==���ڱȽ��������������������ݵ�ʱ�򣬱Ƚϵ��������������洢��ֵ�Ƿ�һ��.
	==���ڱȽ������������ͱ���������ʱ�򣬱Ƚϵ������� �������ͱ�������¼���ڴ��ַ�Ƿ�һ��. 


	!= (������)
	> (����)
	< (С��)
	>= (���ڵ���)
	<= (С�ڵ���)
 * @author wangpx
 */
public class demo06 {
	private static String c1="���";
	private static String c2="���";
	
	public static void main(String[] args) {
	
	String a1 = new String("hello");
	String a2 = new String("hello");
	 System.out.println(a1==a2);
	 
	String b1="world";
	String b2="world";
	System.out.println(b1==b2);

	System.out.println(c1==c2);

	System.out.println(1!=2);
	System.out.println(1>=2);
	System.out.println(1<=2);
	System.out.println(1>2);
	System.out.println(1<2);

	}

}
