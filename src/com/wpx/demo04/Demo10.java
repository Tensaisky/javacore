package com.wpx.demo04;
/**
 * �۰���ҷ�(���ַ�): ʹ��ǰ����������������
 * @author wangpx
 */
public class Demo10 {

	public static void main(String[] args) {
	
		int [] arr= {2,5,8,16,37,49,96};
		int index = halfSearch(arr,49);
		System.out.println("Ԫ�����ڵ�����ֵ�ǣ�"+ index);
}
	public static int halfSearch(int[] arr,int target) {
		//�������������ֱ��¼�����С���м�Ĳ��ҷ�Χ����ֵ
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(true) {
			
			if(target>arr[mid]){
				min = mid+1;
			}else if(target<arr[mid]){
				max = mid -1;
			}else{
				//�ҵ���Ԫ��
				return mid;
			}
			//û���ҵ������
			if (max<min){
				return -1;
			}
			//���¼����м�����ֵ
			mid = (min+max)/2;
		}
	}
	
	
	
}
