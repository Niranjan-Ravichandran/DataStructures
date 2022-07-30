package com.example.demo;

import lombok.Getter;
import lombok.Setter;

public class ObjectReference {
	@Getter
	@Setter
	class Employee{
		public Employee(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public Employee() {
			// TODO Auto-generated constructor stub
		}
		int id;
		String name;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id+"==>"+this.name;
		}
		
	}
	
	public static void main(String[] args) {
		ObjectReference o =new ObjectReference();
		ObjectReference.Employee e1 = o.new Employee(1, "Jan");
		ObjectReference.Employee e2 = o.new Employee();
		e2 = e1;
		ObjectReference.Employee e3 = e2;
		e3.setName("Jack");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1==e2);
		System.out.println(e1==e3);
	}

}
