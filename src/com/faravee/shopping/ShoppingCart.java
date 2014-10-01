package com.faravee.shopping;


import java.io.PrintWriter;
import java.util.ArrayList;

import com.farevee.groceries.Item;
import com.farevee.groceries.BulkFood;
import com.farevee.groceries.BulkItem;
import com.farevee.groceries.ManyPackages;
import com.farevee.groceries.Package;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;

public class ShoppingCart
{
  ArrayList<Item> cart;
  int extraItems;

  public ShoppingCart()
  {
    cart = new ArrayList<Item>();
    extraItems = 0;
  }//ShoppingCart

  public void addItem(Item item)
  {
    cart.add(item);
    if (item instanceof ManyPackages) //keep track of extra packages
      extraItems += ((ManyPackages) item).getCount() - 1; //subtract by one so that we don't count it twice
  }//addItem

  public int numThings()
  {
    return cart.size() + extraItems;
  }//numThings

  public int numEntries()
  {
    return cart.size();
  }//numEntries

  public void printContents(PrintWriter p)
  {
    for (int i = 0; i < cart.size(); i++)
        p.println(cart.get(i).toString());
    
  }//printContents

  public int getPrice()
  {
    int result = 0;

    for (int i = 0; i < cart.size(); i++)
      result += cart.get(i).getPrice(); //add them all together

    return result;
  }//get price

  public Weight[] getWeight()
  {
    //four types: weights[0] = grams; weights[1] = kilograms; weights[2] = ounces; weights[3] = pounds;
    Weight[] weights = new Weight[4]; //initialize array that will be returned
    int gramCount = 0;
    int kilogramCount = 0;
    int ounceCount = 0;
    int poundCount = 0;

    for (int i = 0; i < cart.size(); i++) //find all occurences of different weights and add them up
      {
        if (cart.get(i).getWeight().getUnit().equals(Units.GRAM))
          gramCount += cart.get(i).getWeight().getQuantity();

        if (cart.get(i).getWeight().getUnit().equals(Units.KILOGRAM))
          kilogramCount += cart.get(i).getWeight().getQuantity();

        if (cart.get(i).getWeight().getUnit().equals(Units.OUNCE))
          ounceCount += cart.get(i).getWeight().getQuantity();

        if (cart.get(i).getWeight().getUnit().equals(Units.POUND))
          poundCount += cart.get(i).getWeight().getQuantity();
      }//for
    weights[0] = new Weight(Units.GRAM, gramCount);
    weights[1] = new Weight(Units.KILOGRAM, kilogramCount);
    weights[2] = new Weight(Units.OUNCE, ounceCount);
    weights[3] = new Weight(Units.POUND, poundCount);
    return weights;
  }//getWeight

  public void remove(String name)
  {
    for (int i = 0; i < cart.size(); i++)
      {
        if (name == cart.get(i).getName())
          {
            cart.remove(i);
          }//if name == name
      }//for
  }//remove

  /*
  merge(). Finds identical items and merges them into a single item. 
  For example, if you have two Package items with the same name, weight, and price, you should combine them into a single ManyPackages object. 
  
  If you have a ManyPackages object and a Package object of the same kind, you should combine them. 
  
  Continuing, if you have two ManyPackages objects that contain the same kind of package, you should combine them into a single ManyPackages object. 
  
  Similarly, if you have two BulkItem objects with the same food and units, you should combine them into one BulkItem. 
  
  However, there is no way to combine BulkContainer objects with anything. This method does not need to do anything with NonFood objects.
  public void merge()
  */
  public void merge() //DOESN'T WORK AT ALL 
  {
    boolean foundManyPackage = false;
    int ManyPackageIndex = 0;
    for (int i = 0; i < cart.size(); i++)
      {
        if (cart.get(i) instanceof ManyPackages && foundManyPackage) //if the second ManyPackage has been found
          {
            ManyPackages temp = (ManyPackages) cart.get(i);
            ManyPackages temp2 = (ManyPackages) cart.get(ManyPackageIndex);

            if (temp.getPackage().equals(temp2.getPackage()))//if their packages are the same
              {
                if(i!=cart.size()-1){
                cart.remove(i); //remove old ManyPackages
                cart.remove(ManyPackageIndex);
                cart.add(i,new ManyPackages(temp.getPackage(), temp.getCount()
                                                             + temp2.getCount())); //replace with combined Manypackage
                
                ManyPackageIndex=i;
                }
                else
                  {
                    
                  }
              }//if packages =
          }//if instance of ManyPackage
        
        else if (cart.get(i) instanceof ManyPackages)
          {
            foundManyPackage = true;
            ManyPackageIndex = i;
         }//else if ManyPackages
        
      }//for

    
  }//merge
}//class
