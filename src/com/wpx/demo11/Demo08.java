package com.wpx.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 *  �������ڱ���Ԫ�ص�ʱ��Ҫע����� �ڵ���������Ԫ�� �Ĺ����У�������ʹ�ü��϶���ı伯���е�Ԫ�� ������
 *  �����Ҫ��ӻ���ɾ��ֻ��ʹ�õ������ķ������в�����
 	���ʹ�ù��˼��϶���ı伯����Ԫ�ظ�����ô�ͻ����ConcurrentModificationException�쳣��	
 	����Ԫ�� �Ĺ�����: ������������ʹ�ý�����ʱ�䡣
 * @author wangpx
 */
public class Demo08 {

	public static void main(String[] args) {
		List list =new ArrayList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		ListIterator it = list.listIterator();	//��ȡ��������
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add("wpx05");
			
		}
	}
}
