package ie.atu.sw;

//import java.util.Scanner;

public class NumberSeriesSum {
	
	//INSTANCE VARIABLES
	//private Scanner scanner;
	private int min_number = 20; //minInput();
	private int max_number = 60;//maxInput();
	int sum = 0;

	//CONSTRUCTOR
	public NumberSeriesSum() {
		
		//scanner = new Scanner(System.in);
		
		start();
		
	}
	/*
	public int minInput() {
		
		System.out.println("Enter the MIN number in the series sum>");
		String min_input = scanner.next();
		int min = (int)Double.parseDouble(min_input);
		
		return min;
	}
	
	public int maxInput() {
		
		System.out.println("Enter the MAX number in the series sum>");
		String max_input = scanner.next();
		int max = (int)Double.parseDouble(max_input);
		
		return max;
	}
	*/
	public void start() {
		System.out.println("--------------------------------");
		System.out.println("-- Sum of a Series of Numbers --");
		System.out.println("--------------------------------");
		
		//minInput();
		//maxInput();
		
		for (int i = min_number; i <= max_number; i++) {
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
}
