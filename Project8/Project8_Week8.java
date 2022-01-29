/// @author 6AMRUN
/// @version The date: 3/22/2021
/// Finished Date: 3/26/2021
/// @brief Main method that uses the operations in the Pool Class
/// solution: 5-6 hrs

import java.util.Scanner;

public class Project8_Week8 {
    public static final Scanner input = new Scanner(System.in); // Global Scanner

    public static void main(String[] args) {
		String newShape = "";
		double newLength;
		double newWidth;
		double newDepth;
		int number = 0;
		int x;

		while (!newShape.equalsIgnoreCase("DONE")) {
				System.out.print("Enter the shape of a pool: ");
				newShape = input.nextLine();

			if (newShape.equalsIgnoreCase("DONE")){
				System.out.print("\n");
				System.out.print("How many pools to process in the array? " );
				number = input.nextInt();
				}

			else {
				// Ask for input variable
				System.out.print("Enter the length: ");
				newLength = input.nextDouble();

				System.out.print("Enter the width: ");
				newWidth = input.nextDouble();

				System.out.print("Enter the depth: ");
				newDepth = input.nextDouble();

				Project8 pool = new Project8(newShape, newLength, newWidth, newDepth);
				System.out.println(pool);

				System.out.println("Enter DONE to exit");
				input.nextLine();
				}

			} // End of WHILE Loop

		// Create an array based on number input
		AlexiesFarinasPool[] poolArray = new AlexiesFarinasPool[number];

		for (x = 0; x < poolArray.length; x++) {
			System.out.print("Enter the shape of a pool: ");
			newShape = input.next();

			System.out.print("Enter the length: ");
			newLength = input.nextDouble();

			System.out.print("Enter the width: ");
			newWidth = input.nextDouble();

			System.out.print("Enter the depth: ");
			newDepth = input.nextDouble();

			poolArray[x] = new AlexiesFarinasPool(newShape, newLength, newWidth, newDepth);
			System.out.println(poolArray[x]);
		} // End of FOR Loop

	} // Main Method

} // Class
