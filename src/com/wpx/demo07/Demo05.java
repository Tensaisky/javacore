package com.wpx.demo07;
/**
 * ��̬��һ������߱�������̬��(������������ͱ���ָ��������Ķ���)

	�����ǽӿ� ���������ͱ���ָ���˽ӿ�ʵ����Ķ���)
	
	��̬��ǰ�᣺������ڼ̳л���ʵ�� ��ϵ��
	
	    ����  a  = new   ��();
	
	��̬Ҫע�� ��ϸ�ڣ�
		1.  ��̬����£��Ӹ������ͬ���ĳ�Ա����ʱ�����ʵ��Ǹ���ĳ�Ա������
		2.  ��̬����£��Ӹ������ͬ���ķǾ�̬�ĳ�Ա����ʱ�����ʵ�������ĳ�Ա������
		3.  ��̬����£��Ӹ������ͬ���ľ�̬�ĳ�Ա����ʱ�����ʵ��Ǹ���ĳ�Ա������
	
		4.  ��̬����£����ܷ����������еĳ�Ա��
	
	�ܽ᣺��̬����£��Ӹ������ͬ���ĳ�Աʱ�����ʵĶ��Ǹ���ĳ�Ա��������ͬ���Ǿ�̬����ʱ���Ƿ�������ġ�

 * @author wangpx
 */
abstract class Animal{

	public abstract void run();
	
}
class Mouse extends Animal{


	@Override
	public void run() {
		System.out.println("Mouse run....");
	}
	//���з���
	public void dig() {
		System.out.println("Mouse dig...");
	}
	
}
public class Demo05 {

	public static void main(String[] args) {
		//��̬�� ������������ͱ���ָ������Ķ���
	Animal a = new Mouse();
	a.run();
	}
}
