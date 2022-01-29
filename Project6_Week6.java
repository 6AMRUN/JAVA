/// @author 6AMRUN
/// @version The date: 2021-3-8
/// Finished Date: 2021-3-12
/// @brief Java program that performs an array for a car dealership
/// Asks the user to enter the number of dealers, and outputs 2 parallel arrays.
/// @note Total time taken to develop, write, test and debug this
/// solution: 5-8 hrs (used an hour or so each day to work on assignment)

import java.util.Scanner;

public class Project6_Week6 {
	public static final Scanner input = new Scanner(System.in); // Global Scanner

	public static void main(String[] args) {

		// My variables used for this assignment
		int dealer;
		double avgTotal;
		double totalSales;
		double totalCommission;

		// Calls the dealers method
		dealer = dealers();

		// Creates arrays for dealerName, dealerSales, commissionRate
		// based on the input for dealer
		String[] dealerName = new String[dealer];
		double[] dealerSales = new double[dealer];
		double[] commissionRate = new double[dealer];

		dealerData(dealer, dealerName, dealerSales); // Calls dealerData method after inputing number of dealers
		getCommission(dealerSales, commissionRate); // Calls getCommission method after array has been created for dealerSales
		totalCommission = getTC(dealer, commissionRate); // Calls getTC to calculate the Total Commission for the dealership
		totalSales = getTotal(dealer, dealerSales); // Calls getTotal method to calculate the Total Sales made
		avgTotal = getAvg(dealer, totalSales); // Calls getAvg method to calculate the Avgerage Sales
		display(dealerName, dealerSales, commissionRate, totalCommission, totalSales, avgTotal); // Calls display method, used to display the output

	} // Main Method

	// Asks user to input number of dealers
	// If number is less than 1 and greater than 20, asks user to try again
	// Paramaters: none
	// Returns: dealer
	public static int dealers(){

		// My variable(s) used in this Method
		int dealer;

		System.out.print("How many dealers would you like to enter: ");
		dealer = input.nextInt();

		// While dealer is less than 1 and greater than 20
		// asks user to input until number is between 1-20
		while (dealer < 1 || dealer > 20) {
			System.out.println("Invalid input.");
			System.out.print("How many dealers would you like to enter (1-20): ");
			dealer = input.nextInt();
			}

		return dealer;

	} // End of dealers Method

	// Used the main method to call dealerData, asks user for the name and sale of the dealer(s)
	// Parameter 1: dealer - int
	// Parameter 2: dealerName - String []
	// Parameter 3: dealerSales - double []
	// Returns: None
	public static void dealerData(int dealer, String[] dealerName, double[] dealerSales) {
		// Variable also used as a index/counter in FOR loop
		int i;

		// FOR Loop i is less than the input (dealer)
		// Ask for name and sale of dealer
		// This will do until i is equal to the input (dealer)
		for (i = 0; i < dealer; i++) {
			System.out.print("Please enter the name for dealer " + (i + 1) + ": ");
			// Will input the create name in array based on the index, which starts with 0
			dealerName[i] = input.next();

			System.out.print("Please enter sale total for dealer " + (i + 1) + ": ");
			// Will input the create sale in array based on the index, which starts with 0
			dealerSales[i] = input.nextDouble();

			// WHILE Loop used if the double is less than 0
			while (dealerSales[i] < 0) {
				System.out.println("Error: number cannot be negative.");
				System.out.print("Please enter the sales for dealer " + (i + 1) + ": ");
				dealerSales[i] = input.nextDouble();
				}

			} // End of FOR Loop

	} // End of data Method

