package com.wpx.demo03;
/**
 * break�� 

break���÷�Χ��ֻ������switch������ѭ������С�

break���ã�
	1. break����switch���������ǽ���һ��switch��䡣
	2. break����ѭ������е������ǽ�����ǰ���ڵ�ѭ����䡣

������Ŀ��breakĿǰλ���ڲ��forѭ������β�����break��������� ��forѭ����
	���Ա�ǽ��


��ǵ�����ֻҪ���ϱ�ʶ�����������򼴿ɡ�
 * @author wangpx
 */
public class demo09 {
	
	public static void main(String[] args) {
	aaa:for(int a= 0;a < 10;a++) {
		bbb:for(int b=0;b<2;b++) {
			System.out.println("hello world");
			//break bbb;
			break aaa;
		}
	}
}

}
