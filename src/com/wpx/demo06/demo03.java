package com.wpx.demo06;
/**
 * ����ѧ�����̳�:
 * ����ɮ����ʡ��,�����������
 * 
 * �̳У��̳���ͨ���ؼ���extends���ֵġ�

	�̳еĸ�ʽ��
	
		class ����1 extends ����2{
		
		}


�̳�Ҫע������
	1. ǧ��ҪΪ�˼����ظ������ȥ�̳У�ֻ�����������ż̳й�ϵ��ʱ���ȥ�̳С�
	2. ����˽�еĳ�Ա���ܱ��̳С�
	3. ����Ĺ��캯�����ܱ��̳С�
	4. �����������ʱĬ�ϻ��ȵ��ø����޲εĹ��캯����
 * @author wangpx
 */
class Person{
	String name;
	int age;
	public Person() {
		System.out.println("Person �޲ι���");
	}
	public void eat() {
		System.out.println("eating... ");
	}
	
}
class Student extends Person{
	public void study() {
		System.out.println("studying...");
	}
}
public class demo03 {

	public static void main(String[] args) {
		Student s=new Student();
		s.eat();
		s.study();
}
	
}
