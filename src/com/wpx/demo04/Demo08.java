package com.wpx.demo04;
/**
 * ѡ������(ֱ������)��ʹ��һ��Ԫ�������� ��Ԫ�ذ����Ƚ�һ�Σ�������������λ�á�
 * @author wangpx
 */
public class Demo08 {

	public static void main(String[] args) {
		int[] arr = {2,5,37,8,96,16,49}; 
		selectSort(arr);
	
}
	public static void selectSort(int[] arr) {
		//�����ֵ������λ�á�
		for(int j = 0; j<arr.length-1; j++){  //  ���Ƶ���������
			for(int i = j+1 ; i<arr.length ; i++){ // �ҳ����ֵ
				if(arr[i]>arr[j]){
					//����λ��
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
