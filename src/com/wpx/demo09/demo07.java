package com.wpx.demo09;
/**
 *  Math ��ѧ�࣬ ��Ҫ���ṩ�˺ܶ����ѧ��ʽ��
	 
	 abs(double a)  ��ȡ����ֵ
	 ceil(double a)  ����ȡ��
	 floor(double a)  ����ȡ��
	 round(float a)   ��������
	 random()   ����һ�������. ���ڵ��� 0.0 ��С�� 1.0 ��α��� double ֵ
	 
 
 * @author wangpx
 */
public class demo07 {
	public static void main(String[] args) {
	System.out.println("�����"+Math.random());
	System.out.println("����ֵ:"+Math.abs(-3));
	System.out.println("����ȡ����"+Math.ceil(3.14));
	System.out.println("����ȡ����"+Math.floor(-3.14)); //
	System.out.println("��������:"+Math.round(3.54));

	}
}
