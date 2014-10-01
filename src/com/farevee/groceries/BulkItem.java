package com.farevee.groceries;

public class BulkItem
    implements Item
{
  BulkFood type;
  Weight weight;

  public BulkItem(BulkFood type, int quantity, Units u) throws Exception
  {
    if (!type.unit.equals(u))
      throw new Exception("Units must match"); //if the units are not equal. 
    this.type = type;
    this.weight = new Weight(u, quantity);

  }//BulkItem

  public Weight getWeight()
  {
    return weight;
  }//getWeight

  public int getPrice()
  {

    return weight.getQuantity() * type.pricePerUnit;
  }//getPrice

  public String toString()
  {
    return weight.toString() + " of " + type.toString(); 
  }//toString

  public boolean equals(Object o)
  {

    if (o instanceof BulkItem)
      {
        BulkItem otherItem = (BulkItem) o;
        return (otherItem.weight.equals(weight) && otherItem.type.equals(type));
      }//if
    return false;

  }//equals

  @Override
  public String getName()
  {
    return type.name;
  }

}//class
