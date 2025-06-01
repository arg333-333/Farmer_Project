package com.cg.controller;

public class Function {

	
	
	public static int temp(double t)
	{
		int count=0;
		t =25.0;
		double a[]= {24.7,25.1,28.9,31.0,28.6,30.6,32.4,23.0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>t)
			{
				count++;
			}
				
		}
		
		return count; 
	}
	
	
	public static void main(String[] args) {
		
		temp(25.0);

	}

}
