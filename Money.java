/********
 Author: La'Brea Harley
 Program: Money class - program assignment #1
 Due Date:
 Purpose:
 ********/

import java.util.*;
import java.text.*;

public class Money
{
    // declare class variables
    int hundreds int tens int fives int ones int quarters int dimes int nickles int pennies

    double total; // used to store the Money value as a double precision floating point number like 34.2
    // you will need more variables declared here to handle each of the currency types; for example int hundreds to keep track of how many hundred dollar bills

    // this one will help you print floating point values in US currency format like $10.50
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    // convert current currency values to a string
    public String toString()
    {String currency = format.format(number);}
    Sytem.out.println(dollar value + currency);
    return hundreds + " hundreds " + tens + " tens " + fives + " fives " + ones + " ones " + quarters + " quarters " + dimes + " dimes " + nickles + " nickles " + pennies + " pennies "
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
    int hundreds int tens int fives int ones int quarters int dimes int nickles int pennies
    hundreds = s.nextInt(); tens = s.nextInt(); fives = s.nextInt(); ones = s.nextInt(); quarters = s.nextInt(); dimes = s.nextInt(); nickles = s.nextInt(); pennies = s.nextInt();
    total = hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.10 + nickles*.05 + pennies*.01
    System.out.printIn(total);
    }

    // read from Scanner s and process float command
    // convert float to change
    // output results
    public void processFloat(Scanner s)
    {

    double total = s.nextDouble();
    hundreds = (int)(total/100);
    total = total-(hundreds*100);
    tens = (int)(total/10);
    total = total-(hundreds*10);
    fives = (int)(total/5);
    total = total(fives*5);
    ones = (int)(total/1);
    total = total-(ones*1);
    quarters = (int)(total/.25);
    total = total-(quarters*.25);
    dimes = (int)(total/.10);
    total = total-(dimes*.10);
    nickles = (int)(total/.05);
    total = total-(nickles*.05);
    pennies = (int)(total/.01);
    total = toal-(pennies*.01);
    s.nextline();

    system.out.print("Payment Composition: ");
    system.out.print("Hundreds: " + hundreds + "Tens: " + tens + "Fives: " + fives + "Ones: " + ones + "Quarters: " + quarters + "Dimes: " + dimes + "Nickles: " + nickles + "Pennies: " + pennies)

    }

    // read from Scanner s and process check command
    // convert float to dollar words & cents
    // output results
    public void processCheck(Scanner s)
    {

    }

    // read from Scanner s and process change-float command
    // read float of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeFloat(Scanner s)
    {


    customerpayment = s.nextfloat();


    transactioncost = s.nextfloat();

    double change = transcactioncost - customerpayment;
    int changehundreds = (int)(change/100);
    change = change-(changehundreds*100);
    int changetens = (int)(change/10);
    change = change-(changehundreds*10);
    int changefives = (int)(change/5);
    change = change-(changefives*5);
    int changeones = (int)(change/1);
    change = change-(changeones*1);
    int changequarters = (int)(change/.25);
    change = change-(changequarters*.25);
    int changedimes = (int)(change/.10);
    change = change-(changedimes*.10);
    int changenickles = (int)(change/.05);
    change = change-(changenickles);
    int changepennies = (int)(change/.01);
    change = change-(changepennies*.01);



  }

  // read from Scanner s and process change-change command
  // read change of customer payment
  // read float of transaction cost
  // calculate difference and compute change values
  // output the results
  public void processChangeFloat(Scanner s)
  {
  //change-change//


  int hundreds int tens int fives int ones int quarters int dimes int nickles int pennies
  system.out.print("hundreds:");
  hundreds = s.nextInt();
  system.out.print("tens:");
  tens = s.nextInt();
  system.out.print("fives:");
  fives = s.nextInt();
  system.out.print("ones:");
  ones = s.nextInt();
  system.out.print("quarters:");
  quaters = s.nextInt();
  system.out.print("dimes:");
  dimes = s.nextInt();
  system.out.print("nickles:");
  nickles = s.nextInt();
  system.out.print("pennies:");
  pennies = s.nextInt();
  double total = hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.10 + nickles*.05 + pennies*.01
