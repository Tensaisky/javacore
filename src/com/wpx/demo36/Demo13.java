package com.wpx.demo36;
/**
 * �ӿ��е�Ĭ�Ϸ����;�̬����
 * 
 * @author wangpx
 */
public interface Demo13 {
	
	default String say() {
		System.out.println("say method invoke....");
		return "Hello Java8";
	}
	
	static void show() {
		System.out.println("Java8 static method invoke...");
	}
}
