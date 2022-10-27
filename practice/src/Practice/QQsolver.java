package Practice;

import java.util.Scanner;

public class QQsolver { //QQ 해결사 문제.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine(); //S = axb . a와b는 정수. x는 "x"
		
		//logic 문자열 "axb" 에서 a * b 의 값을 구하라.
		int answer = 0;
		
		char[] split = S.toCharArray();
		answer = (split[0]-48)*(split[2]-48);
		
		//출력
		System.out.println(answer);
		
		
		
		
		
		
		
		
	}//main

}
