package Practice;

import java.util.Scanner;

public class Test4 {//조깅.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오");
		String input = scan.nextLine();
		
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		int d = Integer.parseInt(input.split(" ")[3]);
		int e = Integer.parseInt(input.split(" ")[4]);
		int f = Integer.parseInt(input.split(" ")[5]);
		int x = Integer.parseInt(input.split(" ")[6]);
		
		
		//로직.
		/*
		 * Takahashi : 초속 B미터 A초간 걷고 C초간 휴식한다.
		 *  B*A초 걷고 0*C초 쉼
		 * Aoki : 초속 E미터 D초간 걷고 F초 동안 휴식.
		 *  E*D초 걷고 0*F초 쉼
		 *  X초 지났을 때. 누가 더 멀리 갔는가?
		 *  같은 거리 갔으면 Draw 인쇄한다.
		 */
		String result = "";
		
		int taka = 0;
		for(int i=0; i<=x; i+=(a+c)) {
			if(x-i<a) {
				taka += (x-i)*b;
			} else {
				taka+=a*b;
			}
		}
		
		int aoki =0;
		for(int i=0; i<=x; i+=(d+f)) {
			if(x-i<d) {
				aoki+=(x-i)*e;
			} else {
				aoki += d*e;
			}
		}
		
		
		
		
		if(taka > aoki) {
			result = "Takahashi";
		} else if(taka < aoki) {
			result = "Aoki";
		} else if(taka == aoki) {
			result = "Draw";
		}
		
		//출력.
		System.out.println(result);
		
		
		
	}

}
