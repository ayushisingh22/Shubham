package com.tnsif.dayten.multidimensionaldemo;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int d[][]= { {10,20,30,40} , {20}, {12,24} , {1,2,3,4,5,6,7} , {1,10} };
		
		System.out.println("Total Rows in Array " + d.length);
		
		JaggedArray.printArray(d);

	}

}
