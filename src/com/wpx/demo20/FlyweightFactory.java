package com.wpx.demo20;

import java.util.Hashtable;
/**
 * 
 * ʹ���̰߳�ȫ�� hashtable ��Ϊ�洢
 * ��������Ķ���,����Ѿ�������ȡ��
 * ����������򴴽�����,������洢��hashtable��
 * 
 * @author wangpx
 */
public class FlyweightFactory {
	//����hashtable���ڴ洢��������
	private Hashtable flyweights = new Hashtable();
	public FlyweightFactory() {
		
	}
	public Flyweight getFlyweight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if(flyweight == null) {
			flyweight = new CurrrentFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public  int getFlyWeightSize() {
		return flyweights.size();
	}
	
}
