package com.wpx.demo05;
/**
 * �����������������
	1. ��װ
	2. �̳�
	3  ��̬��
	Ȩ�����η���Ȩ�����η����ǿ��Ʊ����ɼ���Χ�ġ�

public :  �����ġ� public���εĳ�Ա�������߷����κ��˶�����ֱ�ӷ��ʡ�

private �� ˽�еģ� private���εĳ�Ա�������߷���ֻ���ڱ����н���ֱ�ӷ��ʡ�


��װ�Ĳ��裺
	1. ʹ��private������Ҫ����װ�����ԡ�
	2. �ṩһ�������ķ������û��߻�ȡ��˽�еĳ�Ա���ԡ�
			 �����淶��
				set������();
				get������(); 

���ʣ� ��װһ��Ҫ�ṩget����set������
		��һ���� ������������ġ�

�淶 �� ����ʵ������һ��ʵ��������г�Ա���ԣ���Ա��������Ҫ��װ������

ʵ���ࣺʵ���������������һ�� ����ľͳ���Ϊʵ���ࡣ


������(Arrays����Ĺ�����):


��װ�ĺô���
	1. ������ݵİ�ȫ�ԡ�
	2. �����򵥡� 
	3. ������ʵ�֡�
	
 * @author wangpx
 */
class Student4{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class demo04 {

	public static void main(String[] args) {
		Student4 s=new Student4();
		s.setName("������");
		s.setAge(21);
		System.out.println(s.getName());
}
}
