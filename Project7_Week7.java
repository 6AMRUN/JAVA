/// @author 6AMRUN
/// @version The date: 3/15/2021
/// Finished Date: 3/18/2021
/// @brief Create a program using the concepts of OOP, using 2 constructors that accepts
/// The name and number of the month and displays if month name and month number is invalid
/// @note Total time taken to develop, write, test and debug this
/// solution: 5-8 hrs

import java.util.Scanner;

public class Project7_Week7 {
    public static final Scanner input = new Scanner(System.in); // Global Scanner

    public static void main(String[] args) {

        // Variables used in Main Method
        int number = 0;
        String name = "";

        // Declaring Object Variables
        Month month = new Month();
        Month months = new Month(5); // Declaring 5 as the reference value

        // Should output 1
        System.out.println("Using the no-arg constructor, month number = " + month.getMonthNumber());
        // Should output 5
        System.out.println("Using the constructor with an argument, month number = " + months.getMonthNumber());

        // WHILE Loop, If number does not equal -99
        while (number != -99) {
            System.out.println("Enter a month number to create an object - enter -99 when done");
            number = input.nextInt();

             // IF Loop, if number does equal 99
            if (number == -99){
            	input.nextLine();

            	// WHILE Loop, if name does not equal the word done
            	while (!name.equalsIgnoreCase("done")) {
					System.out.println("Enter the name of a Month - enter the word done to exit program");
					name = input.nextLine();

					if (name.equals("done")) {
						System.out.println("Goodbye!");
					} // IF

					else {
					// Create Object Variable for String Variable
					Month monthName = new Month(name);
					System.out.println("The month name set is: " + monthName.getMonthName());
					System.out.println("The month number set is: " + monthName.getMonthNumber());
					} // End of Else

				}  // End of While

			} // End of IF

			else {
				// Create Object Variable for Input Variable
            	Month monthNum = new Month(number);
            	System.out.println("The month number set is: " + monthNum.getMonthNumber());
			} // End of Else

        } // End of While

    } // Main Method

} // Class

class Month {

	// Variable used in this Class
    public int monthNumber;

    // Create a no-arg constructor and set monthNumber field to 1
    Month() {
        monthNumber = 1;
    } // End of Constructor

    // Constructor
    // Accepts integer argument to assign to monthNumber
	// Else sets the number to 1 if the value is not between 1 and 12
    // Parameter 1: number - int
    Month(int number) {
        if (number >= 1 && number <= 12) {
            monthNumber = number;
        } else {
            monthNumber = 1;
        }
    } // End of Constructor with int

	// Void Method
	// Accepts integer argument to assign to monthNumber
	// Else sets the number to 1 if the value is not between 1 and 12
	// Parameter 1: number - int
	// Returns: Nothing
    public void setMonthNumber(int number) {
        if (number >= 1 && number <= 12) {
            monthNumber = number;
        } else {
            monthNumber = 1;
        }
    } // End of setMonthNumber Method


	// int Method
	// returns the name of the value of the monthNumber
	// No Parameter
	// Returns: Nothing
    public int getMonthNumber() {
        return monthNumber;
    } // End of getMonthNumber Method

    // Constructor
    // Accepts name of month, sets the monthNumber to corresponding value
	// Not case sensitive, if invalid month, MonthNumber set to 1
    // Parameter 1: name - String
    Month(String name) {
        if (name.equalsIgnoreCase("january")) {
            monthNumber = 1;
        } else if (name.equalsIgnoreCase("february")) {
            monthNumber = 2;
        } else if (name.equalsIgnoreCase("march")) {
            monthNumber = 3;
        } else if (name.equalsIgnoreCase("april")) {
            monthNumber = 4;
        } else if (name.equalsIgnoreCase("may")) {
            monthNumber = 5;
        } else if (name.equalsIgnoreCase("june")) {
            monthNumber = 6;
        } else if (name.equalsIgnoreCase("july")) {
            monthNumber = 7;
        } else if (name.equalsIgnoreCase("august")) {
            monthNumber = 8;
        } else if (name.equalsIgnoreCase("september")) {
            monthNumber = 9;
        } else if (name.equalsIgnoreCase("october")) {
            monthNumber = 10;
        } else if (name.equalsIgnoreCase("november")) {
            monthNumber = 11;
        } else if (name.equalsIgnoreCase("december")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    } // End of Month Constructor with String


    // Void Method
	// Accepts name of month, sets the monthNumber to corresponding value
	// Not case sensitive, if invalid month, MonthNumber set to 1
	// Parameter 1: name - String
	// Returns: Nothing
    public void setMonthName(String name) {
        if (name.equalsIgnoreCase("january")) {
            monthNumber = 1;
        } else if (name.equalsIgnoreCase("february")) {
            monthNumber = 2;
        } else if (name.equalsIgnoreCase("march")) {
            monthNumber = 3;
        } else if (name.equalsIgnoreCase("april")) {
            monthNumber = 4;
        } else if (name.equalsIgnoreCase("may")) {
            monthNumber = 5;
        } else if (name.equalsIgnoreCase("june")) {
            monthNumber = 6;
        } else if (name.equalsIgnoreCase("july")) {
            monthNumber = 7;
        } else if (name.equalsIgnoreCase("august")) {
            monthNumber = 8;
        } else if (name.equalsIgnoreCase("september")) {
            monthNumber = 9;
        } else if (name.equalsIgnoreCase("october")) {
            monthNumber = 10;
        } else if (name.equalsIgnoreCase("november")) {
            monthNumber = 11;
        } else if (name.equalsIgnoreCase("december")) {
            monthNumber = 12;
        } else {
            monthNumber = 1;
        }
    } // End of setMonthName Method


    // Srting Method
	// No Parameter
	// Returns: The name of the Month
    public String getMonthName() {
        String name = " ";
        if (monthNumber == 1) {
            name = "January";
        } else if (monthNumber == 2) {
            name = "February";
        } else if (monthNumber == 3) {
            name = "March";
        } else if (monthNumber == 4) {
            name = "April";
        } else if (monthNumber == 5) {
            name = "May";
        } else if (monthNumber == 6) {
            name = "June";
        } else if (monthNumber == 7) {
            name = "July";
        } else if (monthNumber == 8) {
            name = "August";
        } else if (monthNumber == 9) {
            name = "September";
        } else if (monthNumber == 10) {
            name = "October";
        } else if (monthNumber == 11) {
            name = "November";
        } else if (monthNumber == 12) {
            name = "December";
        }
        return name;
    } // End of getMonthName Method

} // Class