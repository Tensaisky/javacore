package com.wpx.demo03;
/**
 * �����������֮---forѭ�����


forѭ�����ĸ�ʽ:

	for(��ʼ�����;�ж����;ѭ��������){
		ѭ�����;
	}


forѭ����� Ҫע������
	1. for(;;)����д�� ��һ����ѭ����䣬�൱��while(true);
	2. forѭ�����ĳ�ʼ�����ֻ��ִ��һ�Σ�ֻ���ڵ�һ��ѭ����ʱ��ִ�ж��ѡ�
	3. forѭ������ѭ�������ֻ��һ���ʱ�򣬿���ʡ�Դ����Ų�д�����ǲ�����ʡ�ԡ�
 * @author wangpx
 */
public class Demo06 {
public static void main(String[] args) {

		for (int count = 0; count < 5; count++) {

			{
				System.out.println("hello world");
			}
		}

		for (int i = 0;; i++) {
			System.out.println("Hello World");
			if (i == 10) {
				return;
			}
		}

	}
}
