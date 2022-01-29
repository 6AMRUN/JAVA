/// @author 6AMRUN
/// @version The date as 2021-1-27
/// @brief Java code that computes future value of an investment
/// @note Total time taken to develop, write, test and debug this
/// solution: 2 hrs

import java.util.Scanner;

public class Project1_Week1 {

  public static void main(String[] args) {
	 // Create Scannr Input
	  Scanner input = new Scanner(System.in);

	 // User Inputs Such as principal, time, rate, and years
	 System.out.print("Enter the amouint you wish to deposit: ");
	 double principal = input.nextDouble();

	 System.out.print("Enter the interest rate: ");
	 double rate = input.nextDouble();

	 System.out.print("Enter the number of times per year that the interest is compounded: ");
	 double times = input.nextDouble();

	 System.out.print("Enter the number of years for the account to earn interest: ");
	 int years = input.nextInt();

	 // calculate the annualrate
	 double annualrate = rate/100;

	// Compute the Balance
	double balance = principal * Math.pow(1 + (annualrate/times),times * years);

	// Compute value for pi
	double Pi = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

	// Display the result
	System.out.println("Deposited amount: $" + (int)principal);
	System.out.println("Annual interest rate: " + (int)rate + "%");
	System.out.println("Interested compounded " + (int)times + " per year");
	System.out.println("Number of years: " + years );
	System.out.println("Final balance after " + years +
	" at an annual rate of " + (int)rate +
	"% compounded " + (int)times +
	" times per year is: $" + (int)(balance * 100) / 100.0);

	System.out.println("Estimated value for pi = " + Pi );

	input.close();
  	}//Main

 }