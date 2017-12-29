package com.wpx.demo09;

import java.io.IOException;

/**
 *  RunTime   ��������Ҫ������Ӧ�ó������еĻ�����
 	
 	getRuntime()  ���ص�ǰӦ�ó�������л�������
 	exec(String command)  ����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ���
 	freeMemory()   ���� Java ������еĿ����ڴ������� ���ֽ�Ϊ��λ
 	maxMemory()    ���� Java �������ͼʹ�õ�����ڴ�����
 	totalMemory()    ���� Java ������е��ڴ�����
 	
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) throws IOException, InterruptedException {
	Runtime r=Runtime.getRuntime();
	
	System.out.println("freeMemory is " +r.freeMemory());
	System.out.println("maxMemory is "+ r.maxMemory());
	System.out.println("totalMemory is "+r.totalMemory());
	
	System.out.println(r.getRuntime());
    Process exec = r.exec("C://Program Files//�������//Ruijie Supplicant");
    Thread.sleep(1000*4);
    exec.destroy();
	}
}
