package com.farevee.groceries;

public class BulkFood
{
  String name;
  Units unit;
  int amount;
  int pricePerUnit;

  public BulkFood(String name, int amount, Units unit, int price)
  {
    this.name = name;
    this.amount = amount;
    this.unit = unit;
    pricePerUnit = price;
  }//BulkFood

  public String toString()
  {
    return this.name;
  }

  public boolean equals(Object o)
  {
    if (o instanceof BulkFood)
      {
        BulkFood otherItem = (BulkFood) o;
        return (otherItem.name == name && otherItem.amount == amount
                && unit.equals(otherItem.unit) && pricePerUnit == otherItem.pricePerUnit); //if everything is equal
      }//if
    return false;
  }//equals
}//class BulkFood
