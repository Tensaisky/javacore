package com.wpx.demo07;
/**
 * ����ӿ�֮���ϵ�� ʵ�ֹ�ϵ��

����ӿ�Ҫע������
	1. �ǳ�����ʵ��һ���ӿ�ʱ������Ҫ�ѽӿ������з���ȫ��ʵ�֡�
	2. ������ʵ��һ���ӿ�ʱ������ʵ��Ҳ���Բ�ʵ�ֽӿ��е� ������
	3. һ�������ʵ�ֶ���ӿ� ��
		
	�ӿ���ӿ�֮���ϵ�� �̳й�ϵ��
	
	�ӿ���ӿ�֮��Ҫע�����
		1. һ���ӿ��ǿ��Լ̳ж���ӿڵġ�
	 * 
 * @author wangpx
 */
interface A{
	void A();
}
interface B{
	void B();
}
interface C extends A,B{
	void C();
}
public class demo04 implements C{

	@Override
	public void A() {
		 System.out.println("A");
	}

	@Override
	public void B() {
		 System.out.println("B");
	}

	@Override
	public void C() {
		 System.out.println("C");
	}

}
