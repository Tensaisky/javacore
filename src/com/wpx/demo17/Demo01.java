package com.wpx.demo17;
/**
 * 
 * @author wangpx
 */
public class Demo01 {

	//����˽�л�
	 private Demo01() {
	 }
	 //���ڲ��Լ�����ʵ��
	 private static  Demo01 d=new Demo01();
	 //��ȡʵ���ķ���
	 public static Demo01 getInstance() {
		 return d;
	 }
	 public static void main(String[] args) {
		 Demo01 instance01 = Demo01.getInstance();
		Demo01 instance02 = Demo01.getInstance();
		System.out.println(instance01 == instance02);
	 }
	
}
