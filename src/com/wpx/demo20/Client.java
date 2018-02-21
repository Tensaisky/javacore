package com.wpx.demo20;

public class Client {

	//������������
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	
	//ʵ��������
	public Client() {
		fly1 = factory.getFlyweight("java");
		fly2 = factory.getFlyweight("python");
		fly3 = factory.getFlyweight("java");
		fly4 = factory.getFlyweight("java");
		
	}
	
	//��ʾ
	public void showFlyweight() {
		fly1.show();
		fly2.show();
		fly3.show();
		fly4.show();
		int flyWeightSize = factory.getFlyWeightSize();
		System.out.println(" Size:    " +flyWeightSize);
		}

	public static void main(String[] args) {
		Client client = new Client();
		client.showFlyweight();
	}
}
