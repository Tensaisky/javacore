package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� ���ϵ�������ָ��Ȼ˳�򣬶���ָ��ӽ�ȥ��˳����Ԫ�س�����˳����һ�µġ�

List�ӿ������з�����
	
	���
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	��ȡ��
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
	�޸ģ�
		set(int index, E element) 

	����
		listIterator()
 * @author wangpx
 */
public class demo04 {

	public static void main(String[] args) {
	List list =new ArrayList<String>();
	list.add("wpx");
	list.add("wpx");
	list.add("wpx");
	
	System.out.println(list.size());
}
}
