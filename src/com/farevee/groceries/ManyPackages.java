package com.farevee.groceries;

public class ManyPackages
    implements Item
{
  Package pack;
  int count;

  public ManyPackages(Package pack, int count)
  {
    this.pack = pack;
    this.count = count;
  }

  public Weight getWeight()
  {
    return pack.getWeight();
  }

  public int getPrice()
  {
    return pack.getPrice();
  }

  public int getCount()
  {
    return count;
  }

  public String toString()
  {
    return String.valueOf(count) + " x " + pack.toString();
  }

  public String getName()
  {
    return pack.type;
  }

  public Package getPackage()
  {
    return pack;
  }

  public boolean equals(Object o)
  {
    if (o instanceof ManyPackages)
      {
        ManyPackages otherItem = (ManyPackages) o;
        return (otherItem.pack.equals(pack) && count == otherItem.count); 
      }//if
    return false;
  }//equals

}
