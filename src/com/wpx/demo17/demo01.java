package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class demo01 {

	//����˽�л�
	 private demo01() {
	 }
	 //���ڲ��Լ�����ʵ��
	 private static  demo01 d=new demo01();
	 //��ȡʵ���ķ���
	 public static demo01 getInstance() {
		 return d;
	 }
	 public static void main(String[] args) {
		 demo01 instance01 = demo01.getInstance();
		demo01 instance02 = demo01.getInstance();
		System.out.println(instance01 == instance02);
	 }
	
}
