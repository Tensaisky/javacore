package com.wpx.demo07;
/**
 * �ӿڣ�

	�ӿڣ���չ���ܵġ�  
	
	
	�ӿڵĶ����ʽ��
		
		interface �ӿ���{
		
		}
	
	�ӿ�Ҫע������� ��
		1. �ӿ���һ��������ࡣ
		2. �ӿڵĳ�Ա����Ĭ�ϵ����η�Ϊ�� public static final ����ôҲ����˵�ӿ��еĳ�Ա�������ǳ�����
		3. �ӿ��� �ķ������ǳ���ķ�����Ĭ�ϵ����η�Ϊ�� public abstract��
		4. �ӿڲ��ܴ�������
		5. �ӿ���û�й��췽���ġ�
		6. �ӿ��Ǹ���ȥʵ��ʹ�õģ��ǳ�����ʵ��һ���ӿڵ�ʱ�򣬱���Ҫ�ѽӿ������з���ȫ��ʵ�֡�
	
	
	ʵ�ֽӿڵĸ�ʽ��
	
		class  ���� implements �ӿ���{
		
		}
 * @author wangpx
 */
interface action{
	String name = "wpx";
	void say();
}
public class Demo02 implements action{

	//private String name="wangpx";
	@Override
	public void say() {
		System.out.println("hello"+name);
	}

}
class Test{
	public static void main(String[] args) {
		new Demo02().say();
	}
}
