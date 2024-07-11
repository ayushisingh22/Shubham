package com.tnsif.dayfive.association.IsA;

public class IsaDem{

	public static void main(String[] args) {

		
		Employee employee=new Employee("Ayushi", 1803, "ENTC");
		Manager manager=new Manager("Nansi", 1002, "Hr", 8);
		
		System.out.println(employee);
		System.out.println("-----------------------------------------------------------");
		System.out.println(manager);
	}

}