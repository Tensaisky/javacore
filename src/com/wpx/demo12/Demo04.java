package com.wpx.demo12;
/**
 * ��дһ������ �Ĺ�����
 
	 �����ࣺ
	 
	������Ķ����ʽ��
		
		class ����<�����Զ��巺��>{
		
		}
	 
	������Ҫע������
	 	1. �������Զ��巺�͵ľ���������������ʹ�ø����ʱ�򴴽�����ʱ��ȷ���ġ�
	 	2. ���һ�����������Ѿ��������Զ��巺�ͣ����ʹ�ø��ഴ������ ��ʱ��û��ָ�� ���͵ľ����������ͣ���ôĬ��ΪObject����
	 	3.�������Զ��巺�Ͳ��������ھ�̬�ķ����������̬�ķ�����Ҫʹ���Զ��巺�ͣ���ô��Ҫ�ڷ������Լ�����ʹ�á�
	 
 * @author wangpx
 */
class MyArrays<T>{
	
	//��תԪ��
	public void reverse (T[] arr) {
		for(int startIndex =0,endIndex =arr.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			T temp = arr[startIndex];
			arr[endIndex]=arr[endIndex];
			arr[startIndex]=temp;
		}
	}

}


public class demo04 {

	public static void main(String[] args) {
	
		Integer[] intArr= {12,23,34,45,56};
		MyArrays<Integer> myArrays = new MyArrays<Integer>();
		myArrays.reverse(intArr);
	
		
		String[] strArr= {"wpx","wangpx","wangpengxiao"};
		MyArrays<String> myArrays2 = new MyArrays<String>();
		myArrays2.reverse(strArr);
	
	}
}
