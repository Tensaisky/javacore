package com.wpx.demo03;
/**
 * continue�ؼ���

continue�����÷�Χ�� continueֻ������ѭ����䡣

continue�����ã�continue���������������ε�ѭ�������ݡ�������һ�Ρ�

continueҪע������
	1. ��һ������£�continue���治�ܸ���������䣬��Ϊ����Զ���޷�ִ�е���
	2. continue Ҳ������ϱ��ʹ�õġ�
 * @author wangpx
 */
public class Demo10 {

	public static void main(String[] args) {

		for(int i = 1;i < 100;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
}
}
