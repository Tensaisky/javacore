package com.wpx.demo18;
/**
 * ������ͨ�����������ҵ���������˽���
 * 
 * @author wangpx
 */
public class Ximenqing {

	public static void main(String[] args) {
		//��ʼ������������˽���
		PanjinlianDao panjinlian = new PanjinlianDaoImpl();
		//�ҵ�����
		ProxyWangpo proxyWangpo=new ProxyWangpo(panjinlian);
		//���Ž���������
		PanjinlianDao panjinlianProxy = proxyWangpo.createProxy();
		//�˽���show���,�����ڴ�ǰ��
		panjinlianProxy.showFigure();
		
	}
}
