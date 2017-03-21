package assignment2;

public class PerimeterAndAreaOfRectangle {

	public static void main(String args[]){
		
		System.out.println("Perimeter and area of a rectangle");
		//Declare variables 
		double width = 4.25;
		double length = 8.5;
		
		//Calculate perimeter and area
		double perimeter = 2 * width + 2 * length;
		double area = width * length;
		//Create and Print out the results
		String message = "Width: " + width + "\n" 
				+ "Length: " + length + "\n" 
				+ "Perimeter: " + perimeter + "\n" 
				+ "Area: " + area;
		System.out.println(message);
	}
}
