package com.farevee.groceries;

public class BulkContainer extends BulkItem {
	String type;
	String container;
	Weight weight;
	int price;

	public BulkContainer(String type, String container, int quantity, Units u,
			int price) {
		super(type, quantity, u, price);
		this.container = container;

	}

	public String toString() {
		return container + " of "+super.toString();
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof BulkContainer)
		{
			BulkContainer otherItem = (BulkContainer) o;
			return(super.equals(otherItem)&& container==otherItem.container);
		}
		return false;
	}
}

