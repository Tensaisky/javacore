package com.wpx.demo08;
/**
 * ģ��ģʽ �����ĳ������Ĳ�����Щ�ǹ̶��ģ���Щ�ǻᷢ���仯�ģ���ô��ʱ�����ǿ���
	Ϊ���������ṩһ��ģ����룬�Ӷ����Ч�� ��
	
	
	���󣻱�дһ�������������ʱ�� ��ģ�塣
	
	ģ��ģʽ�Ĳ��裺
		1. ��д����������������� ��һ���Ľ��������
		2. �������룬�ѻᷢ���仯�Ĵ����ȡ����������һ���������Ѹ÷���������һ������ķ�����
		3. ʹ��final����ģ�巽������ֹ���� ��д���ģ�巽����
		
 * @author wangpx
 */
abstract class CodeRuntime{
	public abstract void code();
	public final void getTime(){
		long start = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("Runtime "+(endTime - start));
	}
}
public class demo09 extends CodeRuntime{

	public static void main(String[] args) {
		demo09 d=new demo09();
		d.getTime();
	}
	@Override
	public void code() {
		int i=0;
		while(i<5000) {
			System.out.println(i);
			i++;
		}
	}

}
