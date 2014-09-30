package com.farevee.tests;

import com.farevee.groceries.BulkContainer;
import com.farevee.groceries.BulkItem;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;

public class Main {
	
	public static void main(String args[]) 
	{
		//ask sam about price per different units. 
		
		BulkItem banana= new BulkItem("banana",6,Units.OUNCE,6);
		BulkItem banana2= new BulkItem("banana",6,Units.OUNCE,6);
		BulkContainer bananaBag= new BulkContainer("banana","bag",5,Units.GRAM,566);
		BulkContainer bananaBag2= new BulkContainer("banana","bag",5,Units.GRAM,566);
		/*
		System.out.println(banana.getPrice());
		System.out.println(banana.toString());
		System.out.println(banana.getWeight().toString());
		*/
		System.out.println(bananaBag.equals(bananaBag2));
		
	}
}
