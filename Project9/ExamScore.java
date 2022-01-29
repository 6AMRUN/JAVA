/// @author 6AMRUN
/// @version The date: 4/5/2021
/// Finished Date: 4/9/2021
/// @brief Class ExamScore, displays the values for Exam Name and Exam Score
/// solution: 5-8 hrs

public class ExamScore {
	private String ExamName;
	private double ExamScore;

	// A no-arg constructor that sets examscore 0
    // Set string to ""
	ExamScore() {
		ExamName = " ";
		ExamScore = 0;
	} // End of Constructor

    // Accepts argument to assign to as exam name and score
    // Parameter 1: newName - String
    // Parameter 2: newScore - double
	ExamScore(String newName, double newScore){
		ExamName = newName;
		ExamScore = newScore;
	} //End of Constructor

	// void Method
	// Set name for exam
	// Parameter 1: newName - String
	// Returns: Nothing
    public void setName(String newName) {
		ExamName = newName;
    } // End of setName Method

	// void Method
	// Set score for exam
	// Parameter 1: newScore - double
	// Returns: Nothing
    public void setScore(double newScore) {
		ExamScore = newScore;
    } // End of setScore Method

    // Srting Method
	// No Parameter
	// Returns: ExamName
    public String getName() {
        return ExamName;
    } // End of getName Method

    // double Method
	// No Parameter
	// Returns: ExamScore
    public double getScore() {
        return ExamScore;
    } // End of getScore Method

	// String Method
	// No Parameter
	// Returns: Exam Name and Exam Score
	public String toString() {
		return "Exam Name: " + ExamName + " Score: " + ExamScore;
	}// End of toString() Method

} // End of ExamScore
