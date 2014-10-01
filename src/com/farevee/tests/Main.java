package com.farevee.tests;

import java.io.PrintWriter;

import com.farevee.groceries.BulkContainer;
import com.farevee.groceries.BulkFood;
import com.farevee.groceries.BulkItem;
import com.farevee.groceries.ManyPackages;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;
import com.faravee.shopping.ShoppingCart;
import com.farevee.groceries.Package;
public class Main
{

  public static void main(String args[])
    throws Exception
  {
    PrintWriter p = new PrintWriter(System.out,true);
    BulkFood banana = new BulkFood("banana", 50, Units.POUND, 2);

    BulkItem aBanana = new BulkItem(banana, 6, Units.POUND); //6 ounces of bananas
    BulkItem aBanana2 = new BulkItem(banana, 7, Units.POUND); //6 ounces of bananas

    BulkItem bananaBag = new BulkContainer("bag", banana, 14, Units.POUND); //bag of bananas that is 14 pounds
    BulkItem bananaBag2 = new BulkContainer("bag", banana, 14, Units.POUND); //bag of bananas that is 14 pounds
    
    Package ramen = new Package("ramen",5,Units.GRAM,10);
    Package ramen2 = new Package("ramen",5,Units.GRAM,10);
    
    ManyPackages ramenCase= new ManyPackages(ramen,1);
    ManyPackages ramenCase2= new ManyPackages(ramen,1);
    ManyPackages ramenCase3= new ManyPackages(ramen,1);
   
    
    
    p.println(aBanana.getPrice());
    p.println(aBanana.toString());
    p.println(aBanana.getWeight().toString());
    p.println(aBanana.equals(aBanana2));
    p.println(bananaBag.toString());
    p.println(bananaBag.equals(bananaBag2));
   
    ShoppingCart cart = new ShoppingCart();
    cart.addItem(ramenCase);
    cart.addItem(aBanana);
    cart.addItem(ramen);
    cart.addItem(ramenCase2);
    cart.addItem(ramenCase);
    cart.addItem(ramen);
    cart.addItem(ramenCase2);
    cart.addItem(ramenCase);
    cart.addItem(ramen);
    cart.remove("banana");
    cart.printContents(p);
   cart.merge(); //doesn't work!
   cart.printContents(p);
    
    Weight[] weights = cart.getWeight();
    p.println(weights[0].toString());
    p.println(weights[1].toString());
    p.println(weights[2].toString());
    p.println(weights[3].toString());
  
    //
  }
}
