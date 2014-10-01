package com.farevee.groceries;

public class Weight
{
  int quantity;
  Units unit;

  /**
   * 
   * @param u - a unit of type Units
   * @param n - an integer specifying how many units
   */
  public Weight(Units u, int n)
  {
    unit = u;
    quantity = n;
  }

  public String toString()
  {
    if (quantity > 1)
      return String.valueOf(quantity) + " " + unit.plural;

    return String.valueOf(quantity) + " " + unit.name;
  }

  public String toStringAbrev()
  {
    return String.valueOf(quantity) + " " + unit.abbrev;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public Units getUnit()
  {
    return unit;
  }

  public boolean equals(Object o)
  {
    if (o instanceof Weight)
      {
        Weight otherWeight = (Weight) o;
        return (unit.equals(otherWeight.unit) && quantity == otherWeight.quantity);
      }
    return false;
  }
}
