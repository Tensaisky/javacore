package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class demo02 {

	//����˽�л�
	private demo02(){
	}
	//����ʵ������.�����ʽ��ͬ��������Ҫ�Ǵ���
	public static demo02 d=null;
	//��ȡʵ������ķ���
	public static demo02 getInstance() {
		//�ж�d�Ƿ�Ϊ��,���Ϊ���򴴽�����,���߳���Ҫͨ������ȷ������
		if(d == null) {
			synchronized (demo02.class) {
				if(d == null) {
					return d=new demo02();
				}
			}
		}
		return d;
	}
	
}
