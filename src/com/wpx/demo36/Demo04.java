package com.wpx.demo36;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * ��������
 * 
 * 
 * @author wangpx
 */
class TestMethod{
	public String say() {
		return "Hello World";
	}
	
	public static String show() {
		return "Hello Java8";
	}
}

public class Demo04 {

	/**
	 * ��������
	 * ����::ʵ��������
	 */
	@Test
	public void test01() {
		TestMethod testMethod = new TestMethod();
		Supplier<String> sup = testMethod::say;
		System.out.println(sup.get());
	}

	/**
	 * ��������
	 * ��::��̬������
	 */
	@Test
	public void test02() {
		
		Supplier<String> sup = TestMethod::show;
		System.out.println(sup.get());
		
		BiPredicate<String, String> bip = (x,y) -> x.equals(y);
		BiPredicate<String, String> bip2 = String::equals;
	}
	/**
	 * ��������
	 * ��::ʵ��������
	 * 
	 * ��һ������Ϊʵ�������ĵĵ�����,�ڶ�������Ϊʵ�������Ĳ���
	 */
	@Test
	public void test03() {
		
		Function<TestMethod, String> fun = TestMethod::say;
		System.out.println(fun.apply(new TestMethod()));
		
	
	}
	

	
	
}
