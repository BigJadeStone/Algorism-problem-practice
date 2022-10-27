package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test11 {//숫자 기계
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] arr = input.split(" ");
		//System.out.println(Arrays.toString(arr));
		
		int[] intArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		//System.out.println(Arrays.toString(intArr));
		
		int index = 0;
		int count = 1;
		while(count <= 3) {
			index = intArr[index];
						
			
			count ++;
		}
		
		System.out.println(index);
		
	}//main

}
