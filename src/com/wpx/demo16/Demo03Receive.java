package com.wpx.demo16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * 
 *  ���ն˵�ʹ�ò���
 	1. ����udp�ķ���
 	2. ׼���� ������ ���������ݡ�
 	3. ����udp�ķ���������ݡ�
 	4. �ر���Դ
 * @author wangpx
 */
public class Demo03Receive {

	@SuppressWarnings("all")
	public static void main(String[] args) throws IOException {
		//����udp�ķ��� ������Ҫ����һ���˿ڡ�
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		//׼���յ����ݰ����ڴ�����ݡ�
		byte[] buf=new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		//����udp�ķ����������,receive��һ�������͵ķ�����û�н��յ����ݰ�֮ǰ��һֱ�ȴ�
		datagramSocket.receive(datagramPacket);
		
		System.out.println(new String(buf, 0, buf.length));
		//�ر���Դ
		datagramSocket.close();
	}
}
