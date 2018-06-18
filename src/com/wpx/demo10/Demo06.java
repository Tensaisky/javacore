package com.wpx.demo10;
/**
 * �߳�ͨѶ�� һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������.
	 
	��������������
	
	
	wait():  �ȴ�   ����߳�ִ����wait��������ô���̻߳����ȴ���״̬���ȴ�״̬�µ��̱߳���Ҫ�������̵߳���notify�������ܻ��ѡ�
	notify()�� ����    �����̳߳صȴ��߳����е�һ����
	notifyAll() : �����̳߳����еȴ� �̡߳�
	
	
	wait��notify����Ҫע������
		1. wait������notify����������Object���� �ġ�
		2. wait������notify��������Ҫ��ͬ������������ͬ�������в��� ʹ�á�
		3. wait������notify��������Ҫ����������á�
		
		wait ���ͷ���,notify�����ͷ���
 * 
 * @author wangpx
 */
class Product{
	String name;  //����
	
	boolean flag = false; //��Ʒ�Ƿ�������ϵı�ʶ��Ĭ�������û��������ɡ�
}
class Producer extends Thread{
	Product  p ;  	//��Ʒ
	
	public Producer(Product p) {
		this.p  = p ;
	}

	@Override
	public void run() {
		while(true) {
		 synchronized (p) {
			if(p.flag == false) {
				System.out.println("����...");
				p.flag=true;
				p.notify();
			}else {
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	 }	
	}
	
}
class Customer extends Thread{
	Product  p ;  	//��Ʒ
	
	public Customer(Product p) {
		this.p  = p ;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (p) {
				if(p.flag == true) { //��Ʒ
					System.out.println("����.... ");
					p.flag=false;
					p.notifyAll();
				}else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
}
public class Demo06 {

	public static void main(String[] args) {
		Product p=new Product();
		Producer producer=new Producer(p);
		Customer customer=new Customer(p);
		producer.start();
		customer.start();
	}
}
