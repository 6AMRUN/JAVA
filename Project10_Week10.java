/// @author 6AMRUN
/// @version The date: 4/12/2021
/// Finished Date: 4/14/2021
/// @brief Program to create Employee names, hours, payrate and salary
/// Display the data in a tabular format
/// @note Total time taken to develop, write, test and debug this
/// solution: 5-6 hrs

import java.util.ArrayList;
import java.util.Scanner;

public class Project10_Week10 {
    public static final Scanner input = new Scanner(System.in); // Global Scanner

    public static void main(String[] args) {
		String name = " ";
		String searchName = " ";
		int x;
		int pay;
		int index;
		int numHours;

		ArrayList<String> Employee = new ArrayList<>();
        ArrayList<Integer> Payrate = new ArrayList<>();
        ArrayList<Integer> Hourly = new ArrayList<>();
		ArrayList<Integer> Salary = new ArrayList<>();

        while (!name.equalsIgnoreCase("DONE")) {
            System.out.println("Enter the name of an employee. - enter done to exit");
            name = input.next();

            if (!name.equalsIgnoreCase("DONE")) {
				Employee.add(name); // Add name into Employee Array
				System.out.println("Enter the number of hours work for the employee.");
				numHours = input.nextInt();
				Hourly.add(numHours); // Add numHours into Hourly Array

				System.out.println("Enter the pay rate for the employee.");
				pay = input.nextInt();
				Payrate.add(pay); // Add pay into Payrate Array
			}

			else {

				getSalary(Payrate, Hourly, Salary);

				displaylength(Employee, Payrate, Hourly, Salary);

				do {
					System.out.print("\n");
					System.out.println("Enter a name you wish to search for, type done to exit.");
					searchName = input.next();
					index = getData(searchName, Employee);

					if (!searchName.equalsIgnoreCase("DONE")) {
						if (index != -1) {
							for (x = index; x <= index; x++){
								System.out.print("\n");
								System.out.println(Employee.get(x) + " FOUND");
								System.out.println("Employee Name: " + Employee.get(x));
								System.out.println("Employee Hours: " + Hourly.get(x));
								System.out.println("Employee Pay Rate: " + Payrate.get(x));
								System.out.println("Employee Salary: " + Salary.get(x));
							} // End of for loop
						}
						else {
							System.out.println(searchName + " NOT FOUND");
							}
						}
					} while (!searchName.equalsIgnoreCase("DONE")); // Do While

					addMore (Employee, Payrate, Hourly, Salary);
					display (Employee, Payrate, Hourly, Salary);

			} // End of else loop

    	} // End of while loop

    }// Main Method

    // ArrayList <Integer> Method
	// Creates a new array for Salary
	// Parameter 1: Payrate - ArrayList<Integer>
	// Parameter 2: Salary - ArrayList<Integer>
	// Returns: Salary
    public static ArrayList<Integer> getSalary (ArrayList<Integer> Payrate, ArrayList<Integer> Hourly, ArrayList<Integer> Salary) {
			int x;

			for (x = 0; x < Hourly.size(); x++) {
				Salary.add(Payrate.get(x) * Hourly.get(x));
				}
			return Salary;
	}// End of getSalary Method

	// Void Method
	// Display Length of the Array Lists
	// Parameter 1: Employee - ArrayList<String>
	// Parameter 2: Payrate - ArrayList<Integer>
	// Parameter 3: Hourly - ArrayList<Integer>
	// Parameter 4: Salary - ArrayList<Integer>
	// Returns: Nothing
    public static void displaylength (ArrayList<String> Employee, ArrayList<Integer> Payrate, ArrayList<Integer> Hourly, ArrayList<Integer> Salary) {
		System.out.print("\n");
		System.out.println("Size of Employee Names List: " + Employee.size());
		System.out.println("Size of Employee Hours List: " + Hourly.size());
		System.out.println("Size of Employee Pay Rates List: " + Payrate.size());
		System.out.println("Size of Employee Salary List: " + Salary.size());
	} // End of displaylength Method

	// Int Method
	// getData to search for name
	// Parameter 1: searchName - String
	// Parameter 2: Employee - ArrayList<String>
	// Returns: The index of searchName, if not existent, it returns -1
	public static int getData(String searchName, ArrayList<String> Employee) {
		if (Employee.contains(searchName)){
			return Employee.indexOf(searchName);
		}
		else {
			return -1;
		}
	} // End of getData Method

	// Void Method
	// Add More to the Array Lists
	// Parameter 1: Employee - ArrayList<String>
	// Parameter 2: Payrate - ArrayList<Integer>
	// Parameter 3: Hourly - ArrayList<Integer>
	// Parameter 4: Salary - ArrayList<Integer>
	// Returns: Nothing
	public static void addMore (ArrayList<String> Employee, ArrayList<Integer> Payrate, ArrayList<Integer> Hourly, ArrayList<Integer> Salary) {
		String addName = " ";
		int addHourly;
		int addPay;

		System.out.print("\n");
		while (!addName.equalsIgnoreCase("DONE")) {
			System.out.println("Enter a name to add and its corresponding information. - Enter done to exit");
			addName = input.next();

			if (!addName.equalsIgnoreCase("DONE")) {
				Employee.add(addName); // Add name into Employee Array
				System.out.println("Enter the corresponding number of hours.");
				addHourly = input.nextInt();
				Hourly.add(addHourly); // Add numHours into Hourly Array

				System.out.println("Enter the corresponding pay rate.");
				addPay = input.nextInt();
				Payrate.add(addPay); // Add pay into Payrate Array
				}
			else {
				getSalary(Payrate, Hourly, Salary);
			}
		}
	} // End of addMore Method

	// Void Method
	// Display the output in a Tabular Format
	// Parameter 1: Employee - ArrayList<String>
	// Parameter 2: Payrate - ArrayList<Integer>
	// Parameter 3: Hourly - ArrayList<Integer>
	// Parameter 4: Salary - ArrayList<Integer>
	// Returns: Nothing
	public static void display (ArrayList<String> Employee, ArrayList<Integer> Payrate, ArrayList<Integer> Hourly, ArrayList<Integer> Salary) {
		// Variable also used as a index/counter in FOR loop
		int x;

		// Print Name, Hours, Pay Rate, Salary
		System.out.print("\n");
		System.out.println("Name: "
							+ " Hours: \t"
							+ " Pay Rate: \t"
							+ " Salary: ");

		// FOR Loop
		// Print out array for Employee, Pay Rate, Hourly, Salary
    	for(x = 0; x < Employee.size(); x++) {
			System.out.print(Employee.get(x));
			System.out.print("\t " + Payrate.get(x));
			System.out.print("\t " + Hourly.get(x));
			System.out.print("\t " + Salary.get(x));
        	System.out.print("\n");
    	} // End of FOR Loop

	} // End of display Method

} // Class
