package Practice;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("값을 입력하시오");
		String input = scan.nextLine();
		
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		int C = Integer.parseInt(input.split(" ")[2]);
		int D = Integer.parseInt(input.split(" ")[3]);
		
		//logic
		/*
		 * A 와 C는 시간이기 때문에 분으로 치환해준다. *60 해주기.
		 */
		String result = "";
		int takahashi = A*60+B;
		int aoki = C*60+D;
		if( takahashi < aoki ) {
			result = "takahashi"; 
		} else {
			result = "aoki";
		}
		
		//출력
		System.out.println(result);
		
		
		
	}//main

}
