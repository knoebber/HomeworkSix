package com.farevee.groceries;

public class NonFood
    implements Item
{
  Weight weight;
  int amount;
  int price;
  String name;

  public NonFood(String name, int amount, Units unit, int price)
  {
    this.name = name;
    this.price = price;
    weight = new Weight(unit, amount); //build a new weight
  }

  public Weight getWeight()
  {
    // TODO Auto-generated method stub
    return weight;
  }

  public int getPrice()
  {
    return weight.getQuantity() * price;
  }

  public String toString()
  {
    return this.name;
  }

  public boolean equals(Object o)
  {
    if (o instanceof NonFood)
      {
        NonFood otherItem = (NonFood) o;
        return (otherItem.name == name && price == otherItem.price && weight.equals(otherItem.getWeight()));
      }//if
    return false;
  }//equals

  public String getName()
  {
    // TODO Auto-generated method stub
    return name;
  }
}//class
