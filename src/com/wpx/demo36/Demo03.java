package com.wpx.demo36;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * Java8�����Ĵ���ĺ���ʽ�ӿ�
 * 
 * 
 * 
 * @author wangpx
 */
public class Demo03 {

	/**
	 * Consumer<T> �����ͽӿ�
	 * 	void accept(T t);
	 */
	@Test
	public void test01() {
		Consumer<String> con = x -> System.out.println(x);;
		con.accept("Hello Java8");
	}
	/**
	 * Supplier<T> �����ͽӿ�
	 * 	T get();
	 */
	@Test
	public void test02() {
		Supplier<String> sup = () -> "Hello Java8";
		System.out.println(sup.get());
	}
	/**
	 * Function<T,R>����ʽ�ӿ�
	 * R apply(T t);
	 */
	@Test
	public void test03() {
		Function<String,Integer> fun= (x) -> x.length();
		System.out.println(fun.apply("Hello Java8"));
	}
	/**
	 * Predicate<T> ����ʽ�ӿ�
	 * 	boolean test(T t);
	 */
	@Test
	public void test04() {
		Predicate<String> pre = (x) -> x.equals("Hello Java8");
		System.out.println(pre.test("Hello Java8"));
		System.out.println(pre.test("Hello World"));
	}
}
