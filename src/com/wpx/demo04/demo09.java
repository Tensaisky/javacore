package com.wpx.demo04;
/**
 * 
ð������ð�������˼�����ʹ�����ڵ����� Ԫ�ذ����Ƚ�һ�Σ�������������λ�á�
 * @author wangpx
 */
public class demo09 {

	public static void main(String[] args) {
		int[] arr = {2,5,37,8,96,16,49}; 
		bubbleSort(arr);
}
	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length-1; i++) {
			for(int j = 0;j < arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j] =arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//�������飬�鿴Ч��
				System.out.print("Ŀǰ��Ԫ�أ�");
				for (int i = 0 ; i<arr.length  ;i++){
					System.out.print(arr[i]+",");
				}
	}
}
