package com.wpx.demo09;
/**
 * Object������������ռ����ࡣ �κ�һ���඼�̳���Object�ࡣ


Object�ࣺ


Object�ೣ�õķ�����
	toString();     ���ظö�����ַ�����ʾ�� ����һ���ַ������������ö���ġ�
	
	equals(Object obj)   ���ڱȽ�����������ڴ��ַ���ж����������Ƿ�Ϊͬһ������
	
	hashCode()   ���ظö���Ĺ�ϣ��ֵ(��ҿ��԰ѹ�ϣ��� �����Ƕ�����ڴ��ַ)
	
 * @author wangpx
 */
class Student{
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class Demo01 {

	public static void main(String[] args) {
		Student s1=new Student("wpx", 21);
		Student s2=new Student("wangpx", 21);
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 hashCode "+s1.hashCode());
		System.out.println("s1 hashCode "+s2.hashCode());
		
		System.out.println(s1);
		
}
}
