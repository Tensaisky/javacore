package com.wpx.demo04;

/**
 * ������
 * 
 * ���������ã� Ϊ����߹��ܴ���ĸ����ԡ�
 * 
 * �����Ķ����ʽ:
 * 
 * ���η� ����ֵ���� ������(��ʽ����){ ������ }
 * 
 * �������ص㣺 1. �����ǰ�һ�����ܵĴ��� ��װ�����Դﵽ��߹��� ����ĸ����ԡ� 2. ���������֮����Ҫ���ò���ִ�еġ� 3.
 * ���һ������û�з���ֵ���ͣ���ô��ʹ��void�ؼ��ֱ�ʾ��
 * 
 * ����: ����һ�������жϷ����ĵȼ���Ȼ�󷵻ط�����Ӧ�ĵȼ���
 * 
 * @author wangpx
 */
public class Demo01 {
	public static void main(String[] args) {
		System.out.println(getGrade(123));
		
	}

	public static String getGrade(int score) { // δ֪�Ĳ����������β��У� �ɺ����ĵ�����ȷ����
		if (score >= 90 && score <= 100) {
			return "A�ȼ�";
		} else if (score >= 80 && score <= 89) {
			return "B�ȼ�";
		} else if (score >= 70 && score <= 79) {
			return "C�ȼ�";
		} else if (score >= 60 && score <= 69) {
			return "D�ȼ�";
		} else if (score >= 0 && score <= 59) {
			return "E�ȼ�";
		} else
			return "�������";
	}
}
