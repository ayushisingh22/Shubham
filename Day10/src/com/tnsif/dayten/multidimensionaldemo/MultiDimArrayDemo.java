package com.tnsif.dayten.multidimensionaldemo;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		
		int c[][]= { {12,45} , {10,20}, {5,7}, {10,20}, {5,7} }; //new int[3] [2];

		System.out.println("Np. of row  in C array :"+ c.length);
		
		MLArray.printArray(c);
	}

}