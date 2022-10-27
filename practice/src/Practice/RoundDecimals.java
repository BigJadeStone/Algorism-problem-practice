package Practice;

import java.util.Scanner;

public class RoundDecimals {//반올림 소수
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double X = scan.nextDouble();
		
		double round = Math.round(X);
		System.out.println((int)round);
		
		
		
		
	}//main

}//class
