package ie.atu.sw;

import java.util.Scanner;

public class NumberSeriesSum {
	
	//INSTANCE VARIABLES
	private Scanner scanner;
	private int min_number;
	private int max_number;
	int sum = 0;

	//CONSTRUCTOR
	public NumberSeriesSum() {
		
		scanner = new Scanner(System.in);
		
	}
	
	public int minInput() {
		
		System.out.println("Enter the MIN number in the series sum>");
		return scanner.nextInt();
	}
	
	public int maxInput() {
		
		System.out.println("Enter the MAX number in the series sum>");
		return scanner.nextInt();
	}
	
	public void start() {
		System.out.println("--------------------------------");
		System.out.println("-- Sum of a Series of Numbers --");
		System.out.println("--------------------------------");
		
		min_number = minInput(); //Initialise min_number
		max_number = maxInput(); //Initialise max_number
		
		for (int i = min_number; i <= max_number; i++) {
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
}
