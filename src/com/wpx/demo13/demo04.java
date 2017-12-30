package com.wpx.demo13;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap   TreeMapҲ�ǻ��ں�����������������ݽṹʵ�� �ģ� �ص㣺���Ԫ�صļ���������洢��

	TreeMap Ҫע������
		1.  ��TreeMap���Ԫ�ص�ʱ�����Ԫ�صļ��߱���Ȼ˳����ô�ͻᰴ�ռ�����Ȼ˳�����Խ�������洢��
		2.  ��TreeMap���Ԫ�ص�ʱ�����Ԫ�صļ����߱���Ȼ˳�����ԣ� ��ô�������������Ҫʵ��Comparable�ӿڣ��Ѽ�
		�ıȽϹ�������CompareTo�����ϡ�
		
		3. ��TreeMap���Ԫ�ص�ʱ�����Ԫ�صļ����߱���Ȼ˳�����ԣ����Ҽ���������Ҳû��ʵ��Comparable�ӿڣ���ô�ͱ���
		�ڴ���TreeMap�����ʱ����Ƚ�����
		
 * @author wangpx
 */
class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}
class Student4 implements Comparable<Student4>{
	int age;
	String name;
	
	public Student4(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student4 o) {
		return this.age-o.age;
	}
	
}
class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age-o2.age;
	}

	
}
public class demo04 {

	public static void main(String[] args) {
		//����Ƚ���
		MyComparator myComparator=new MyComparator();
		TreeMap<Person, String> treeMap=new TreeMap<>(myComparator);		
		treeMap.put(new Person(1, "name1"), "value1");
		treeMap.put(new Person(2, "name2"), "value2");
		treeMap.put(new Person(3, "name3"), "value3");
		
		//ʵ��comparable�ӿ�
		TreeMap<Student4, Object> treeMap2 = new TreeMap<>();
		treeMap2.put(new Student4(3,"name3"), "value3");
		treeMap2.put(new Student4(2,"name2"), "value2");
		treeMap2.put(new Student4(1,"name1"), "value1");
	
		System.out.println(treeMap);
		System.out.println(treeMap2);
	}
}
