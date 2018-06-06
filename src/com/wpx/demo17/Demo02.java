package com.wpx.demo17;
/**
 * ˫�ؼ�����
 * @author wangpx
 */
public class Demo02 {

	//����˽�л�
	private Demo02(){
	}
	//����ʵ������.�����ʽ��ͬ��������Ҫ�Ǵ���
	public static Demo02 d=null;
	//��ȡʵ������ķ���
	public static Demo02 getInstance() {
		//�ж�d�Ƿ�Ϊ��,���Ϊ���򴴽�����,���߳���Ҫͨ������ȷ������
		if(d == null) {
			synchronized (Demo02.class) {
				if(d == null) {
					return d=new Demo02();
				}
			}
		}
		return d;
	}
	
}
