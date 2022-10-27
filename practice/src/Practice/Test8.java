package Practice;

import java.util.Scanner;

public class Test8 { // don't overflow
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		long N = Long.parseLong(input);
		
		long plus = (long)Math.pow(2, 31);
		long minus = (long)Math.pow(-2, 31);
		
		System.out.println(plus);
		System.out.println(minus);
		
		if(N<plus-1 && N>minus) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
	}

}