	// Called from the main method, creates an array called commissionRate based on dealerSales
	// Calculates the commission array, method returns the array
	// Parameter 1: dealerSales - double []
	// Parameter 2: commissionRate - double []
	// Returns: commissionRate
	public static double[] getCommission(double[] dealerSales, double[] commissionRate) {
		// Variable also used as a index/counter in FOR loop
		int i;

		// FOR Loop if i is less than the length of dealerSales
		// Length: Number of elements that is in the array
		// Inputs a commissionRate based on the index
		for (i = 0; i < dealerSales.length; i++) {

			// IF, ELSE IF used and calculates for the commissionRate by
			// dealerSales multiplied by percentage
			if (dealerSales[i] >= 1 && dealerSales[i] <= 5000) {
				commissionRate[i] = dealerSales[i] * .10;
				}
			else if (dealerSales[i] > 5000 && dealerSales[i] <= 15000) {
            	commissionRate[i] = dealerSales[i] * .15;
				}
        	else if (dealerSales[i] > 15000) {
            	commissionRate[i] = dealerSales[i] * .20;
				}
			} // End of FOR Loop

		return commissionRate;
	} // End of getCommission array

	// Called from the main method, calculates the Total Commission made
	// Parameter 1: dealer - int
	// Parameter 2: commissionRate - double []
	// Returns: totalCommission
	public static double getTC(int dealer, double[] commissionRate) {
		// Variables used
	    double totalCommission = 0;
	    int i; // Index/counter used in the FOR loop

	    // FOR Loop, if i is less than dealer
	    // Calculate the commissionRate array to get totalCommission
	    for(i = 0; i < dealer; i++) {
			totalCommission += commissionRate[i];
			}

		return totalCommission;
	} // End of getTC Method

	// Called from the main method, calculates the total
	// Parameter 1: dealer - int
	// Parameter 2: dealerSales - double []
	// Returns: totalSales
	public static double getTotal (int dealer, double[] dealerSales) {
		// Variable used
        double totalSales = 0;
        int i; // Index/counter used in the For loop

        // FOR Loop, if i is less than dealer
        // Calculate the dealerSales to get totalSales
        for (i = 0; i < dealer; i++) {
            totalSales += dealerSales[i];
        }

        return totalSales;

	} // End of getTotal Method

	// Called from the main method
	// Calculates the Average Sales
	// Parameter 1: dealer - int
	// Parameter 2: totalSales - double []
	// Returns: avgTotal
	public static double getAvg(int dealer, double totalSales) {
		//Variable used
	    double avgTotal = 0;

	    // Calcutale the totalSales and divide by the value in dealer to get Average Total
	    avgTotal = totalSales / dealer;

	    return avgTotal;

	}// End of getAvg Method

	// Called from the main method, used to display the output
	// Parameter 1: dealerNames - String []
	// Parameter 2: dealerSales - double []
	// Parameter 3: commissionRate - double []
	// Parameter 4: totalCommission - double
	// Parameter 5: totalSales - double
	// Parameter 6: avgTotal - double
	// Returns: None
	public static void display(String[] dealerNames, double[] dealerSales, double[] commissionRate, double totalCommission, double totalSales, double avgTotal) {
		// Variable also used as a index/counter in FOR loop
		int i;

		// Print Name, Sales, Commission
		System.out.print("\n");
		System.out.println("Name \t"
						+  " Sales \t"
						+ "\t Commission");

		// FOR Loop, i is less than the length of dealerSales
		// Print out array for dealerNames, dealerSales, commissionRate
    	for(i = 0; i < dealerSales.length; i++) {
			System.out.print(dealerNames[i]);
			System.out.printf("\t $%.2f " , dealerSales[i]);
			System.out.printf("\t $%.2f " , commissionRate[i]);
        	System.out.print("\n");
    	} // End of FOR Loop

    	// Print totalSales, avgTotal, totalCommission
    	System.out.print("\n");
    	System.out.printf("\nTotal sales: $%.2f " , totalSales);
    	System.out.printf("\nTotal average sales: $%.2f " , avgTotal);
    	System.out.printf("\nTotal in commissions: $%.2f " , totalCommission);
    	System.out.print("\n");

   } // End of display Method

} // Class
