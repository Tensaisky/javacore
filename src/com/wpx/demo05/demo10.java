package com.wpx.demo05;
/**
 * ͳ��һ���౻ʹ���˶��ٴδ������󣬸��������ʾ�������Ĵ���
 * @author wangpx
 */
class Student10{
	static int count = 0; //������
	{
		count++;	
	}
	public void show() {
		System.out.println("Object "+count);
	}
	}
public class demo10 {

	public static void main(String[] args) {
		Student10 s1=new Student10();
		s1.show();
		Student10 s2=new Student10();
		s2.show();
	}
}
