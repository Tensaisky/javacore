package com.wpx.demo06;
/**
 * ����Ĺ����޷��������������

	������д��ǰ�᣺ ����Ҫ���ڼ̳еĹ�ϵ��
	
	��������д: �Ӹ������ͬ���ĺ�����������Ǿͳ���Ϊ��������д��
	
	ʲô��ʱ��Ҫʹ�÷�������д������Ĺ����޷��������������ʱ��
	
	������дҪע������
		1.������дʱ�� ���������β��б����һ�¡�
		2.������дʱ�������Ȩ�����η�����Ҫ���ڻ��ߵ��ڸ����Ȩ�����η���
		3.������дʱ������ķ���ֵ���ͱ���ҪС�ڻ��� ���ڸ���ķ���ֵ���͡�
		4.������дʱ�� �����׳����쳣����ҪС�ڻ��ߵ��ڸ����׳����쳣���͡�
				Exception(�)
				RuntimeException(С��)
	
	���������أ���һ������ ���������������� ���ϵ�ͬ������,����Ϊ�������ء�
	
	�������ص�Ҫ��
		1. ������Ҫһ�¡�
		2. �β��б�һ�£��βεĸ������β� �����Ͳ�һ�£�
		3. �뷵��ֵ�����޹ء�
 * @author wangpx
 */

//��д
class Fu6{
	String name;
	
	public void eat() {
		System.out.println("�����߲�");
	}
}
class Zi6 extends Fu6{
	
	public void eat() {
		System.out.println("ũҩ�߲�");
		
	}
}

public class Demo06 {

	//����

	public static String add(String a,String b) {
		return a+b;
	}
	public static  int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
	Zi6 z=new  Zi6();
	z.eat();
	
	System.out.println(add("hello ","world"));
	System.out.println(add(1,4));
}
}
