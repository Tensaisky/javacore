package com.wpx.demo04;
/**
 * ��̬��ʼ����
         ��������[][]  ������ = {{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...} ..}
 * @author wangpx
 */
public class demo14 {

	public static void main(String[] args) {
		
	int[][] arr = {{122,111,92},{67,12,323,12,2,4,6,7},{3,335,39,40}};
	//������ά����
	for(int i = 0;  i <arr.length ; i++){
		for(int j = 0 ; j<arr[i].length ; j++){
			System.out.print(arr[i][j]+" ");
		}
		//����
		System.out.println();
	}
}
}
