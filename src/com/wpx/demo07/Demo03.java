package com.wpx.demo07;
/**
 * 
�ӿڵ����ã�
	1. ����Ľ��  ������ϣ�
	2. ����Լ���淶��
	3. ��չ���ܡ�
 * @author wangpx
 */
class Student{
	
}
interface action3{
	void study();
}
public class Demo03 extends Student implements action3
{

	@Override
	public void study() {
		System.out.println("study....");
		
	}

}
