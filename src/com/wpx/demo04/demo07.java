package com.wpx.demo04;
/**
 * ����һ����������һ��int���͵���������ҳ���������� �����Ԫ�ط��ظ������ߡ�
 * @author wangpx
 */
public class demo07 {

	public static void main(String[] args) {
		int[] arr = {12,14,5,-26,14};
		int max = getMax(arr);
		System.out.println("���ֵ��"+ max); 
	}
	public static int getMax(int[] arr) {
		int max=arr[0];
		int length=arr.length;
		for(int i = 1;i < length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
