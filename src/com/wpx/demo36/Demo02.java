package com.wpx.demo36;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

class Employee {
	
	private int id;
	private String name;
	private int age;
	private Double salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, Double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
}
public class Demo02 {
	List<Employee> emps = Arrays.asList(
			new Employee(101, "����", 18, 9999.99),
			new Employee(102, "����", 59, 6666.66),
			new Employee(103, "����", 28, 3333.33),
			new Employee(104, "����", 28, 7777.77),
			new Employee(105, "����", 38, 5555.55)
	);

	/**
	 * �������,������ͬ���Ա��
	 */
	@Test
	public void test01() {
		Collections.sort(emps, (e1,e2) -> {
			if(e1.getAge() == e2.getAge()) {
				return -e1.getName().compareTo(e2.getName());
			}else {
				return -Integer.
						compare(e1.getAge(),e2.getAge());
			}
		} );
		emps.stream().forEach( e -> System.out.println(e) );
	}
}
