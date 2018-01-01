package com.wpx.demo16;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
	    TCPͨѶЭ���ص㣺
		1. tcp�ǻ���IO���������� �Ĵ��� �ģ��������ӡ�
	 	2. tcp�������ݴ����ʱ����û�д�С���Ƶġ�
	 	3. tcp���������ӣ�ͨ���������ֵĻ��Ʊ�֤���ݵ������ԡ� �ɿ�Э�顣
	 	4. tcp���������ӵģ������ٶ�����
	 	5. tcp�����ֿͻ��������� �ġ�
	 	
	 	���磺 ��绰�� QQ���ļ����䡢 Ѹ������.... 
	 	
	tcpЭ���µ�Socket��
		Socket(�ͻ���) , tcp�Ŀͻ���һ����������Ҫ�����˽������ӡ�
		ServerSocket(�������)
	
	tcp�Ŀͻ���ʹ�ò��裺
		1. ����tcp�Ŀͻ��˷���
		2. ��ȡ����Ӧ��������
		3.д�����ȡ����
		4. �ر���Դ��

 * @author wangpx
 */
public class Demo02Server {

	public static void main(String[] args) throws IOException {
		//����Tcp�ķ����,���Ҽ���һ���˿ڡ�
		ServerSocket ss=new ServerSocket(8888);
		//���ܿͻ��˵�����
		Socket socket  =  ss.accept(); 
		//accept()  ���ܿͻ��˵����� �÷���Ҳ��һ�������͵ķ�����û�пͻ�����������ʱ����һֱ�ȴ���ȥ��
		InputStream inputStream = socket.getInputStream();
		int length=0;
		byte[] buf=new byte[1024];
		while((length=inputStream.read(buf))!=-1) {
			System.out.println(new String(buf, 0, length));
		}
		inputStream.close();
		ss.close();
	}
	
}
