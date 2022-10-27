package Practice;

import java.util.Scanner;

public class Test12 {//완벽한 문자열
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		//알파벳 문자는 26개
		
		char[] cS = S.toCharArray(); //3개 조건을 확인해야함.
		
		int upCount = 0;
		int downCount = 0;
		int overload = 0;
		
		//대문자 검사.
		for(int i=0; i<cS.length; i++) {
			if( cS[i] > 64 && cS[i] <91 ) {
				upCount++;
			}
		}
		
		//소문자 검사.
		for(int i=0; i<cS.length; i++) {
			if( cS[i] > 96 && cS[i] <123 ) {
				downCount++;
			}
		}
		
		
		//중복 검사.
		for(int i=0; i<cS.length-1; i++) {
			for(int j=i+1; j<cS.length; j++) {
				if( cS[i] == cS[j] ) {
					overload ++;
				}
			}
		}
		
		if(upCount == 1 && downCount == 1 && overload ==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
		
	}//main

}
