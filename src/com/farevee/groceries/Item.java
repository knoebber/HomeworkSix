package com.farevee.groceries;

public interface Item
{

  public Weight getWeight();

  public int getPrice();

  public String toString();

  public String getName();

  public boolean equals(Object o);

}
