package com.wpx.demo12;

import java.util.TreeSet;

/**
 * TreeSet�ǿ��Զ��ַ����������� �ģ� ��Ϊ�ַ����Ѿ�ʵ����Comparable�ӿڡ�

	�ַ����ıȽϹ���
		
		���һ�� ��Ӧλ���в�ͬ���ַ����֣� �ͱȽϵľ��Ƕ�Ӧλ�ò�ͬ���ַ���
	
		��� ������Ӧλ���� ���ַ���һ�����Ƚϵľ����ַ����ĳ��ȡ�
		
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) {
	
		TreeSet treeSet=new TreeSet();
		treeSet.add("aaa");
		treeSet.add("aac");
		treeSet.add("bbb");
		treeSet.add("bbd");

		System.out.println(treeSet);
	}
}
