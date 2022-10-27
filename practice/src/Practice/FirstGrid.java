package Practice;

import java.util.Scanner;

public class FirstGrid {//첫번째 격자판
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S1 = scan.nextLine();
		String S2 = scan.nextLine();
		
		//logic
		
		String[] arr1 = S1.split("");
		String[] arr2 = S2.split("");
		
		String result = "Yes";
		
		if(arr1[0].equals(".") && arr1[1].equals("#") && arr2[0].equals("#") && arr2[1].equals(".")){
			result = "No";
		} else if(arr1[0].equals("#") && arr1[1].equals(".") && arr2[0].equals(".") && arr2[1].equals("#")) {
			result = "No";
		}
		
		System.out.println(result);
	
		
		
		
		
		
		
		
	}//main 

}
