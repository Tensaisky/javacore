
package com.wpx.demo07;
/**
 * ��̬��Ӧ�ã�
  1. ��̬�����β����͵�ʱ�򣬿��Խ��ո������͵����� ��
  2. ��̬���ڷ���ֵ���͵�ʱ�򣬿��Է��ظ������͵����ݡ�
��̬�ĺô��� ����˴������չ�ԡ�
 * @author wangpx
 */

//ͼ����
abstract class MyShape{
	public abstract void getArea();

	public abstract void getLength();	
}
//Բ��
class Circle extends MyShape{
	public static final double PI = 3.14;

	double r;
	public Circle(double r){
		this.r =r ;	
	}
	@Override
	public void getArea() {	 
		System.out.println(PI*r*r);
	}

	@Override
	public void getLength() {
		System.out.println(2*PI*r);
	}
	
}
//����
class Rect extends MyShape{

	int width;

	int height;

	public Rect(int width , int height){
		this.width = width;
		this.height = height;
	}
	@Override
	public void getArea() { 
		System.out.println(width*height);
	}

	@Override
	public void getLength() {
		 System.out.println((width+height)*2);

	}
	
}
public class demo06 {

	public static void show(MyShape s) {
		s.getArea();
		s.getLength();
	}
	public static void main(String[] args) {
		show(new Circle(2));
		show(new Rect(2, 3));
}
}
=======
package com.wpx.demo07;
/**
 * ��̬��Ӧ�ã�
  1. ��̬�����β����͵�ʱ�򣬿��Խ��ո������͵����� ��
  2. ��̬���ڷ���ֵ���͵�ʱ�򣬿��Է��ظ������͵����ݡ�
��̬�ĺô��� ����˴������չ�ԡ�
 * @author wangpx
 */

//ͼ����
abstract class MyShape{
	public abstract void getArea();

	public abstract void getLength();	
}
//Բ��
class Circle extends MyShape{
	public static final double PI = 3.14;

	double r;
	public Circle(double r){
		this.r =r ;	
	}
	@Override
	public void getArea() {	 
		System.out.println(PI*r*r);
	}

	@Override
	public void getLength() {
		System.out.println(2*PI*r);
	}
	
}
//����
class Rect extends MyShape{

	int width;

	int height;

	public Rect(int width , int height){
		this.width = width;
		this.height = height;
	}
	@Override
	public void getArea() { 
		System.out.println(width*height);
	}

	@Override
	public void getLength() {
		 System.out.println((width+height)*2);

	}
	
}
public class demo06 {

	public static void show(MyShape s) {
		s.getArea();
		s.getLength();
	}
	public static void main(String[] args) {
		show(new Circle(2));
		show(new Rect(2, 3));
}
}
>>>>>>> d128562b8b5099957eb34bce2139a4cb6dc7e90e
