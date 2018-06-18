package com.wpx.demo36;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Lambda���ʽ�����﷨  "->" ��ͷ��������Lambda������
 * Lambda���ʽ���ԶԲ������ͽ��������ƶ�
 * ���:Lambda���ʽ�Ĳ����б�
 * �Ҳ�:Lambda����ִ�еĹ��� 
 * 
 * @author wangpx
 */
public class Demo01 {
	
	/**
	 *  �﷨��ʽһ:
	 * 	() -> syso("hello world");
	 */
	@Test
	public void test01() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("�����ڲ���");
			}
		};
		r.run();
		System.out.println("---------");
		Runnable r2 = () -> System.out.println("Lambda");
		r2.run();
	}
	
	/**
	 * �﷨��ʽ��:��һ������,�޷���ֵ
	 * (a) -> syso(a);
	 * 
	 */
	@Test
	public void test02() {
		Consumer<String> con = (a) -> System.out.println(a);
		con.accept("Hello Java8");
	}
	
	/**
	 * �﷨��ʽ��:��ֻ��һ����������С���ſ��Բ�д
	 * (a) -> syso(a);
	 * 
	 */
	@Test
	public void test03() {
		Consumer<String> con = a -> System.out.println(a);
		con.accept("Hello Java8");
	}
	/**
	 * �﷨��ʽ��:��ζ����з�
	 * (a) -> { return x;};
	 * 
	 */
	@Test
	public void test04() {
		Comparator<Integer> com= (x,y) -> {
			System.out.println("��ζ���෵");
			return Integer.compare(x, y);};
			int compare = com.compare(8, 2);
			System.out.println(compare);
	}
	/**
	 * �﷨��ʽ��:���һ���з�
	 * �����ź�return����ʡ��
	 * (a) -> { return x;};
	 */
	@Test
	public void test05() {
		Comparator<Integer> com= (x,y) -> Integer.compare(x, y);
	}
	

}
