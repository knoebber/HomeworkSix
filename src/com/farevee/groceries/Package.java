package com.farevee.groceries;

public class Package
    implements Item
{
  Weight weight;
  String type;
  int price;

  public Package(String type, int quantity, Units u, int price)
  {
    this.type = type;
    weight = new Weight(u, quantity);
    this.price = price;
  }

  public Weight getWeight()
  {

    return weight;
  }

  public int getPrice()
  {

    return weight.quantity * price;
  }

  public String toString()
  {
    return weight.toStringAbrev() + " package of " + type;
  }

  public boolean equals(Object o)
  {
    if (o instanceof Package)
      {
        Package otherItem = (Package) o;
        return (otherItem.price == price && otherItem.weight.equals(weight) && otherItem.type == type);
      }//if Package
    return false;
  }

  @Override
  public String getName()
  {
    return type;
  }
}
