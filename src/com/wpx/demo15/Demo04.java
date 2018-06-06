package com.wpx.demo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * �������������� : �������������� ��Ҫ������������д�������Ϣ���ȡ�������Ϣ�� ������Ϣһ��д���ļ�����ô�������Ϣ�Ϳ��������־û���
 
 ������������ ObjectOutputStream .
�����������: ObjectInputStream 
 
 ObjectOutputStream��ʹ�ò��裺
 
 �������������Ҫע���ϸ�ڣ�
 	1. ���������Ҫ��д�����ļ��ϣ���ô���������������Ҫʵ��Serializable�ӿڡ� Serializable�ӿ�û���κεķ�������һ����ʶ�ӿڶ��ѡ�
 	2. ����ķ����л����������ʱ�򲢲�����õ����췽���ġ�
 	3. serialVersionUID �����ڼ�¼class�ļ��İ汾��Ϣ�ģ�serialVersionUID
 	���������ͨ��һ�������������Ա�������������������һ�����֡�
 	4. ʹ��ObjectInputStream�����л���ʱ��ObjeectInputStream���ȶ�ȡ�ļ��е�serialVersionUID��
 	Ȼ���뱾�ص�class�ļ���serialVersionUID
 	���жԱȣ����������id��һ�£���ô�����л���ʧ���ˡ�
 	5. ������л��뷴���л���ʱ����ܻ��޸���ĳ�Ա����ô���һ��ʼ�͸������ָ��һ��serialVersionUID��
 	���һ���Ѿ�ָ����serialVersionUID��Ȼ��
 	�����л��뷴���л���ʱ��jvm���������Լ������ class��serialVersionUID�ˡ�
 	6. ���һ������ĳ�����ݲ��뱻���л���Ӳ���ϣ�����ʹ�ùؼ���transient���Ρ�
 	7. ���һ����ά��������һ��������ã���ô����һ����Ҳ��Ҫʵ��Serializable�ӿڡ�
 * @author wangpx
 */
@SuppressWarnings("all")
class Person implements Serializable{
	int age;
	String  name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class Demo04 {

	public static void main(String[] args) throws Exception {
		writeObj();
		readObj();
	}
	//��������л���
	public static void writeObj() throws IOException{
		//�ҵ��ļ�
		File file=new File("D:/demo04.java");
		//����������ܵ�
		FileOutputStream os=new FileOutputStream(file);
		//Person person=new Person(21, "wangpx");
		Student student =new Student(1, "wpx01");
		//������������������
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
		//�Ѷ���д��
		//objectOutputStream.writeObject(person);
		objectOutputStream.writeObject(student);
		//�ر���Դ
		os.close();
	}
	//����ķ����л���
	public static void readObj() throws Exception{
		//�ҵ��ļ�
		File file=new File("D:/demo04.java");
		//�����������ܵ�
		FileInputStream in=new FileInputStream(file);
		//�������������������
		ObjectInputStream objectInputStream = new  ObjectInputStream(in); 
		////��ȡ������Ϣ
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student);
		objectInputStream.close();
		
	}
}
