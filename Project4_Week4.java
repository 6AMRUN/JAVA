/// @author 6AMRUN
/// @version The date: 2021-2-15
/// @brief Java program that displays a business card, if input wrong password
/// The program is terminated
/// @note Total time taken to develop, write, test and debug this
/// solution: 6-8hrs in total

 import java.util.Scanner;

 public class Project4_Week4
 {
 	  public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in); // Variable Scanner

	 // Menu Option
     int choice;

     // Counters
     int count = 0;
     int c = 0;
     int priceCount = 0;

     // For Choice 1
     int score = 0;
     int examScore = 0;
     double finalScore = 0;
     int assignments;
     int grade;
     int exam;
     double exams;
     double avgAssignment;
     double finalExam;
     double finalExamScore;
     double overallGrade;

     // For Choice 2
     double price;
     double sum = 0;
     double tax = 8;
     double totalTax;
     double avg;
     double avgTax;
     double avgTotal;
     double plusTax;

     System.out.println("Enter 1 to calculate grade");
     System.out.println("enter 2 to calculate purchases");
     System.out.println("enter 3 to exit the program");

     // Option Input
     System.out.print("Enter an option: ");
     choice = input.nextInt();
     System.out.print("\n");

     while (choice != 0) {

		 if (choice == 1) {

			 do {
				 System.out.print("Enter the number of assignments: ");
				 assignments = input.nextInt();

				 while (assignments <= 0) {
					 System.out.println("The number you entered is incorrect.");
					 System.out.print("Enter the number of assignments (1 or more): ");
					 assignments = input.nextInt();
				 } // while assignments is Less than or equal to 0

			if (assignments > 0){

				do {
					System.out.print("Enter the score for assignment " + (count +  1) + ": ");
					grade = input.nextInt();

					while (grade <= 0 || grade >= 100) {
						System.out.println("The score you entered is incorrect");
						System.out.print("Enter the score for assignment " + (count +  1) + " (0-100): ");
						grade = input.nextInt();
					} // While grade is Less than or equal to 0

					 if (grade >= 0 && grade <=100 ){
						 score += grade;
						 count ++;
					 } // IF Grade

				 }  while (assignments > count); // Do while Assignmets is greater than count

			while (c < 2) {
				System.out.print("Enter the score for exam " + (c + 1) + ": ");
				exam = input.nextInt();

				do {

					while (exam <= 0) {
						System.out.println("The score you entered is incorrect");
						System.out.print("Enter the score for exam " + (c + 1) + " (0-100): ");
						exam = input.nextInt();
						} // While Exam  is Less than or equal to 0

					 	if (exam >= 0 && exam <= 100){
					 		examScore += exam;
					 		c++;
					 	} // IF Exam

				} while (c > 2); // Do while c is greater than or equal to

				if (c > 1){
					System.out.print("Enter the score for the final exam: ");
					finalExam = input.nextInt();
					finalScore += finalExam;
				}

				}// While C

				 	// Calculate for overall grade
					avgAssignment = score/assignments;
					exams = examScore * .10;
					finalExamScore = finalScore * .15;
					overallGrade = (avgAssignment * .65) + exams + finalExamScore;

					// Output for Student Report
					System.out.print("\n");
					System.out.print("*** Student Report *** \n");
					System.out.print("Number of assignments: " + count);
					System.out.printf("\nAssignment Average: %4.2f" , avgAssignment);
					System.out.print("\nOverall Grade: " + overallGrade + "\n");
					System.out.print("\n");

					 if(overallGrade >= 94 && overallGrade <= 100 ) {
						 System.out.print("Letter Grade: A");
					 }
					 else if(overallGrade >= 90 && overallGrade < 94) {
						System.out.print("Letter Grade: A-");
					 }
					 else if(overallGrade >= 87 && overallGrade < 90) {
						System.out.print("Letter Grade: B+");
					 }
					 else if(overallGrade >= 84 && overallGrade < 87) {
						System.out.print("Letter Grade: B");
					 }
					 else if(overallGrade >= 80 && overallGrade < 84) {
						 System.out.print("Letter Grade: B-");
					 }
					 else if(overallGrade >= 77 && overallGrade < 80) {
						 System.out.print("Letter Grade: C+");
					 }
					 else if(overallGrade >= 70 && overallGrade < 77) {
						 System.out.print("Letter Grade: C");
					 }
					 else if(overallGrade >= 60 && overallGrade < 70) {
						System.out.print("Letter Grade: D");
					 }
					 else {
						 System.out.print("Letter Grade: F");
						 }

					System.out.print("\n");

			} // IF Assignments

			} while (assignments <= 0);


		} // IF Choice

         else if (choice == 2) {

			 System.out.print("Enter the price of an item (enter -1 to stop): $ ");
			 price = input.nextInt();

			 while (price != -1) {
				 sum += price;
				 priceCount ++;

				 System.out.print("Enter the price of an item (enter -1 to stop): $ ");
				 price = input.nextInt();

			 } //While

			 // Calculate for total & tax
			 totalTax = sum * (tax / 100);
			 plusTax = totalTax + sum;

			 // Calculate for average & tax
			 avg = sum/priceCount;
			 avgTax = avg * (tax /100);
			 avgTotal = avg + avgTax;

			 System.out.print("\n");
			 System.out.print("*** Sales Report *** ");
			 System.out.printf("\nTotal price of purchases: $%4.2f" , sum);
			 System.out.println("\nNumber of items purchased: " + priceCount);
			 System.out.printf("Total price plus tax of %.0f%% : $%4.2f" , tax , plusTax);
			 System.out.printf("\nAverage Price: $%4.2f" , avgTotal);
			 System.out.print("\n");

         } // Else IF

         else if (choice == 3) {
			 System.out.println("Thanks for using my program.");
			 System.exit(0);
		 }

         else {
            System.out.println("The option you entered is incorrect.");
         } // Else

         //present the menu again to the user
         System.out.print("\n");
		 System.out.println("Enter 1 to calculate grade");
		 System.out.println("Enter 2 to calculate purchases");
		 System.out.println("Enter 3 to exit the program");


		 // Option Input
		 System.out.print("Enter an option: ");
         choice = input.nextInt();
         System.out.print("\n");

      } // While Choice != 3

	  input.close();

      } // Main

} // End Program