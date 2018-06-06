package com.wpx.demo10;

import java.util.MissingFormatArgumentException;

/**
 *  �̳߳��õķ�����
 	 Thread(String name)     ��ʼ���̵߳�����
	 setName(String name)    �����̶߳�����
	 getName()             �����̵߳�����
	 
	 
	 sleep()                 �߳�˯��ָ���ĺ������� ��̬�ķ����� �Ǹ��߳�ִ����sleep����������ô�����Ǹ��߳�˯�ߡ�
	 
	 currentThread()      ���ص�ǰ���̶߳��󣬸÷�����һ����̬�ķ����� ע�⣺ �Ǹ��߳�ִ����currentThread()����ͷ����Ǹ��߳� �Ķ���
	 
	 getPriority()             ���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 
	 setPriority(int newPriority) 
	 �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����
 * @author wangpx
 */
public class demo02 extends Thread {

	@Override
	public void run() {
		try {
			Thread.currentThread().setName("wpx");
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setPriority(8);
			System.out.println(Thread.currentThread().getPriority());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	
	}
	public static void main(String[] args) {
		demo02 d=new demo02();
		d.start();
}
}
