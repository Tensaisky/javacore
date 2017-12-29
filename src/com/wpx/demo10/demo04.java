package com.wpx.demo10;
/**
 * java��ͬ�����ƽ�����̰߳�ȫ���⣬����Ҳͬʱ������������

	��������
	
	����������� �ĸ���ԭ��
		1. �������������������ϵ��̡߳�
		2. �������������������ϵĹ�����Դ��
		
	��������Ľ�������� û�з�����ֻ�ܾ������ⷢ�����ѡ�

 * @author wangpx
 */
class DeadLock extends Thread{
	//��������
	static	final Object k1 =new Object();
 	static final Object k2 =new Object();
 	
	public DeadLock(String name){
		super(name);
	}

	@Override
	public void run() {

	
		if("person1".equals(Thread.currentThread().getName())) {
			synchronized (k1) {
				System.out.println("person1 get k1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (k2) {
					System.out.println("person1 get k1 and k2 ,can eat something");
				}
			}
		}else if("person2".equals(Thread.currentThread().getName())){
			synchronized (k2) {
				System.out.println("person2 get k2");
				synchronized (k1) {
					System.out.println("person2 get k1 and k2 ,can eat something");
				}
			}
		}
	}
	
}
public class demo04 {

	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("person1");
		DeadLock thread2 = new DeadLock("person2");
		//�����߳�
		thread1.start();
		
		thread2.start();
}
}
