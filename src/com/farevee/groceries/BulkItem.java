package com.farevee.groceries;

public class BulkItem implements Item{
	String type;
	Weight weight;
	int price;
	
	public BulkItem(String type,int quantity, Units u, int price)
	{
		this.type=type;
		this.weight= new Weight(u,quantity);
		this.price=price;
		
	}
	
	
	public Weight getWeight() {
		return weight;
	}

	
	public int getPrice() {
		
		return weight.getQuantity()*price;
	}
	
	public String toString()
	{
		return weight.toString()+" of "+type;
	}
	
	public boolean equals(Object o)
	{
		
		if(o instanceof BulkItem)
		{
			BulkItem otherItem = (BulkItem) o;
			return(otherItem.price==price && otherItem.weight.equals(weight) && otherItem.type==type);
		}
		return false;
	
	}
	

}
