package com.wpx.demo11;

import java.util.ArrayList;

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
	}

	public static ArrayList clearRepeat(ArrayList list){
		
		
		return list;
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