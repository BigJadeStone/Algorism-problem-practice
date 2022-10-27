package Practice;

import java.util.Scanner;

public class DistinctStrings {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String str = scan.nextLine();
		if(str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {
			System.out.println(6);
		}else if (str.charAt(0) == str.charAt(2) && str.charAt(0) == str.charAt(1) && str.charAt(2) == str.charAt(1)) {
			System.out.println(1);
		}else if (str.charAt(0) == str.charAt(1) ||str.charAt(2) == str.charAt(1) || str.charAt(0) == str.charAt(2)) {
			System.out.println(3);
		}
		
		
		
		
		
		
		
		
		
	}

}
