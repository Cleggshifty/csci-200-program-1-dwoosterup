/********
 Author: Khali Clegg
 Program: Money class - program assignment #1
 Due Date:
 Purpose:
 ********/

import java.util.*;
import java.text.*;

public class Program-1
{
    // declare class variables
    int hundreds; int tens; int fives; int ones; int quarters; int dimes; int nickles; int pennies;

    double total; double customerpayment; double transactioncost; // used to store the Money value as a double precision floating point number like 34.2
    // you will need more variables declared here to handle each of the currency types; for example int hundreds to keep track of how many hundred dollar bills

    // this one will help you print floating point values in US currency format like $10.50
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    // convert current currency values to a string
    public String toString()
    {
      return hundreds + " hundreds " + tens + " tens " + fives + " fives " + ones + " ones " + quarters + " quarters " + dimes + " dimes " + nickles + " nickles " + pennies + " pennies ";
    }

    // converts amount to US currency format
    public String toCurrency(double amount)
    {
      return nf.format(Math.round(amount * 100.0) / 100.0);
    }

    // convert currency to float
    // read currency values from Scanner s and compute value
    // output results
    public void processChange(Scanner s)
    {
    hundreds = s.nextInt(); tens = s.nextInt(); fives = s.nextInt(); ones = s.nextInt(); quarters = s.nextInt(); dimes = s.nextInt(); nickles = s.nextInt(); pennies = s.nextInt();
    total = hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.10 + nickles*.05 + pennies*.01;
    System.out.println(toCurrency(total));
    }

    // read from Scanner s and process float command
    // convert float to change
    // output results
    public void processFloat(Scanner s)
    {

    double total = s.nextDouble();
    hundreds = (int)total/100;
    total = total-(hundreds*100);
    tens = (int)total/10;
    total = total-(tens*10);
    System.out.println(total);
    fives = (int)total/5;
    total = total-(fives*5);
    ones = (int)total/1;
    total = total-(ones*1);
    total = total * 100;
    quarters = (int)total/25;
    total = total-(quarters*25);
    dimes = (int)total/10;
    total = total-(dimes*10);
    nickles = (int)total/5;
    total = total-(nickles*5);
    pennies = (int)total/1;
    total = total-(pennies*1);
    s.nextLine();

    System.out.print("Payment Composition: ");
    System.out.print("Hundreds: " + hundreds + "Tens: " + tens + "Fives: " + fives + "Ones: " + ones + "Quarters: " + quarters + "Dimes: " + dimes + "Nickles: " + nickles + "Pennies: " + pennies);

    }

    // read from Scanner s and process check command
    // convert float to dollar words & cents
    // output results
    public void processCheck(Scanner s)
    {
      float total = s.nextFloat();

  		int dollars = (int) total;
  		String cents = String.format("%.2f", (total - dollars)).substring(2);

  		System.out.println(dollars + " dollars " + cents + " cents ");

    }

    // read from Scanner s and process change-float command
    // read float of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeFloat(Scanner s)
    {


    customerpayment = s.nextFloat();


    transactioncost = s.nextFloat();

    double change = customerpayment - transactioncost;
    int changehundreds = (int)(change/100);
    change = change-(changehundreds*100);
    int changetens = (int)(change/10);
    change = change-(changehundreds*10);
    int changefives = (int)(change/5);
    change = change-(changefives*5);
    int changeones = (int)(change/1);
    change = change-(changeones*1);
    int changequarters = (int)(change/25);
    change = change-(changequarters*25);
    int changedimes = (int)(change/10);
    change = change-(changedimes*10);
    int changenickles = (int)(change/5);
    change = change-(changenickles);
    int changepennies = (int)(change/1);
    change = change-(changepennies*1);

System.out.print("Payment Composition: ");
System.out.println("changehundreds: " + changehundreds + " changetens: " + changetens + " changefives: " + changefives + "changeones: " + changeones + "changequarters: " + changequarters + "changedimes: " + changedimes + "changenickles: " + changenickles + "changepennies: " + changepennies);

}

  // read from Scanner s and process change-change command
  // read change of customer payment
  // read float of transaction cost
  // calculate difference and compute change values
  // output the results
  public void processChangeChange(Scanner s)
  {
  //change-change//
  System.out.print("hundreds:");
  hundreds = s.nextInt();
  System.out.print("tens:");
  tens = s.nextInt();
  System.out.print("fives:");
  fives = s.nextInt();
  System.out.print("ones:");
  ones = s.nextInt();
  System.out.print("quarters:");
  quarters = s.nextInt();
  System.out.print("dimes:");
  dimes = s.nextInt();
  System.out.print("nickles:");
  nickles = s.nextInt();
  System.out.print("pennies:");
  pennies = s.nextInt();

      System.out.print("price: ");
  transactioncost = s.nextDouble();
  double total = hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.10 + nickles*.05 + pennies*.01;
  System.out.print(toCurrency( total- transactioncost));
  }
}
