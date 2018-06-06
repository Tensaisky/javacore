package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ϣ������Ǵ洢�������ݵļ���������
 
���ϱ���������ƣ�
	1. ���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������� �����ݡ�
	2. ���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶��ġ�
	
 
-------| Collection  �������ϵĸ��ӿڡ� 
 ----------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ���
 ----------| Set   �����ʵ����Set�ӿڵļ����࣬�߱��ص㣺 ���򣬲����ظ���

Collection�ӿ��еķ�����
	
	����
		add(E e)  ��ӳɹ�����true����� ʧ�ܷ���false.
		addAll(Collection c)  ��һ������ ��Ԫ����ӵ�����һ��������ȥ��
	
	ɾ��
		clear() 
		remove(Object o) 
		
		removeAll(Collection  c) 
		retainAll(Collection  c) 
	
	�鿴
		size() 

	
	�ж�
		isEmpty() 
		contains(Object o) 
		containsAll(Collection<?> c) 
	
	����
		toArray() 
		iterator() 

 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) {
		Collection c =new ArrayList<String>();
		c.add("TreeSet");
		c.add("HashSet");
		
		Collection c2 =new ArrayList<String>();
		c2.add("ArrayList");
		c2.add("LinkedList");
		c2.add("Vector");
		
		c.addAll(c2);// ��c2��Ԫ�ص���ӵ�c���� ��ȥ��
		 //ɾ������:
		//c.clear(); //clear()��ռ����е�Ԫ��
		c.removeAll(c2); //ɾ��c��������c2�Ľ���Ԫ�ء�
		
		c.retainAll(c2); //����c������c2�Ľ���Ԫ�أ�������Ԫ��һ��ɾ����
		System.out.println(c.size());
		}
	
}
