package Practice;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		String input = scan.nextLine();
		
		int V =Integer.parseInt(input.split(" ")[0]);
		int F =Integer.parseInt(input.split(" ")[1]);
		int M =Integer.parseInt(input.split(" ")[2]);
		int T =Integer.parseInt(input.split(" ")[3]);
		
		//logic.
		/*
		 * 다카하시의 집에는 다카하시, 그의 아버지, 그의 어머니, 이렇게 3명이 살고 있다. 
		 * 그들 모두는 매일 밤 화장실에서 머리를 감는다.
		 * 아버지, 어머니, 다카하시의 차례로 목욕을 하고, 
		 * 각각 A, B, C 밀리리터의 샴푸를 사용한다.
		 * 오늘 아침, 그 병에는 V 밀리리터의 샴푸가 들어있었다. 
		 * 리필하지 않고, 머리를 감을 샴푸가 가장 먼저 부족하게 될 사람은 누구인가?
		 * 
		 * 출력
		 * 머리를 감을 샴푸가 가장 먼저 부족하게 될 사람이 다카하시의 아버지라면 F를,
		 *  다카하시의 어머니라면 M을, 다카하시라면 T를 인쇄한다.
		 */
	      while(V>=0) {
	          V-=F;
	          if(V<0) {
	             System.out.println("F");
	             break;
	          }
	          V-=M;
	          if(V<0) {
	             System.out.println("M");
	             break;
	          }
	          V-=T;
	          if(V<0) {
	             System.out.println("T");
	             break;
	          }
	          
	       }
		
		
		
	}//main

}
