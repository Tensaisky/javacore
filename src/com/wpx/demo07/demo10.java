package com.wpx.demo07;
/**
 * ʵ�ֹ�ϵ�������ڲ���
 * @author wangpx
 */
public class demo10 {

	public static void main(String[] args) {
	new Dao() {
		
		@Override
		public void say() {
			System.out.println("hello wolrd");
		}
	}.say();
}
}
interface Dao{
	public void say();
}
class Outer10{
	public void show() {
		new Dao() {

			@Override
			public void say() {
				System.out.println("say");

			}
			
		}.say();
	}
}