package perimeterArea;

import java.util.Scanner;

public class perimeterArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter values of length and width of the classroom.

		System.out.println("Enter length");// user input the length of a room
		double length = scan.nextDouble();

		System.out.println("Enter Width");// user input the width of a room

		double width = scan.nextDouble();

		System.out.println("Enter Height");
		double height = scan.nextDouble();

		double area = length * width; // Area of the rectangle
		System.out.println("Area" + ":");
		System.out.println(area);
		System.out.println("Perimeter" + ":");
		double perimeter = (length * width) * 2;// perimeter of the rectangle
		System.out.println(perimeter);

		double volume = length * width * height; // Find the volume
		System.out.println("volume" + " :");
		System.out.println(volume);
		System.out.println("Continue" + "?" + " y/n"); // Does user want to continue yes or no?
		String n = "no";
		String y = "yes";
		String userInput;
		String userContinue = "y";
		userInput = scan.nextLine();
		userInput = userContinue;
		// first part runs, wanted to try a loop for the next section.

		// having trouble doing do and while loop
		do {

			System.out.println("Enter length");// user input the length of a room
			length = scan.nextDouble();

			System.out.println("Enter Width");// user input the width of a room

			width = scan.nextDouble();

			System.out.println("Enter Height");
			height = scan.nextDouble();

			area = length * width; // Area of the rectangle
			System.out.println("Area" + ":");
			System.out.println(area);
			System.out.println("Perimeter" + ":");
			perimeter = (length * width) * 2;// perimeter of the rectangle
			System.out.println(perimeter);

			volume = length * width * height; // Find the volume
			System.out.println("volume" + " :");
			System.out.println(volume);
			System.out.println("Continue" + "?" + " y/n"); // Does user want to continue yes or no?
			n = "no";
			y = "yes";
			userInput = scan.nextLine();
			userContinue = "y";
		}

		while (userContinue.equals("y"));
		{
		}
	}

}
