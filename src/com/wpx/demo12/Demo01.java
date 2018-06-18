package com.wpx.demo12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Linkedlist���еķ�����
	1����������
	            addFirst(E e) 
				addLast(E e) 
		
				getFirst() 
				getLast() 
				
				removeFirst() 
				removeLast() 
	
	2�����ݽṹ
				1��ջ ��1.6��  : ��Ҫ������ʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ��
					�Ƚ����
					push() 
					pop()
				2�����У�˫�˶���1.5���� ��Ҫ��Ϊ�������ǿ���ʹ��LinkedListģ��������ݽṹ�Ĵ洢��ʽ��
					�Ƚ��ȳ�
					offer()
					poll()
					
	3����������ĵ���������      
			descendingIterator()   ��������ĵ���������
			
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {
		LinkedList list =new LinkedList<String>();
		list.add("wpx01");
		list.add("wpx02");
		list.add("wpx03");
		
		list.addFirst("wpx00"); //��Ԫ����ӵ����ϵ���λ���ϡ�
		list.addLast("wpx04");  //��Ԫ����ӵ����ϵ�ĩβ����
		
		System.out.println("��ȡ��������λ�õ�Ԫ��:"+list.getFirst());
		System.out.println("��ȡ������ĩβ��Ԫ�أ�"+ list.getLast());
	
		System.out.println("ɾ�������е���λ��Ԫ�ز����أ�"+ list.removeFirst());
		System.out.println("ɾ�������е�ĩβ�ز����أ�"+ list.removeLast());
		
		list.push("ѹջ");
		Object pop = list.pop();//��ջ
		
		list.offer("�Ŷ�");
		list.poll();//����
		
	}
}
