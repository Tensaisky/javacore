package com.wpx.demo10;
/**
 *  �ػ��̣߳���̨�̣߳�:��һ�����������ֻʣ�� ���ػ��̣߳���ô�ػ��߳�Ҳ��������
 *  
 *   һ���߳�Ĭ�϶������ػ��̡߳�
 * @author wangpx
 */
public class Demo08 extends Thread {

	public Demo08(String name) {
		super(name);
	}
	@Override
	public void run() {
	
		for(int i = 1 ; i<=100 ; i++){
			System.out.println("���°�Ŀǰ����"+i+"%");
			if(i==100){
				System.out.println("���°��������,׼����װ..");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Demo08 d=new Demo08("�ػ��߳�");
		//d.setDaemon(true);//setDaemon() �����߳��Ƿ�Ϊ�ػ��̣߳�trueΪ�ػ��̣߳� falseΪ���ػ��̡߳�
		System.out.println(d.isDaemon());
		d.start();
		
	}
}
