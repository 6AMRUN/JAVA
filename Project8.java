/// @author 6AMRUN
/// @version The date: 3/22/2021
/// Finished Date: 3/26/2021
/// @brief Pool class used to store shape of pool, length, width, depth, area and volume.
/// solution: 5-6 hrs
public class Project8 {

	// Variable used in this Class
    private String shape;
    private double length;
    private double width;
    private double depth;
    private double area;
    private double volume;

    // A no-arg constructor that sets length, width, depth, area, volumne field to 0
    // Set string to ""
    Project8() {
		shape = "";
        length = 0;
        width = 0;
        depth = 0;
        area = 0;
        volume = 0;
    } // End of Constructor

    // Constructor
    // Accepts argument to assign to as shape, length, width, and depth
    // Parameter 1: newShape - String
    // Parameter 2: newLenght - double
    // Parameter 3: newWidth - double
    // Parameter 4: newDepth - double
    Project8(String newShape, double newLength, double newWidth, double newDepth) {
        shape = newShape;
        length = newLength;
        width = newWidth;
        depth = newDepth;
        setArea();
        setVolume();
        display();
    } // End of Constructor with int

	// Void Method
	// Set the shape
	// Parameter 1: newShape - String
	// Returns: Nothing
    public void setShape(String newShape) {
		shape = newShape;
    } // End of setShape Method

	// Void Method
	// Set the length
	// Parameter 1: newLength - double
	// Returns: Nothing
    public void setLength(double newLength) {
		length = newLength;
    } // End of setLength Method

	// Void Method
	// Set the width
	// Parameter 1: newWidth - double
	// Returns: Nothing
    public void setWidth(double newWidth) {
		width = newWidth;
    } // End of setWidth Method

	// Void Method
	// Set the depth
	// Parameter 1: newDepth - double
	// Returns: Nothing
    public void setDepth(double newDepth) {
		depth = newDepth;
    } // End of setDepth Method

	// void Method
	// calculate area
	// No Parameter
	// Returns: Nothing
    public void setArea() {
        area = length * width;
    } // End of setArea Method

	// void Method
	// calculate area
	// No Parameter
	// Returns: Nothing
    public void setVolume() {
        volume = length * width * depth;
    } // End of setVolume Method

    // Srting Method
	// No Parameter
	// Returns: shape
    public String getShape() {
        return shape;
    } // End of getShape Method

    // double Method
	// No Parameter
	// Returns: length
    public double getLength() {
        return length;
    } // End of getLength Method

    // double Method
	// No Parameter
	// Returns: width
    public double getWidth() {
        return width;
    } // End of getWidth Method

    // double Method
	// No Parameter
	// Returns: depth
    public double getDepth() {
        return depth;
    } // End of getWidth Method

    // double Method
	// No Parameter
	// Returns: area
    public double getArea() {
        return area;
    } // End of getArea Method

    // double Method
	// No Parameter
	// Returns: volume
    public double getVolume() {
        return volume;
    } // End of getVolume Method


	// void Method
	// Print out all the variables
	// No Parameter
	// Returns: Nothing
    public void display(){
		System.out.print("\n");
		System.out.println("The shape of the pool is: " + shape);
		System.out.println("The length of the pool is: " + length + " feet.");
		System.out.println("The width of the pool is: " + width + " feet.");
		System.out.println("The depth of the pool is: " + depth + " feet.");
	}

	// String Method
	// display the values of an object
	// No Parameter
	// Returns: The values of the objects area and volume
    public String toString() {
    	return "The area of the pool is: " + area + " square feet." +
    		   "\nThe volume of the pool is: " + volume + " cubic feet.\n";
	}

} // Class