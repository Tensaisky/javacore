package com.wpx.demo12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *  ���͵������ޣ�
 
	����1�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Integer������Integer�ĸ����������ݡ�
	
	����2�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Number������Number�������������ݡ�
	
	������ͨ����� �� 
		
		? super Integer : ֻ�ܴ洢Integer������Integer����Ԫ�ء�  ���� ������
	 	
	 	? extends Number �� ֻ�ܴ洢Number������Number���͵��������ݡ� ��������
	 	
 * @author wangpx
 */

public class demo06 {

	public static void main(String[] args) {
		up(new ArrayList<Number>());
		down(new LinkedList<Integer>());
	}
	//���͵�����
	public static void up(Collection<? extends Number> c) {
		
	}
	//���͵�����
	public static void down(Collection<? super Integer> c) {
		
	}
}
