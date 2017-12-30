package com.wpx.demo12;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *  treeSet����Զ���Ԫ��:

 treeSetҪע������
 	1. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر���߱�����Ȼ˳������ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢��
 	2. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر����߱���Ȼ˳������ԣ���ô��Ԫ�������������Ҫʵ��Comparable�ӿڣ���Ԫ��
 	�ıȽϹ�������compareTo(T o)�����ϡ� 
 	3. ����Ƚ�Ԫ�ص�ʱ��compareTo�������� ����0����ô��Ԫ�ؾͱ���Ϊ�ظ�Ԫ�أ����������.(ע�⣺TreeSet��HashCode��equals������û���κι�ϵ��)
 	4. ��TreeSet���Ԫ�ص�ʱ��, ���Ԫ�ر���û�о߱���Ȼ˳�� �����ԣ���Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô����Ҫ�ڴ���TreeSet��ʱ����һ��
 	�Ƚ�����
 	5.  ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر����߱���Ȼ˳������ԣ���Ԫ�����������Ѿ�ʵ����Comparable�ӿڣ� �ڴ���TreeSet�����ʱ��Ҳ�����˱Ƚ���
 	��ô���ԱȽ����ıȽϹ�������ʹ�á�
 	����Զ��嶨��Ƚ����� �Զ���һ����ʵ��Comparator�ӿڼ��ɣ���Ԫ����Ԫ��֮��ıȽϹ�������compare�����ڼ��ɡ�	
 		�Զ���Ƚ����ĸ�ʽ ��
 			class  ����  implements Comparator{
 			
 			}
 	�Ƽ�ʹ�ã�ʹ�ñȽ���(Comparator)�� 

 * @author wangpx
 */



class Student8 implements Comparable<Student8>{

	int age;
	String  name;
	
	public Student8(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student8 o) {
		return this.age-o.age;
	}
	
}
class MyComparator implements Comparator<Student8>{

	@Override
	public int compare(Student8 o1, Student8 o2) {
		return o2.age-o1.age;
	}
	
}
public class demo08 {

	public static void main(String[] args) {
	
	TreeSet treeSet=new TreeSet<Student8>();
	treeSet.add(new Student8(19, "wpx1"));
	treeSet.add(new Student8(14, "wpx2"));
	treeSet.add(new Student8(21, "wpx3"));
	
	System.out.println(treeSet);
	
	MyComparator myComparator=new MyComparator();
	TreeSet treeSet2=new TreeSet(myComparator);
	treeSet2.add(new Student8(19, "wpx1"));
	treeSet2.add(new Student8(14, "wpx1"));
	treeSet2.add(new Student8(21, "wpx1"));
	System.out.println(treeSet2);
	}
}
