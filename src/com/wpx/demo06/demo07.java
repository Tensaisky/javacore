package com.wpx.demo06;
/**
 * instanceof �ؼ���

	instanceof�ؼ��ֵ����ã��ж�һ�������Ƿ�����ָ�������
	
	instanceof�ؼ��ֵ�ʹ��ǰ�᣺�жϵĶ�����ָ����������Ҫ���ڼ̳л���ʵ�ֵĹ�ϵ��
	
	instanceof�ؼ��ֵ�ʹ�ø�ʽ��
			
			����  instanceof ���
	
	instanceof�ؼ��ֵ����ã� Ŀǰû�á����Ǻ�������ѧϰ ���˶�̬֮��ͷǳ����á�
	һ��������ǿ������ת��֮ǰ����ʹ�øùؼ������ж�һ�ѣ�Ȼ���ڽ���ת���ġ�

 * @author wangpx
 */
class Person7{
	
}
class Student7 extends Person7{
	
}
class Teacher7 extends Person7{
	
}
public class demo07 {

	public static void main(String[] args) {
	
		Student7 s=new  Student7();
		Teacher7 t=new Teacher7();
		System.out.println("Student is Person ? "+(s instanceof Person7));
		System.out.println("Teacher is Person ? "+(t instanceof Person7));
		Person7 p=new Person7();
		System.out.println("Persion is Teacher ? "+(p instanceof Teacher7));
}
}
