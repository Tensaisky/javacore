package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ʹ�����ַ�ʽ�������ϵ�Ԫ��. 	
	��һ�֣� ʹ��get����������
	�ڶ��֣� ʹ�õ��������������
	�����֣� ʹ�õ��������������
 * @author wangpx
 */
public class demo07 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		System.out.println("======get��������=======");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("\r\n======ʹ�õ������������==========");
		ListIterator it = list.listIterator();	//��ȡ��������
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\r\n======ʹ�õ������������==========");
		while(it.hasPrevious()){
			System.out.print(it.previous()+" ");
		}
		
}
}
