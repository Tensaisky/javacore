package com.wpx.demo01;
/**
 * ������ ���������ڳ������й�������ֵ���Է����仯����.

��������һ���洢���ݵ�������

�����߱�ʲô�ص㣺
	1. ����(��С)��
	2. �洢һ����ʽ�����ݡ�
	3. ����.

���������壩һ�������ĸ�ʽ��
	
	����  �������� = ���ݡ� 
	

�������������淶�� �׵���Сд��������������ĸ��д������Сд��

java��ʾһ�����������������ʹ�����������������ġ�

��java�� ������������Ҫ��������������
	������������

	������������

java�еİ��ֻ����������ͣ�
	�������������ͣ�
		byte(�ֽ�)      8λ��bit��  2^8 = 256    -128~127
		short(������)   16bit       2^16 = 65536
		int(����)       32bit 
		long(������)    64bit        2^64 = 

	ע�⣺ ���һ������û�м����κεı�ʶ��ʱ����ôĬ����int���͵����ݡ�
	�����Ҫ�Ѹ����ݱ�ʾ��һ��long���͵����ݣ���ô��Ҫ�����ݺ������L��ʾ��L�ǲ����ִ�Сд�ģ����ǽ���ʹ�ô�д��
	
	�ɻ󣺴洢��������ʹ�������������ͣ���ô������ôѡ��ʹ���أ�

	ѡ���������͵�ԭ�� �����������������£���С��С����ʡ�ڴ�ռ䡣


	С�����������ͣ�
		float(�����ȸ�����)    32bit

		double(˫���ȸ�����)   64bit
	
	ע�⣺ ���һ��С��û�м����κα�ʶ��ʱ����ô��С��Ĭ����double���͵����ݣ����
	��Ҫ��ʾ��float���ͣ���ô��Ҫ��С���ĺ������f��ʾ��f�����ִ�Сд�ġ�

	
	�������ͣ� ��������ֻ������ ֵ��true����false��
	
		boolean    1�ֽڻ���4���ֽ�   
	
	���ʹ��boolean����һ���������͵ı���ʱ����ô�ñ���ռ4���ֽڣ�
	���ʹ��boolean����һ���������� ��ʱ����ôÿ�������Ԫ��ռ
	һ���ֽڡ�
	

	�ַ����ͣ�
		char  2�ֽڣ�16bit��	
	
		
���ֻ����������ͣ�
	������byte short int long 
	С���� float double 
	������ boolean
	�ַ��� char

�ַ��������������ǣ�String ������������,�����ڻ����������͡�
 * @author wangpx
 */
public class demo05 {

	public static void main(String[] args) {
	
		//������תС���������ǷǱ�Ҫ��
		byte age=10;
		System.out.println(
				(long)((int)((short)age))
				);
		float f=3.14f;
		System.out.println(
				(double)f
				);
		
		boolean b =false; //true
		
		/**
		 * ��������ת���� 
		
		С��������-------->����������     �Զ�����ת��
	
		
		����������--------->С��������    ǿ������ת��
	
		ǿ������ת���ĸ�ʽ��
				
				С��������  ������ = (С��������)����������
		
	��������ת��Ҫע���ϸ�ڣ�
		1. ����byte��short �� char�������������������ʱ�򶼻��Զ�ת����int���͵����������㡣
		2. ������ͬ�������͵������������ʱ�򣬽��ȡ���ڴ���������͡�

		 */
		
		//С����ת�������Ǳ�Ҫ��
		byte a =1;
		int t=1;
		 a = (byte) t++;
		System.out.println(a);
		
		
		
		for(int i='a';i<'z';i++) {
			System.out.println(i);
		}
		
		
	}
	  	
	
	
		
}