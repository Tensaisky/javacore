package com.wpx.demo10;
/**
 * �Զ����̵߳Ĵ�����ʽ:

	��ʽһ �� 
		1. �Զ���һ����̳�Thread�ࡣ
		2. ��дThread���run���������Զ����̵߳��������д��run�����ϡ�
		3. ����Thread��������󣬲��ҵ���start��������һ���̡߳� 
			
		ע�⣺ǧ��Ҫֱ�ӵ���run����������start������ʱ���߳̾ͻῪ�����߳�һ�������ͻ�ִ��run�����д��룬���ֱ�ӵ���
		run��������ô�� �൱�ڵ�����һ����ͨ�ķ������ѡ�
	
	��ʽ����
		1. �Զ���һ����ʵ��Runnable�ӿڡ�
		2. ʵ��Runnable�ӿ� ��run���������Զ����̵߳���������run�����ϡ�
		3. ����Runnableʵ�������
		4. ����Thread�� �Ķ��󣬲��Ұ�Runnableʵ����Ķ�����Ϊʵ�δ��ݡ�
		5. ����Thread���� ��start��������һ���̡߳�
 * 
 * @author wangpx
 */
public class demo05 implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Thread is "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		demo05 d=new demo05();
		Thread t1=new Thread(d, "t1");
		Thread t2=new  Thread(() ->  {
			System.out.println("t2 is runing.... ");
		});
		t1.start();
		t2.start();
		
	}	
}
