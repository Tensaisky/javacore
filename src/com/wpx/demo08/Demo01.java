package com.wpx.demo08;
/**
 * �쳣��

���ǵ�java����Ҳ�ǻ����ĳЩ������ ������ģ���Щ�������� ������Ǿ�ͳ���쳣��


	�쳣��ϵ��
	--------| Throwable
	------------| Error
	------------| Exception
	
	
	Throwable���õķ�����
		toString()  ���ص�ǰ�쳣�������������+��̬��Ϣ��
		getMessage() ���ص��Ǵ���Throwable������ַ�����Ϣ��
		printStackTrace() ��ӡ�쳣��ջ��Ϣ��
		
 * @author wangpx
 */
public class Demo01 {

	public static void main(String[] args) {
		test();
	}
	public static void test() {
		Throwable t=new Throwable();
		//t.toString();
		//t.getMessage();
		t.printStackTrace();
	}

}
