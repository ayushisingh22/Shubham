package com.tnsif.dayten.multidimensionaldemo;


class JaggedArray{
	
	static void printArray(int d[][])
	{
		System.out.println("Array Elements are as follow : ");
		for( int i=0; i<d.length; i++) 
		{
			for( int j=0; j<d[i].length; j++) // column
			{
				System.out.print(d[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
}
