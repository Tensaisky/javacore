package com.wpx.demo07;
/**
 * �����ڲ��ࣺû����������ͳ���Ϊ�����ڲ��ࡣ
	
	�����ڲ���ĺô�������д��
	
	�����ڲ����ʹ��ǰ�᣺������ڼ̳л���ʵ�ֹ�ϵ����ʹ�á�
	
	
	�����ڲ���һ��������ʵ�Ρ�

 * @author wangpx
 */
public class Demo09 {

}
abstract class Animal9{
	public abstract Animal9 run();
	
	public abstract void sleep();
}
class Outer9{
	public void print() {
		Animal9 a=new  Animal9() {
			
			@Override
			public void sleep() {
				System.out.println("sleep..");
			}
			
			@Override
			public Animal9 run() {
				System.out.println("run...");
				return null;
			}
		};
	}

}