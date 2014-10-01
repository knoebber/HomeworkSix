package com.farevee.groceries;

public class BulkContainer
    extends BulkItem
{
  
  String container;
  public BulkContainer(String container, BulkFood type, int quantity, Units u) throws Exception
  {
    super(type, quantity, u); //call BulkItems constructor
    this.container = container;
  }

  public String toString()
  {
    return container + " of " + super.toString();  //just return the container plus the BulkItems toString
  }

  public boolean equals(Object o)
  {
    if (o instanceof BulkContainer)
      {
        BulkContainer otherItem = (BulkContainer) o;
        return (super.equals(otherItem) && container == otherItem.container);
      }
    return false;
  }//if
}
