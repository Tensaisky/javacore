package com.wpx.demo02;

import java.util.Scanner;

/**
 * ͨ�����̱�׼����������ɼ��ж�ˮƽ
 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
		//����һ��ɨ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������");
		
		int score = scanner.nextInt();
			if(score >100|| score <0) {
				System.out.println("�������");
			}else if(score >60 ){
				System.out.println("����");
			}else {
				System.out.println("������");
			}
		
	}
}
