package com.wpx.demo07;
/**
 * �ֲ��ڲ��ࣺ ��һ���� �ķ����ڲ���������һ���࣬��ô����һ����ͳ���Ϊ�ֲ��ڲ��ࡣ

	�ֲ��ڲ���Ҫע���ϸ�ڣ�
	1. ����ֲ� �ڲ��������һ���ֲ���������ô�þֲ���������ʹ��final���Ρ�
	
	jdk1.8�Ժ���Ҫ��ʾ�ı���
 * @author wangpx
 */

public class demo08 {

	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.show();
}	
}
class Outer2{
	String name= "�ⲿ���name";
	
	public void show() {
		final int y = 100;
		//�ֲ��ڲ���
		class Inner8{
			
			int x =10;
			public void print(){
				System.out.println(y);
			}
		}
		Inner8 inner=new Inner8();
		inner.print();	
	}

}