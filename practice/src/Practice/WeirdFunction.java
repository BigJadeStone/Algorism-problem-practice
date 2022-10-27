package Practice;

import java.util.Scanner;

public class WeirdFunction {//이상한 함수
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int t = Integer.parseInt(input);
		
		//logic
		//f(f(f(t)+t)+f(f(t)))
		int result = f(f(f(t)+t)+f(f(t)));
		System.out.println(result);
		
		
		
	}//main
	
	public static int f(int x) {
		return x*x+2*x+3;
	}

}
