package com.wpx.demo08;

import java.util.Date;

/**
 *  �������Ϣ��ͨ��printStackTrace������ӡ��������ô�쳣����Ӻζ����أ� 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo10.div(Demo10.java:10)
        at Demo10.main(Demo10.java:5)
	
jvm���е�a/b�������ʱ�򣬷���bΪ0������Ϊ0��������ʵ������������
�������������jvmһ�����������ֲ����������ʱ����ôjvm�ͻ����ϴ���
һ����Ӧ���쳣���󣬲��һ��������쳣���� ��printStackTrace�ķ���������


�쳣�Ĵ���

	 ��ʽһ��������

	  ������ĸ�ʽ��
			
			try{
				���ܷ����쳣�Ĵ��룻

			}catch(������쳣���� ������){
				�����쳣�Ĵ���....
			}
	
		
		������Ҫע���ϸ�ڣ�
			1. ���try���д�������쳣�����˴���֮����ôtry-catch������Ĵ����������ִ�С�
			2. ���try���г����쳣�Ĵ��룬��ô��try���г����쳣�������Ĵ����ǲ���ִ���ˡ�
			3. һ��try������ǿ��Ը��ж��catch��ģ�Ҳ����һ��try����Բ�������쳣�����͡�
			4. һ��try����Բ�������쳣������,���ǲ�����쳣���ͱ����С������в��񣬷�����뱨��
 * @author wangpx
 */
class tryCatch{
	public void sleep() {
		try {
			Thread.sleep(1000*60*60*24);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(new Date());
	}
}

public class demo04 {
	
public static void main(String[] args) throws Exception{
	System.out.println(1/0);
}
}
