package com.wpx.demo06;
/**
 * ���ø��� �Ĺ��췽���ǿ��Գ�ʼ���Ӹ���̳���ȥ�����Եġ�
 * @author wangpx
 */
class Fu{
	int age = 10;
	String name;
	public Fu(){
		System.out.println("Fu����޲ι���...");
	}
	public Fu(String name) {
		this.name=name;
		System.out.println("Fu����ι���...");
	}
}
class Zi extends Fu{
	int x = 20;

	public Zi(String name){
		super(name); //ָ�����ø���һ�������Ĺ��캯����
	}

	public void print(){
		System.out.println(x);
	}
}
public class Demo04 {
	public static void main(String[] args) {
		Zi z=new Zi("wpx");
		System.out.println(z.name);
	}

}
