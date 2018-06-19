package com.wpx.demo36;

import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * ���������� 
 * @author wangpx
 */
class Student{
	private int id;
	private String name;
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
	
	public Student() {
	}
	public Student( String name) {
		this.name = name;
	}
	
}


public class Demo05 {
	/**
	 * ���������÷�ʽ
	 */
	@Test
	public void test01() {
		Supplier<Student> s = () -> new Student("wpx");
		Supplier<Student> s2 = Student::new;
	}
	/**
	 *�������;��������Ǹ�������
	 */
	@Test
	public void test02() {
		Function<String, Student> f = Student::new;	
		Student apply = f.apply("wpx");
		System.out.println(apply.getName());
	}
}
