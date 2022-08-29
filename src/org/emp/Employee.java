package org.emp;

public class Employee {

	private void empId(int id1) {
		System.out.println("Employee1 Id :"+id1);
	}
	private void empId(short id2) {
		System.out.println("Employee2 Id :"+id2);
	}
	private void empId(long id3) {
		System.out.println("Employee3 Id :"+id3);		
	}
public static void main(String[] args) {
	Employee e =new Employee();
	e.empId(2344);
	e.empId(122);
	e.empId(8765l);
}	
}
