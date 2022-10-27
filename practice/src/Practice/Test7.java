package Practice;

import java.util.Scanner;

public class Test7 { //horizon
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double H = Integer.parseInt(input);
		
		//logic
		double mid = H*(12800000+H);
		double result = Math.sqrt(mid);
		
		
		//output
		System.out.println(result);
		
		
		
		
	}

}
