/// @author 6AMRUN
/// @version The date: 2021-2-27
/// Finished Date: 2021-2-28
/// @brief Java program that displays a business card, if input wrong password
/// The program is terminated
/// @note Total time taken to develop, write, test and debug this
/// solution: approximately 6 - 8hrs could not find my error, and re-did assigment about 3 times

import java.util.Scanner;

public class Project5_Week5 {

	// Using this to ask for other inputs from other Method statements
	public static final Scanner input = new Scanner(System.in); // Global Scanner

	public static void main(String[] args) {
		int choice; // Variable for Menu Option

		// For Method 1 (Body Fat)
		String gender;
		double BodyPercentage;

		// For Method 2 (Future Value)
		double FutureValue;
		double amountInvested;
		double yearlyRate;
		int numOfYears;

	do {
		menu(); // Call for the Menu Method
		System.out.print("Enter an option: ");
		choice = input.nextInt();
		System.out.print("\n");

		if (choice == 1) {
			System.out.print("Please enter the gender (male or female): ");
			gender = input.next();
			BodyPercentage = getBFT(gender);

			System.out.printf("Body Fat Percentage = %.2f" , BodyPercentage);
			System.out.print("\n");
			} // IF Choice

		else if (choice == 2) {
			System.out.print("Enter investment amount: ");
			amountInvested = input.nextDouble();
			System.out.print("Enter yearly rate: ");
			yearlyRate = input.nextDouble();
			System.out.print("Enter number of years to calculate the future value: ");
			numOfYears = input.nextInt();
			FutureValue = getFV(amountInvested, yearlyRate, numOfYears);

			System.out.printf("Future Value =  $%.2f", FutureValue);
			System.out.print("\n");
			} // Else IF

		else if (choice == 3) {
			System.out.println("Thank you. Goodbye!");
			System.out.print("\n");
			} // Else IF

		else {
			System.out.println("Invalid Choice");
			System.out.print("\n");
			} // Else

		} while (choice != 3); // Do While choice does not equal 3

	} // Main Method

public static void menu() {
	System.out.print("\n");
	System.out.println("1. Calculate Body Fat Percentage");
	System.out.println("2. Calculate Future value on Investments");
	System.out.println("3. End the program");
	} // Menu Method

public static double getBFT(String gender) {

	// Variables used for this Method
	double BodyPercentage = 0;
	double A1;
	double A2;
	double A3;
	double A4;
	double A5;
	double B;
	double bodyFat;
	double weightM;
	double wristM;
	double waistM;
	double hipM;
	double forearmM;

	if (gender.equalsIgnoreCase("female")) {
		System.out.print("Enter weight: ");
		weightM = input.nextDouble();
		System.out.print("Enter your waist measurement: ");
		waistM = input.nextDouble();
		System.out.print("Enter your wrist measurement: ");
		wristM = input.nextDouble();
		System.out.print("Enter your hip measurement: ");
		hipM = input.nextDouble();
		System.out.print("Enter your forearm measurement: ");
		forearmM = input.nextDouble();
		A1 = (weightM * .732) + 8.987;
		A2 = wristM / 3.14;
		A3 = waistM * .157;
		A4 = hipM * .249;
		A5 = forearmM * .434;
		B = A1 + A2 - A3 - A4 + A5;
		bodyFat = weightM - B;
		BodyPercentage = bodyFat * 100 / weightM;
		}

	else if (gender.equalsIgnoreCase("male")) {
		System.out.print("Enter weight: ");
		weightM = input.nextDouble();
		System.out.print("Enter your wrist measurement: ");
		waistM = input.nextDouble();
		A1 = (weightM * 1.082) + 94.42;
		A2 = waistM * 4.15;
		B = A1 - A2;
		bodyFat = weightM - B;
		BodyPercentage = bodyFat * 100 / weightM;
		}

	 else {
		BodyPercentage += -111;
	}

	return BodyPercentage;
	} // getBFT method

public static double getFV(double amountInvested, double yearlyRate, int numOfYears) {

	// Variables used for this Method
	double getFV;
	double monthlyRate;

	monthlyRate = (yearlyRate / 12) / 100.0;
	getFV = amountInvested * Math.pow((1 + monthlyRate), numOfYears * 12);

	return getFV;
	} // getFV Method

} // End Program
