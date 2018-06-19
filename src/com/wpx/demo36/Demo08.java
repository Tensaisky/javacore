package com.wpx.demo36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * ӳ��
 * @author wangpx
 */

class Student08{
	private int id;
	private String name;
	private String className;
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student08 [id=" + id + ", name=" + name + ", className=" + className + "]";
	}
	public Student08(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
}
public class Demo08 {

	private List<Student06> list = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	/**
	 * map ����Lambda,��Ԫ��ת��Ϊ������ʽ����ȡ��Ϣ
	 * 
	 * ���Student06��classId ��Student08��ClassName ��ӳ��
	 */
	@Test
	public void test01() {
		list.stream()
			.map((e) -> {
				return new Student08(e.getId(), e.getName(), "�༶"+e.getId());
			})
			.forEach(System.out::println);
	}
	
	/**
	 * flatMap����һ��������Ϊ����,�������е�ÿ��ֵת��Ϊ��һ����
	 * Ȼ������е������ӳ�һ����
	 */ 
	@Test
	public void test02() {
		Arrays.asList("a","b","c").stream()
								  .map(Demo08::filterCharacter)
								  .forEach( (e) -> {
									  e.forEach(System.out::println);
								  });
		
		Arrays.asList("a","b","c").stream()
		  .flatMap(Demo08::filterCharacter)
		  .forEach(System.out::println);

	}

	public static Stream<Character> filterCharacter(String str){
		List<Character> list = new ArrayList<>();
		for (Character character : str.toCharArray()) {
			list.add(character);
		}
		return  list.stream();
	}
	
}
