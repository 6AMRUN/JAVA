/// @author 6AMRUN
/// @version The date: 2021-2-1
/// @brief Java program that calculates the cost for renting rooms at a hotel
/// @note Total time taken to develop, write, test and debug this
/// solution: 6 hrs

 import java.util.Scanner;

 public class Project2_Week2
 {
 	  public static void main(String[] args)
   {
 	  Scanner input = new Scanner(System.in);

 	  // Defining Constants
 	  double discount = 0;
 	  double addon = 0;
 	  int rentPrice;
 	  double roomDiscount = 0;

 	  // User Inputs
 	  System.out.print("What is the cost of renting one room for one night? ");
 	   int roomPrice = input.nextInt();

 	  System.out.print("How may rooms are booked? ");
 	   int roomsBooked = input.nextInt();

 	  System.out.print("How many days are the rooms booked for? ");
 	   int daysBooked = input.nextInt();

 	  System.out.print("What is the sales tax? (For example, if tax is 15.5%, enter 15.5.) ");
 	  Double salesTax = input.nextDouble();

 	  rentPrice = roomPrice * roomsBooked * daysBooked;// Compute for Rent Price

 	  	if (daysBooked >= 3){
			addon = 5;
			roomDiscount = rentPrice - (rentPrice * .05);
			}// IF Statement for daysBooked

		if (roomsBooked <= 0){
			System.out.println("Error: Invalid input.");
			System.exit(0);
		}
		 else if (roomsBooked >= 21 &&  daysBooked >= 3){
			 discount = 30;
			 roomDiscount = rentPrice - (rentPrice * .35);
			 }
		 else if (roomsBooked >= 21){
			 discount = 30;
			 roomDiscount = rentPrice - (rentPrice * .30);
			 }
		else if (roomsBooked > 11 && roomsBooked <= 20 && daysBooked >= 3){
			 discount = 20;
			 roomDiscount = rentPrice - (rentPrice * .25);
			 }
		else if (roomsBooked > 11 && roomsBooked <= 20){
			discount = 20;
			roomDiscount = rentPrice - (rentPrice * .20);
			}
		else if (roomsBooked <= 10 && daysBooked >= 3){
			 discount = 10;
			 roomDiscount = rentPrice - (rentPrice * .15);
			}
		else{
			discount = 10;
			roomDiscount = rentPrice - (rentPrice * .10);
			}// IF Statement for roomsBooked

 	 	double tax = rentPrice * (salesTax / 100); // Compute for TAX
		double finalPrice = roomDiscount + tax; // Compute for Final Price

		// Display the result
		System.out.println("Cost for one room: $" + roomPrice);
		System.out.println("Discount on based on number of rooms: " + (int)discount + "%");
		System.out.println("Discount based number of days: " + (int)addon + "%");
		System.out.println("Number of rooms: " + roomsBooked);
		System.out.println("Number of days: " + daysBooked);
		System.out.println("Total cost before Tax: $" + (int)roomDiscount);
		System.out.println("Tax: $" + tax);
		System.out.println("Total Bill: $" + (int)(finalPrice * 100) / 100.0);

		input.close();
   } // Main
}