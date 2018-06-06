package com.wpx.demo11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����������ظ�Ԫ�ء� ��������һ������Ϊ�ظ�Ԫ��
 * 
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
		ArrayList list=  new ArrayList();
		list.add(new Book(11,"java���˼��"));
		list.add(new Book(22,"��װ���"));
		list.add(new Book(33,"��װ���"));
		list.add(new Book(11,"�۽�����ì����"));
		ArrayList list2 = clearRepeat(list);
		System.out.println("�¼��ϵ�Ԫ���ǣ�"+ list2.size());
	}

	public static ArrayList clearRepeat(ArrayList list){
		
		//����һ���µļ���
				ArrayList newList = new ArrayList();
				//��ȡ������
				Iterator it = list.iterator();
				while(it.hasNext()){
					Book book = (Book) it.next();  //�Ӿɼ����л�ȡ��Ԫ��
					if(!newList.contains(book)){
						//����¼���û�а������鼮����ô�ʹ洢���¼�����
						newList.add(book);
					}
				}
				return newList;
	}
}
class Book{
	int id;
	
	String name;// ����

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ ��ţ�"+ this.id+" ������"+ this.name+" }";
	
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book =(Book)obj;
		return this.id==book.id;
	}
}