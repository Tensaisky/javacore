package com.wpx.demo36;
/**
 * �ӿ�һ{@link Demo13}�ͽӿڶ�{@link Demo132}������ͬ��Ĭ�Ϸ���<br>
 * ��{@link DemoClass13}Ҳ����ͬ�ķ���<br>
 * 
 * �෽���ͽӿ�Ĭ�Ϸ�����ͬ��
 * 			�������ȵ�ԭ��<br>
 * 
 * �ӿڷ�����ͻ����
 * 		ͨ����д�ķ�ʽ�����<br>
 * 
 * ����ͨ���ӿ�.�����ķ�ʽ���þ�̬����
 *<br> 	 <code>Demo13.show</code>
 * 
 * @author wangpx
 */
public class DemoTest13 extends DemoClass13 implements Demo13,Demo132{

	public static void main(String[] args) {
		
		DemoTest13 demoTest13 = new DemoTest13();
		String say = demoTest13.say();
		System.out.println(say);
	
		Demo13.show();
	}

	@Override
	public String say() {
		return Demo132.super.say();
	}

	
}
