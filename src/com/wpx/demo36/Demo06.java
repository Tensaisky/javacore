package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Stream�����ݵ�����,���ڲ�������Դ(����,�����)�����ɵ�Ԫ������
 * ���Ͻ���������,�������Ǽ���
 * 1.Stream�Լ�����洢Ԫ��
 * 2.Straam����ı�Դ����,���ǻ᷵��һ�����н������Stream
 * 3.Stream����ʱ����
 * 
 * @author wangpx
 */
class Student06{
	private int id;
	private String name;
	private int classId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public Student06() {
		
	}
	public Student06(int id, String name, int classId) {

		this.id = id;
		this.name = name;
		this.classId = classId;
	}
	
	@Override
	public String toString() {
		return "Student06 [id=" + id + ", name=" + name + ", classId=" + classId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classId;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student06 other = (Student06) obj;
		if (classId != other.classId)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class Demo06 {

	private List<Student06> list = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	/**
	 * ����Stream����
	 * 
	 */
	@Test
	public void test01() {
		//һ.ͨ��Collectionϵ�м����ṩ��
		// 		1.������ stream()
		// 		2.������ paralleStream() 
		Stream<Student06> stream = list.stream();
		//��.ͨ��Arrays�еľ�̬����
		IntStream stream2 = Arrays.stream(new int[10]);
		//��.ͨ��Stream���еľ�̬����
		Stream<String> stream3 = Stream.of("aa","bb","cc");
		//��.����������
		//���� 
		Stream<Integer> stream4 = Stream.iterate(0, (x) -> x+2 );
		stream4
			   .limit(4)
			   .forEach(System.out::println);
		
		//����
		Stream.generate( () -> Math.random())
			  .limit(5)
			  .forEach(System.out::println);
	}
	
	
}
