package com.wpx.demo04;

import java.util.Arrays;

/**
 * toString();
����sort��
��Ԫ���������е�λ��(���ֲ��ҷ�)  binarySearch

����Ĺ����ࣨArrays����
 * @author wangpx
 */
public class Demo12 {

	public static void main(String[] args) {
		int[] arr = {12,34,54,76,34,66,78};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr,123));
	}
}
