package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * ɸѡ����Ƭ
 * @author wangpx
 */

public class Demo07 {

	private List<Student06> list = Arrays.asList(
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(1, "wpx", 111),
			new Student06(2, "may", 211),
			new Student06(3, "dzq", 311),
			new Student06(4, "wyz", 411),
			new Student06(5, "qkn", 511));
	/**
	 * Filter����ɾ��
	 */
	@Test
	public void test01() {
		list.stream()
			.filter( (e) -> e.getId()>3)
			.forEach(System.out::println);
	}
	/**
	 * limit�ض���
	 */
	@Test
	public void test02() {
		list.stream()
			.filter( (e) -> e.getId()>3)
			.limit(1)
			.forEach(System.out::println);
	}
	/**
	 * skip(n) ����Ԫ��
	 */
	@Test
	public void test03() {
		list.stream()
			.filter( (e) -> e.getId()>3)
			.skip(1)
			.limit(1)
			.forEach(System.out::println);
	}
	/**
	 * distinctȥ��
	 * 
	 * ��������дhashcode equals����
	 */
	@Test
	public void test04() {
		list.stream()
			.distinct()
			.forEach(System.out::println);
	}
	
}
