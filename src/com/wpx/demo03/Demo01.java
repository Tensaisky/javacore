package com.wpx.demo03;
/**
 * �����������֮----switchѡ���ж���� 

switch���ĸ�ʽ��
	
	switch(���ѡ��){
		
		case ֵ1��
			����ֵ1ִ�еĴ���
			break;
		case ֵ2��
			����ֵ 2ִ�еĴ���
			break;
		case ֵ3��
			����ֵ 3ִ�еĴ���
			break;
		case ֵ4��
			����ֵ 4ִ�еĴ���
			break;
		......

		default: 
			���ѡ�񶼷���������ѡ��ʱִ�еĴ���;
			break;
	}


switch���Ҫע������
	1. switch���ʹ�õı���ֻ����byte�� char�� short��int�� String�������ͣ�String���������Ǵ�jdk7.0��ʱ��ʼ֧�ֵġ�
	2. case����� �����ݱ�����һ��������	
	3. switch��ֹͣ������
		switch���һ��ƥ���������е�һ��case��䣬��ô�ͻ�ִ�ж�Ӧ��case�е������룬ִ�����֮�����û��
		����break�ؼ��ֻ����ǽ���switch���Ĵ����ţ���ôswitch��䲻�����жϣ����մ����˳���������ִ��
		���еĴ��롣ֱ������break�����ǽ���siwitch���Ĵ�����Ϊֹ��

	4. ��switch����в��ܴ����˳����Σ���Զ���ǻ����ж�case��䣬Ȼ��û�з��ϵ�����²Ż�ִ��default��䡣

 * @author wangpx
 */
public class Demo01 {
	public static void main(String[] args) {

		int option = 13; // ����һ�������洢���ѡ��
		switch (option) {

		case 1:
			System.out.println("java");

		case 2:
			System.out.println("C#");

		case 3:
			System.out.println("javascript");

		case 4:
			System.out.println("android");
		default:
			System.out.println("���ѡ������");

		}
	}
}
