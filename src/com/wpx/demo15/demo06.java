package com.wpx.demo15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 
 * ��ӡ����printStream��  ��ӡ�����Դ�ӡ�������͵����ݣ�
 * ���Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
 * 
 * @author wangpx
 */
class Student6{
	int id;
	String  name;
	public int getId() {
		return id;
	}
	public Student6(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class demo06 {

	@SuppressWarnings("all")
	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("D:/demo06.txt");
		PrintStream printStream = new PrintStream(file);
		printStream.println(" PrintStream ----");
		//��ӡ�����Դ�ӡ�κ����͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
		Student6 s=new Student6(1, "wpx");
		printStream.println(s);
	}
}
