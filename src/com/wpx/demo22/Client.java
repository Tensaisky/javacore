package com.wpx.demo22;

public class Client {

	public static void main(String[] args) {
		//ԭ������
		IThridParty thridPartyOne = new ThridParty();
		//��һ��װ��(��ǿ)
	IThridParty decorator1 = new Decorator1(thridPartyOne);
		//�ڶ�����ǿ
	IThridParty decorator2 = new Decorator2(decorator1);
	
	System.out.println(decorator2.say());
	}
}
