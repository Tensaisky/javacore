package com.wpx.demo04;
/**
 * ���� һ����������һ��char���͵��������,Ȼ��ת�����е�Ԫ��
 * @author wangpx
 */
public class Demo11 {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		reverse(arr);
	}

	public static void reverse(char[] arr) {
		int length = arr.length;
		for (int startIndex = 0, endIndex = length - 1; startIndex < endIndex; startIndex++, endIndex--) {
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		// �������飬�鿴Ч��
		System.out.print("Ŀǰ��Ԫ�أ�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
