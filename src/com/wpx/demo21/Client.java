package com.wpx.demo21;

public class Client {

	public static void main(String[] args) {
		//��װ������
		ConcreateHandler handler1 = new ConcreateHandler();
		ConcreateHandler handler2 = new ConcreateHandler();
		handler1.setSuccessor(handler2);
		//�ύ����
		handler1.handlerRequest();
	}
}
