package com.wpx.demo36;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;
/**
 * 
 * @author wangpx
 */
public class Demo14 {
	/**
	 * ��ͳ��ʱ��API���ڵ��̰߳�ȫ����
	 */
	@Test
	public void test01() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Callable<Date> task = () -> sdf.parse("20180620");
		ExecutorService pool = Executors.newFixedThreadPool(10);
		List<Future<Date>> results= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			results.add(pool.submit(task));
		}
		results.stream().map(e-> {
			try {
				return e.get();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				e1.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}
	/**
	 * {@link DateFormatThreadLocal}
	 * ͨ��ThreadLocal�ķ�ʽ����̰߳�ȫ������
	 */
	@Test
	public void test02() {
		Callable<Date> task = () -> DateFormatThreadLocal.conver("20181220") ;
		ExecutorService pool = Executors.newFixedThreadPool(10);
		List<Future<Date>> results= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			results.add(pool.submit(task));
		}
		results.stream().map(e-> {
			try {
				return e.get();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				e1.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}
}
