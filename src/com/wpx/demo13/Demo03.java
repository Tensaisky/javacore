package com.wpx.demo13;

import java.util.HashMap;

/**
 * ˫�м��ϣ�
	-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
	----------------| HashMap  �ײ�Ҳ�ǻ��ڹ�ϣ��ʵ�� �ġ�
	HashMap�Ĵ洢ԭ��
	
		��HashMap���Ԫ�ص�ʱ�����Ȼ���ü���hashCode�����õ�Ԫ�� �Ĺ�ϣ��ֵ��Ȼ�󾭹�����Ϳ��������
		Ԫ���ڹ�ϣ���еĴ洢λ�á� 
		���1�� ��������λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ����ӵ���ϣ���С�
		
		���2�������� ��λ��Ŀǰ�Ѿ�����������Ԫ�أ���ô������ø�Ԫ�ص�equals���������λ���ϵ�Ԫ�ؽ��бȽ�
		�����equals�������� ����false����ô��Ԫ�������洢�����equals�������ص���true����ô��Ԫ�ر���Ϊ
		�ظ�Ԫ�أ����ʴ洢��
	
	----------------| TreeMap
	----------------| Hashtable 
 * 
 * @author wangpx
 */
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return this.id==s.id;
	}
	
}
public class demo03 {

	public static void main(String[] args) {
	
		HashMap<Student, Object> hashMap = new HashMap<>();
		hashMap.put(new Student(1, "wpx"), "������1");
		hashMap.put(new Student(1, "wangpx"), "������2");
		hashMap.put(new Student(1, "wpxpx"), "������1");
		System.out.println(hashMap.size());
	}
}
