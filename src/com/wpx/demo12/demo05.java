package com.wpx.demo12;
/**
 * ���ͽӿ�
	 
	���ͽӿڵĶ����ʽ: 
	
		interface �ӿ���<�����Զ��巺��>{
		
		}
	
	���ͽӿ�Ҫע������
		1. �ӿ����Զ���ķ��͵ľ���������������ʵ��һ���ӿڵ�ʱ��ָ�� �ġ�
		2. �ڽӿ����Զ���ķ��������ʵ�ֽӿڵ�ʱ��û��ָ��������������ͣ���ôĬ��ΪObject���͡�
		
	���� Ŀǰ��ʵ��һ���ӿڵ�ʱ���һ�����ȷ��ĿǰҪ�������������ͣ���Ҫ�ȴ������ӿ�ʵ���� �����ʱ���Ҳ���ָ�����͵ľ����������͡�
		
		���Ҫ�ӳ��ӿ��Զ��巺�� �ľ����������ͣ���ô��ʽ���£�
		��ʽ��  
			public class demo05<T> implements Dao<T>{
			
			}
			
 * @author wangpx
 */
interface Dao<T>{
	public void add(T t);
}
public class demo05<T>  implements Dao<T>{

	public static void main(String[] args) {
		demo05<String> d = new demo05<String>();
		d.add("Hello Wolrd! ");
	}
	@Override
	public void add(T t) {
		System.out.println("����ӵ�Ԫ��Ϊ   "+t);
	}


}
