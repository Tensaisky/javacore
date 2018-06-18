package com.wpx.demo12;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ���� ����ϵ��
	------------| Collection �������ϵĸ��ӿ�
	----------------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ��� 
	-------------------| ArrayList  ArrayList �ײ���ά����һ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
	-------------------| LinkedList LinkedList �ײ���ʹ�����������ݽṹʵ�ֵģ� �ص㣺 ��ѯ�ٶ�������ɾ�졣
	-------------------| Vector(�˽⼴��)  �ײ�Ҳ��ά����һ��Object������ʵ�ֵģ�ʵ����ArrayList��һ���ģ�
	����Vector���̰߳�ȫ�ģ�����Ч�ʵ͡�
	
	----------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���
	-------------------| HashSet  �ײ���ʹ���˹�ϣ����֧�ֵģ��ص㣺 ��ȡ�ٶȿ�. 
	
	hashSet��ʵ��ԭ����
		��Haset����Ԫ�ص�ʱ��HashSet���ȵ���Ԫ�ص�hashCode�����õ�Ԫ�صĹ�ϣֵ ��
		Ȼ��ͨ��Ԫ�� �Ĺ�ϣֵ������λ�����㣬�Ϳ��������Ԫ���ڹ�ϣ���� �Ĵ洢λ�á�
		
		���1�� ������Ԫ�ش洢��λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ�Ӵ洢����λ���ϡ�
	
		���2�� ��������Ԫ�صĴ洢λ��Ŀǰ�Ѿ�������������Ԫ���ˣ���ô����ø�Ԫ�ص�equals�������λ�õ�Ԫ���ٱȽ�һ��
		�����equals���ص���true����ô��Ԫ�������λ���ϵ�Ԫ�ؾ���Ϊ�ظ�Ԫ�أ����������ӣ����equals�������ص���false����ô��Ԫ������ ���ӡ�
		
		
	-------------------| TreeSet  
 * @author wangpx
 */
public class Demo07 {

	@SuppressWarnings("all")
	public static void main(String[] args) {
	
		HashSet set = new HashSet();
		set.add(new Student(1, "wpx"));
		set.add(new Student(2, "wangpx"));
		boolean add = set.add(new Student(1, "������"));
		System.out.println(add);
		System.out.println(set.size());
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	//id��ΪΨһ��ʶ
	@Override
	public int hashCode() {
		System.out.println("=======hashCode=====");
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("======equals======");
		Student s=(Student) obj;
		return this.id == s.id;
	}
	
}