/// @author 6AMRUN
/// @version The date: 4/5/2021
/// Finished Date: 4/9/2021
/// @brief StudentScore inherited from ExamScore, This stores the ID number for the student
/// solution: 5-8 hrs

public class StudentScore extends ExamScore {
	private int studentID;

	// A no-arg constructor
	StudentScore() {
		studentID = 0;
	}

	// Constructor with single parameter
	// Accepts argument to assign to as studentID
	// Parameter 1: studentID - int
	StudentScore(int studentID) {
		this.studentID = studentID;
	}// End of constructor

	// Constructor with three parameter
	// Accepts argument to assign to as exam name, score, and studentID
	// uses ExamScore.java to get the ExamScore and ExamName
	// Parameter 1: newName - String
	// Parameter 2: newScore - double
	// Parameter 3: studentID - int
	StudentScore(String newName, double newScore, int studentID) {
		this.studentID = studentID;
		setName(newName);
		setScore(newScore);
	}// End of constructor

	// void Method
	// Set id for studentID
	// no parameter
	// Returns: Nothing
	public void setID () {
		this.studentID = studentID;
	}// End of setID method

	// double Method
	// get id for studentID
	// no parameter
	// Returns: studentID
	public double getID() {
		return studentID;
	}// End of getID method

	// String Method
	// No Parameter
	// Returns: Exam Name, Exam Score and StudentID
	public String toString() {
		return "Exam Name: " + getName() + " Score: " + getScore() + " Identification Number: " + studentID;
	}// End of toString() Method

} // End of StudentScore