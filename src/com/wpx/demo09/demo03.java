package com.wpx.demo09;
/**
 * �����ҪƵ���޸��ַ��� �����ݣ�����ʹ���ַ������� �ࣨStringBuffer����

StringBuffer ��ʵ����һ���洢�ַ� ��������

	StringBuffer �ײ���������һ���ַ�������ܴ洢�ַ����� �ģ����ַ�������Ĭ�� �ĳ�ʼ������16�� ����ַ�����ĳ��Ȳ���ʹ�� ���Զ�����1����

�����ľ߱� ����Ϊ
	����
	ɾ��
	�޸�
	�鿴
	�ж� 

 * @author wangpx
 */
public class demo03 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		for(int i='a';i<'z';i++) {
			sb.append(i);
			//System.out.println(sb.hashCode());
		}
		System.out.println(sb);
}
}
