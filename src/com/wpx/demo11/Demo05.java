package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ӿ������з�����
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
	
	List�ӿ������еķ����߱����ص㣺 �����ķ�������������ֵ��	
	
	ֻ��List�ӿ�����ļ�����ž߱�����ֵ�������ӿ�����ļ����඼û������ֵ��

 * @author wangpx
 */
public class Demo05 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		List list2 =new ArrayList<String>();
		list.add("wpx11");
		list.add("wpx12");
		list.add("wpx13");
		
		list.add(3, "wpx04");
		list.add(4, list2);
		
		System.out.println(list.get(5));
		System.out.println(list.indexOf("wpx13"));
		
		List subList = list.subList(1, 5);
		
		list.set(1, "WANGPX");
		
	}
}
