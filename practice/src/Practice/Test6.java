package Practice;

import java.util.Scanner;

public class Test6 {//t-shirt
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		double A = Integer.parseInt(input.split(" ")[0]);
		double B = Integer.parseInt(input.split(" ")[1]);
		double C = Integer.parseInt(input.split(" ")[2]);
		double X = Integer.parseInt(input.split(" ")[3]);
		
		//logic
		
		double percent = 0;
		
		if(X<=A) {
			percent = 1;
		} else if (B<X) {
			percent = 0;
		} else {
			percent = C/(B-A);
		}
		System.out.println(percent);
		
		scan.close();
		
		
		
		
	}//main

}
