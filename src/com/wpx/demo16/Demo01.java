package com.wpx.demo16;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * �����̣� ��������Ҫ���ڽ����������������ֻ���ƽ��..��֮������ݴ������⡣
 * ��������磺 �ֲ��ڲ�ͬ���� �ļ����ͨ���ⲿ�豸���������ﵽ����Ϣ��ͨ����Դ�����Ч���ͳ���Ϊһ�����������
 * ����ͨѶ����Ҫ�أ�
	1. IP
	2. �˿ںš�
	3. Э��.
IP��ַ��	IP��ַ�ı��ʾ���һ����32λ�Ķ�����������ɵ����ݡ� ��������Ϊ�˷������Ǽ���IP��ַ���Ͱ�IP��ַ�г���4�ݣ�ÿ��8bit.  
 			2^8 = 0~255
      00000000-00000000-00000000-00000000	
 IP��ַ�ķ��ࣺ
	A���ַ = һ������� + ����������     2^24   ������λ
	B���ַ =  ���������+ ����������   2^16 ��ҵ��λ��ѧУ������..��
	C���ַ= ���������+ һ��������  2^8    ˽��ʹ��..
InetAddress(IP��)

���õķ�����
	getLocalHost();  ��ȡ������IP��ַ
	getByName("IP����������") ����һ��IP��ַ���ַ�����ʽ������һ������������һ��IP��ַ���� (���ڻ�ȡ���˵�IP��ַ����)

	getHostAddress()  ����һ��IP��ַ���ַ�����ʾ��ʽ��
	getHostName()  ���ؼ��������������
	
�˿ں�	
			��0��1023��ϵͳ���ܰ���һЩ���� 
		1024~65535  ���ǿ���ʹ��....
 
 * @author wangpx
 */


public class Demo01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println("LocalHost is "+localHost.getHostAddress());
		System.out.println("LocalHost Name is  "+localHost.getHostName());
		
		//���Ը���һ��IP��ַ���ַ�����ʽ������һ������������һ��IP��ַ����
		InetAddress byName = localHost.getByName("AEPCH7EKKOOTFJ3");
		System.out.println(byName.getHostAddress());
		
		InetAddress[]  arr = InetAddress.getAllByName("www.baidu.com");//����
		for (InetAddress inetAddress : arr) {
			System.out.println(inetAddress.getHostName());
		}
		
		
	}
}
