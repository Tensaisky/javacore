package com.wpx.demo04;

/**
 * ���һ�������ķ���ֵ�����Ǿ�����������ͣ���ô�ú����ͱ���Ҫ��֤����������¶���֤�з���ֵ��
 * �����˷���ֵ������void���⣩

return �ؼ��ֵ����ã�
	1. �������ݸ������ĵ����ߡ�
	2. ����һ��ִ�е���return�ؼ��֣���ô�ú������Ͻ����� (�ܽ���һ������)

ע�⣺һ�������ķ���ֵ���� ��void����ôҲ���Գ���return�ؼ��֣�����return�ؼ��ֵĺ��治�������ݡ�

break�ؼ�����return�ؼ��ֵ�����
	1.break�ؼ����ǽ���һ��ѭ����
	2. return�ؼ����ǽ���һ��������




 * @author wangpx
 */
/**
 * @author wangpx
 */
@SuppressWarnings("all")
public class Demo02 {

	public static void main(String[] args) {

		//add(0, 2);

		//add(1, 2);

		String finallyReturn = finallyReturn();
		System.out.println(finallyReturn);
	}

	public static void add(int a, int b) {
		if (a == 0) {
			return;
		}
		System.out.println(a + b);
	}

	/**
	 * try����return ��ִ��finally�д��� ͬ����finally����return�����ܸú���
	 * 
	 * 
	 */
	public static String finallyReturn() {
		try {
			System.out.println("try");
			return "try";
		} finally {
			System.out.println("finally");
			return "finally";
		}
	}

}
