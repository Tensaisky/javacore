package com.wpx.demo19;

public abstract class AbstractClass {

	//�����ඨ���������̹Ǽ�
	public void CalculationTime() {
		long startTime = System.currentTimeMillis();
		run();
		long endTime = System.currentTimeMillis();
		System.out.println("��������ʱ���ۼ� :"+(endTime - startTime));
	}
	abstract void run();
}
