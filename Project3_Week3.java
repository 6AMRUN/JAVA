/// @author 6AMRUN
/// @version The date: 2021-2-1
/// @brief Java program that displays a business card, if input wrong password
/// The program is terminated
/// @note Total time taken to develop, write, test and debug this
/// solution: 4-6hs in total

 import java.util.Scanner;

 public class Project3_Week3 {
 	  public static void main(String[] args) {
	   Scanner input = new Scanner(System.in); // Variable Scanner

	   // Declare variables
	   String passW; // Input password
	   String firstN; // Input First Name
	   String lastN; // Input Last Name
	   String title; // Input Title
	   String dept; // Input Department
	   String oPhone; // Input Office Phone
	   String mPhone; // Input Mobile Phone
	   String email; // Input Email
	   double rNum; // Random number generator from 10.1 to 100.1
	   double log; // Log 10 of random number
	   double power3; // For random number to the 3rd power
	   int location; // For email, detecting the @
	   char singleCh; // Variable for the Single Character

	   //User Inputs
	   System.out.print("Enter your password: ");
	   passW = input.nextLine();

	   if (passW.equals("java")){
		   System.out.println("Enter your first name: ");
		   firstN = input.nextLine();
		   System.out.println("Enter your last name: ");
		   lastN = input.nextLine();
		   System.out.println("Enter your title:");
		   title = input.nextLine();
		   System.out.println("Enter your department:");
		   dept = input.nextLine();
		   System.out.println("Enter your office phone number:");
		   oPhone = input.nextLine();
		   System.out.println("Enter your mobile phone number:");
		   mPhone = input.nextLine();
		   System.out.println("Enter your email: ");
		   email = input.nextLine();
		   location = email.indexOf("@");
		   // Inner IF Statement, detect when Email is entered with an "@"
		   if (location != -1){
		   		System.out.println("Enter your office mail code (one-character code): ");
		   	   	singleCh = input.nextLine().charAt(0);

		   	   // Generate a random number
		   	   rNum = 10.1 + (int)(Math.random() * 1000.1);
		   	   // Base Log10 for random number
		   	   log = Math.log10(rNum);

		   	   // Power of 3 for random number
		   	   power3 = Math.pow(rNum,3);

		   	   //Display the outputs
		   	   System.out.print("Here is your official business card: \n");
		   	   System.out.print("*------------------------------------------------------------------------------*\n");
		   	   System.out.print("| \n");
		   	   System.out.print("| " + firstN + " " + lastN + "\n");
		   	   System.out.print("| " + title + "\n");
		   	   System.out.print("| " + dept + "\n");
		   	   System.out.print("| Office Phone:" + oPhone + "\n");
		   	   System.out.print("| Mobile Phone:" + mPhone + "\n");
		   	   System.out.print("| " + email + "\n");
		   	   System.out.print("| Mail code: " + singleCh + "\n");
		   	   System.out.printf("| Your assigned random number: %.2f", rNum , "\n");
		   	   System.out.printf("\n| The log base 10 of your random number is: %.4f" , log , "\n");
		   	   System.out.printf("\n| The random number raised to the power of 3 is: %.4f", power3 ,"\n");
		   	   System.out.println("\n*------------------------------------------------------------------------------* \n");

			} // Closing Outer IF Statement

		   else{
		        System.out.println(email + " is invalid");
			} // Closing Inner IF Statement
		}

	   else{
	   		System.out.println("Error: Wrong Password");
		}

		input.close();

      } // Main

}// End Program