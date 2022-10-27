package Practice;

import java.util.Scanner;

public class WaterPressure {//수압
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int D = Integer.parseInt(input);
		
		//logic
		double result = 0;
		result = (double)D/100;
		
		System.out.println(result);
		
		
		
		
		
	}//main

}
