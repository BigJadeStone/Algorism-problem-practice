package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {//순환
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//int xyz = Integer.parseInt(input);
		
		String[] abc = input.split("");
		//System.out.println(Arrays.toString(abc));
		//{a,b,c}
		String a = abc[0] + abc[1] + abc[2];
		String b = abc[1] + abc[2] + abc[0];
		String c = abc[2] + abc[0] + abc[1];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = Integer.parseInt(c);
		
		int result = x+y+z;
		
		System.out.println(result);
		
	}

}
