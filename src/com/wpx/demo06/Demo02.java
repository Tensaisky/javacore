package com.wpx.demo06;
/**
 * �������ģʽ����֤һ�������ڴ���ֻ��һ������

	ģʽ��ģʽ���ǽ�� һ�� ����Ĺ̶����� ��
	
	ģʽ�ĸ���������Դ�ڽ�����ҵ....
	�������ģʽ�Ĳ��裺	


�����������ģʽ
	1. ˽�л����캯����
	2. ����������������ͱ���������ʹ�øñ���ָ�������
	3. �ṩһ��������̬�ķ�����ȡ����Ķ���

�����������ģʽ��
	1. ˽�л����캯����
	2. ����������������ͱ��������ǲ�Ҫ��������
	3. �ṩ������̬ �ķ�����ȡ���� �Ķ��󣬻�ȡ֮ǰ���ж��Ƿ��Ѿ������˱��� ����
	������Ѿ������ˣ���ôֱ�ӷ��ض��󼴿ɣ������û�д�������ô�ȴ�������Ķ���
	Ȼ���ٷ��ء�


	�Ƽ�ʹ�ã� �����������ģʽ��  ��Ϊ�����������ģʽ������̰߳�ȫ���⣬Ŀǰ�����ܱ�֤һ�����ڴ���ֻ��һ������
	����ʽ�ڶ��̵߳�������synchronized�ؼ���ʱ˵��

 * @author wangpx
 */
// ����ʽ
class Single{
	private Single() {}
	public static Single s=new Single();
	public static Single getInstance() {
		return s;
	}
}
//����ʽ
class Single2{
	private Single2() {}
	private static Single2 s=null;
	public static Single2 getInstance() {
		if(s==null) {
			return new Single2();
		}
		return s;
	}
}
public class Demo02 {

}
