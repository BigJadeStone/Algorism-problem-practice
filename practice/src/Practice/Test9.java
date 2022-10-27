package Practice;

import java.util.Scanner;

public class Test9 {//츄코다이
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String input = scan.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		
		char[] arr = S.toCharArray();
		char temp = ' ';
		temp = arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = temp;
		String result = String.valueOf(arr);
		
		System.out.println(result);
		
		
		
		
	}

}
