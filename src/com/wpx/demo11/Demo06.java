package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ����
	listIterator() 
	

	ListIterator���еķ�����
		
		��ӣ�
			hasPrevious()  �ж��Ƿ������һ��Ԫ�ء�
			previous()    ��ǰָ���������ƶ�һ����λ��Ȼ����ȡ����ǰָ��ָ���Ԫ�ء�
			
			next();  ��ȡ����ǰָ��ָ���Ԫ�أ�Ȼ��ָ�������ƶ�һ����λ��
			
	---------------------------	
		
			add(E e)   �ѵ�ǰ��Ԫ�ز��뵽��ǰָ��ָ���λ���ϡ�
			set(E e)   �滻���������һ�η��ص�Ԫ�ء�
			
	 * @author wangpx
 */
public class demo06 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.hasPrevious());
			System.out.println(it.next());
		}
		
	}
}
