package com.wpx.demo21;
/**
 * 
 *�������ɫ
 * ͨ��Ϊjava�������java�ӿ�
 * @author wangpx
 */
public abstract class Handler {
	/**
	 * ���к�̵����ζ���
	 */
	protected  Handler successor;
	/**
	 * ʾ�⴦������ķ���
	 */
	public abstract void handlerRequest();
	/**
	 * ȡֵ����
	 */
	public Handler getSuccessor() {
		return successor;
	}
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	

}
