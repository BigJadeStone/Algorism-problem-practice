package Practice;

import java.util.Scanner;

public class Tires {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		
		String compare = S.charAt(S.length());
		boolean result = S.contains("ist");
		if(result){
			if((S.charAt(S.length()-3)).equals("i"))
			System.out.println("ist");
		} 	else {
			System.out.println("er");
		
		
		
		
		
		
	}//main

}
