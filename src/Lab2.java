import java.util.Scanner;



public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double length = 0;
		double width = 0;
		double area = 0;
		double perimeter = 0;
		double height = 0;
		double volume = 0;
		
		
		
		int iContinue = 0;
		
		do {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.print("Enter Length: ");
		length = scan.nextDouble();
		System.out.print("Enter Width: ");
		width = scan.nextDouble();
		System.out.print("Enter Height: ");
		height = scan.nextDouble();
		
		perimeter = calculatePerimeter(length, width);
		
		area = calculateArea(length, width);
		
		volume = calculateVolume(length, width, height);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);
		
		System.out.println();
		
		do {
		System.out.println("Do you want to continue?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		iContinue = scan.nextInt();
		
		if (iContinue != 1 && iContinue != 2) {
			System.out.println("Please enter 1 or 2");
			}
		}  while (iContinue != 1 && iContinue != 2);
		
		
		} while (iContinue != 2);
		
		System.out.println("Thank you for using the Grand Circus' Room Detail Generator!");
		System.out.println("Have a nice day!");
		
		
		
		scan.close();
	}
	
	public static double calculatePerimeter(double length, double width) {
		double result =0;
		
		result = (length * 2) + (width * 2);
		
		return result;
	}
	
	public static double calculateArea(double length, double width) {
		double result =0;
		
		result = length * width;
		
		return result;
	}

	public static double calculateVolume(double length, double width, double height) {
		double result = 0;
		result = length * width * height;
		return result;
	}
}
