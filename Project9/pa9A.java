/// @author 6AMRUN
/// @version The date: 4/5/2021
/// Finished Date: 4/9/2021
/// @brief This is the main program, it test each of the methods and constructors
/// solution: 5-8 hrs

import java.util.Scanner;

public class pa9A {
    public static final Scanner input = new Scanner(System.in); // Global Scanner

    public static void main(String[] args) {
		// Variables used for the main program
		String arrayName = "FINAL EXAM";
		String name = " ";
		double score = 0;
		int numberID = 0;
		double randoScore;
		int randoID;
		int x;

		// Creating intial values
		ExamScore example1 = new ExamScore("Exam 1", 100);
		System.out.println(example1.toString());
		StudentScore example2 = new StudentScore("Exam 1", 100, 1000);
		System.out.println(example2.toString());

		// Input for Exam Score Class
		System.out.println("Enter the name of an exam and the corresponding score ");
		name = input.nextLine();
		score = input.nextDouble();
		System.out.println("Updated information for the exam");
		ExamScore exam = new ExamScore(name, score);
		System.out.println(exam.toString());

		// Input for Student Score Class
		System.out.println("Enter the identification number for the student ");
		numberID = input.nextInt();
		System.out.println("Enter the name of the exam and the corresponding score for: " + numberID);
		input.nextLine();
		name = input.nextLine();
		score = input.nextDouble();
		StudentScore student = new StudentScore(name, score, numberID);
		System.out.println(student.toString());

		System.out.println("The array data");

		// Create an array based on initial value
		StudentScore[] studentArray = new StudentScore[5];

		for (x = 0; x < studentArray.length; x++) {
			// Generate a random number for score and ID
			randoScore = 1 + (double)(Math.random() * 100);
			randoID = 100 + (int)(Math.random() * 1000);
			studentArray[x] = new StudentScore(arrayName, randoScore, randoID);
			System.out.println(studentArray[x]);
		} // End of FOR Loop

	} // Main Method

} // Class
