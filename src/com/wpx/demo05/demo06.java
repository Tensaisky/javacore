package com.wpx.demo05;
/**
 * �������飺

	������������ã����������ͳһ�ĳ�ʼ����
	
	���캯�������ã� ����Ӧ�Ķ�����г�ʼ����
	
	
	��������ĸ�ʽ��
		
		{
			��������
		}
	
	ע�⣺ ��������Ĵ����ű���λ�ڳ�Ա λ���ϡ�
	
	���������
	1. �������顣
	2. �ֲ������.   ������λ�ڷ���֮�ڡ�  ���ã����ֲ̾� ���� ���������ڣ���ʡһ����ڴ档
	3. ��̬�����  static 
 * @author wangpx
 */
class Student6{
	private int age;
	private String name;
	//��������...
	{
		System.out.println("��������ִ����");
	}
	static {
		System.out.println("��̬��������ִ����");
	}
}
public class demo06 {

	public static void main(String[] args) {
		Student6 s=new Student6();
}
}
