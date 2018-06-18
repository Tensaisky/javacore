package com.wpx.demo10;
/**
 *  
 *  �̵߳�ֹͣ��
 	1. ֹͣһ���߳� ����һ�㶼��ͨ��һ������ȥ���Ƶġ�
 	2. �����Ҫֹͣһ�����ڵȴ�״̬�µ��̣߳���ô������Ҫͨ���������notify��������interrupt()��ʹ�á�
 	
 * @author wangpx
 */
public class Demo07 extends Thread {

	boolean flag = true;
	
	public Demo07(String name) {
		super(name);
	}
	
	@Override
	public synchronized void run() {
	
		int i = 0;
		
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.err.println("Exception....");
			}
			System.out.println(Thread.currentThread().getName()+"  "+i);
			i++;
		}
	}
	public static void main(String[] args) {
		Demo07 d=new Demo07("wpx");
		d.setPriority(10);
		d.start();
		
		for(int i = 0 ; i<100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);

			if(i==80){
				d.flag = false;
				d.interrupt(); //���̵߳ĵȴ�״̬ǿ������������״̬���̻߳���յ�һ��InterruptedException�� 
				synchronized (d) {					
					d.notify();
				}
				
				
			}
			
		}
		
	}

}
