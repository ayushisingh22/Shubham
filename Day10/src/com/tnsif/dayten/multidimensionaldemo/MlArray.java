package com.tnsif.dayten.multidimensionaldemo;


class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follow : ");
		for( int i=0; i<c.length; i++) 
		{
			for( int j=0; j<c[i].length; j++) // column
			{
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
}



