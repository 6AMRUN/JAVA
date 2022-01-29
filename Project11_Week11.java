/// @author 6AMRUN
/// @version The date: 4/19/2021
/// Finished Date: 4/22/2021
/// @brief Input a file, if it doesn't exist terminate program, else create a new file and write into
/// @note Total time taken to develop, write, test and debug this
/// solution: 5-10 hrs

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Project11_Week11 {
	public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

    String inputFile;
    String outputFile;

    ArrayList<String> Employee = new ArrayList<>();
	ArrayList<Double> Payrate = new ArrayList<>();
	ArrayList<Double> Hourly = new ArrayList<>();
    ArrayList<Double> Salary = new ArrayList<>();

    System.out.println("Enter a File Name to read data from: ");
    inputFile = input.nextLine();

    try {
		// prepare the input file
    	Scanner inputFromFile = new Scanner (new File (inputFile));
    	System.out.println("File " + inputFile + " exists");

    	createArray(inputFromFile,Employee,Payrate,Hourly); // Method A

    	getSalary(Payrate, Hourly, Salary); // Method B

    	System.out.println("Enter the file name you wish to write to: ");
    	outputFile = input.nextLine();

    	writeData(outputFile, Employee, Payrate, Hourly, Salary); // Method C */

    	indexNumber(Employee,Payrate,Hourly,Salary); //Method D
    	}

    catch (FileNotFoundException ex) {
		System.out.print("\n");
		System.out.println("Cannot find your input file " + inputFile);
		System.out.println("Terminating the program");
		System.out.print("\n");
		}

    }// Main Method

	// Void Method
	// Create Array from file used
	// Parameter 1: inputFromFile - Scanner
	// Parameter 2: Employee - ArrayList<Double>
	// Parameter 3: Payrate - ArrayList<Double>
	// Parameter 4: Hourly - ArrayList<Double>
	// Returns: Nothing
    public static void createArray (Scanner inputFromFile, ArrayList<String> Employee, ArrayList<Double> Payrate, ArrayList<Double> Hourly) {
		while (inputFromFile.hasNext()) {
			Employee.add(inputFromFile.next());
			Payrate.add(Double.parseDouble(inputFromFile.next()));
			Hourly.add(Double.parseDouble(inputFromFile.next()));
		}
	}// End of Method A

    // ArrayList <Double> Method
	// Creates a new array for Salary
	// Parameter 1: Payrate - ArrayList<Double>
	// Parameter 2: Hourly - ArrayList<Double>
	// Parameter 3: Salary - ArrayList<Double>
	// Returns: Salary
    public static ArrayList<Double> getSalary (ArrayList<Double> Payrate, ArrayList<Double> Hourly, ArrayList<Double> Salary) {
		int x;
		int sz = Payrate.size();

		for (x = 0; x < sz; x++) {
			Salary.add(Payrate.get(x) * Hourly.get(x));
		}

		return Salary;
	}// End of Method B

	// Void Method
	// Write data into a new text file
	// Parameter 1: outputFile - String
	// Parameter 2: Employee - 	ArrayList<Double>
	// Parameter 3: Payrate	 - 	ArrayList<Double>
	// Parameter 4: Hourly	 - 	ArrayList<Double>
	// Parameter 5: Salary	 - 	ArrayList<Double>
	// Returns: Nothing
	public static void writeData (String outputFile, ArrayList<String> Employee, ArrayList<Double> Payrate, ArrayList<Double> Hourly, ArrayList<Double> Salary) {
		String name;
		File file = new File(outputFile);
		if (file.exists()){
			System.out.println("File already exists");
		}
		else {
			try {
				PrintWriter output = new PrintWriter(new PrintWriter(outputFile));
				System.out.println("Enter the name for the output file");
				name = input.nextLine();
				output.println(name);
				for (int x = 0; x < Employee.size(); x++) {
					output.println(Employee.get(x) + "\t" + Hourly.get(x) + "\t" + Payrate.get(x) + "\t" + Salary.get(x));
				}
				output.close();
				System.out.println("File created");
			}
			catch (FileNotFoundException ex) {
				System.out.println("Error: FileNotFoundException Occured");
			}
			catch (IndexOutOfBoundsException ex) {
				System.out.println("Error: IndexOutOfBoundsException Occured");
			}
		}
	}// End of Method C

	// Void Method
	// Index through ArrayList
	// Parameter 1: Employee - 	ArrayList<Double>
	// Parameter 2: Payrate	 - 	ArrayList<Double>
	// Parameter 3: Hourly	 - 	ArrayList<Double>
	// Parameter 4: Salary	 - 	ArrayList<Double>
	// Returns: Nothing
	public static void indexNumber (ArrayList<String> Employee, ArrayList<Double> Payrate, ArrayList<Double> Hourly, ArrayList<Double> Salary) throws Exception{
		int number;
		int size = Employee.size();
		boolean continueInput = true;
		do {
			try {
					System.out.print("Enter an index for the record to be located: ");
		        	number = input.nextInt();
		        	if (number <= Employee.size()){
								System.out.println("Employee Name: " + Employee.get(number) +
										     	   "\tHours Worked: " + Hourly.get(number) +
										  	       "\tPay Rate: " + Payrate.get(number) +
										     	   "\tFinal pay: " + Salary.get(number));
					}
					else {
					System.out.println("Requested Index is out of bounds");
					continueInput = false;
					}
					continueInput = false;
				}
			catch (IndexOutOfBoundsException ex) {
				System.out.println("Requested Index is out of bounds");
				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.print("\n");
		        System.out.println("Try again. (Incorrect input: an integer is required)");
		        input.nextLine();
		        }
		} while (continueInput);
	}// End of Method D

} // Class
