package com.wpx.demo09;

import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * System  ϵͳ�� ��Ҫ���ڻ�ȡϵͳ���������ݡ�
 	
	System�ೣ�õķ�����
 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length) һ��
 		src - Դ���顣
		srcPos - Դ�����е���ʼλ�á�
		dest - Ŀ�����顣
		destPos - Ŀ�������е���ʼλ�á�
		length - Ҫ���Ƶ�����Ԫ�ص�������
		
	currentTimeMillis()  ��ȡ��ǰϵͳϵͳ��       �ص�
	exit(int status)  �˳�jvm  ���������0��ʾ�����˳�jvm����0��ʾ�쳣�˳�jvm��    һ��

	gc()    ����jvm�Ͽ��������������ڻ���������
	getenv(String name) ���ݻ������������ֻ�ȡ����������
	getProperty(key) 
	
 * @author wangpx
 */
class Student4{
	String name;

	public Student4(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("gc is run....");
	}
	
}
public class demo04 {

	public static void main(String[] args) {
	 int[] srcArr = {1,4,45,67,9};
	//��srcArr������Ԫ�ؿ��� ��destArr�����С�
	 int[] destArr =new int[3];
	 System.arraycopy(srcArr, 2, destArr, 0, 3);
	 
	// System.exit(0);
	 System.out.println(Arrays.toString(destArr));
	 System.out.println(System.currentTimeMillis());
	 System.out.println("����������"+System.getenv("JAVA_HOME"));
	 
	AtomicInteger a=new AtomicInteger(1);
	while(a.intValue() < 5) {
		Student4 s=new Student4(null);
		System.gc();
		a.incrementAndGet();
		
	}

	//Properties properties = System.getProperties();  //��ȡϵͳ���������ԡ�
	//properties.list(System.out);
	
	String value = System.getProperty("java.vm.name");//����ϵͳ����������ȡ��Ӧ������ֵ
	System.out.println(value);
	}
}
