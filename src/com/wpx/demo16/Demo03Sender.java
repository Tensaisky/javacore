package com.wpx.demo16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
	 UDPͨѶЭ����ص㣺
		1. �����ݼ���װΪ���ݰ������������ӡ�
		2. ÿ�����ݰ���С������64K��
		3.��Ϊ�����ӣ����Բ��ɿ�
		4. ��Ϊ����Ҫ�������ӣ������ٶȿ�
		5.udp ͨѶ�ǲ��ַ������ͻ��˵ģ�ֻ�ַ��Ͷ�����նˡ�
	udpЭ���µ�Socket:
		
		DatagramSocket(udp��������)
		DatagramPacket(���ݰ���)
			DatagramPacket(buf, length, address, port)
			buf: ���͵���������
			length : �����������ݵĴ�С��
			address : ���͵�Ŀ��IP��ַ����
			port : �˿ںš�
	���Ͷ˵�ʹ�ò��裺
		1. ����udp�ķ���
		2. ׼�����ݣ������ݷ�װ�����ݰ��з��͡� ���Ͷ˵����ݰ�Ҫ����ip��ַ��˿ںš�
		3. ����udp�ķ��񣬷������ݡ�
		4. �ر���Դ��

 * 
 * @author wangpx
 */
public class Demo03Sender {

	public static void main(String[] args) throws IOException {
		//����udp�ķ���
		DatagramSocket datagramSocket = new DatagramSocket();
		//׼�����ݣ������ݷ�װ�����ݰ��С�
		String data=" udp send... ";
		//����һ�����ݰ�
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length,InetAddress.getLocalHost(),8888);
		//����udp�ķ��������ݰ�
		datagramSocket.send(datagramPacket);
		//�ر���Դ
		datagramSocket.close();
	}
}
