package Practice;

import java.util.Scanner;

public class AtCoderQuiz3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int N = Integer.parseInt(input);
		
		//logic
		String result = "AGC";
		
		int agc =000; 
		if(N>=42) {
			agc = agc + N + 1;
		} else {
			agc = agc + N;
		}
		
		if(agc<10) {
			result += "00"+agc;
		} else if(agc>=10 && agc<100) {
			result += "0"+agc;
		} else {
			result += agc;
		}
		
		System.out.println(result);
		
		
	}//main

}
