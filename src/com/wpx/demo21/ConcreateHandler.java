package com.wpx.demo21;
/**
 * 
 * ���崦����
 * 
 * @author wangpx
 */
public class ConcreateHandler extends Handler{

	@Override
	public void handlerRequest() {
		/**
		 * ͨ���ж��Ƿ��к�̵����ζ���
		 * �����,��ת���������̶���
		 * ���û��,��������
		 */
		if(getSuccessor() != null) {
			System.out.println("�Ź�����");
			getSuccessor().handlerRequest();
		}else {
			System.out.println("��������");
		}
		
	}

}
