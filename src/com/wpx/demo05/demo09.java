package com.wpx.demo05;
/**
 * static(��̬)
 * ��̬�ĳ�Ա����ֻ�������ݹ�������ά��һ�ݣ����Ǿ�̬��Ա���������ݻ���ÿ�������ж�ά��һ�ݵġ���
 * 
 * @author wangpx
 */
class Student9{
	static String clazz = "14��Ϣ";
	private String  name;
	public Student9(String name) {
		this.name = name;
	}

	
}
public class demo09 {
	public static void main(String[] args) {
		Student9 s1=new Student9("������");
		Student9 s2=new Student9("wpx");
		System.out.println(s1.clazz);
		System.out.println(s2.clazz);
	}
}
