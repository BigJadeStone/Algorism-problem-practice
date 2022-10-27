package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		//부족한 숫자
		Scanner scan = new Scanner(System.in);
		String num9 = scan.nextLine();
		
		//로직 처리...
		char[] split = num9.toCharArray();
		int sum = 0;
		for(int i=0; i < split.length; i++) {
			sum += split[i];
		}
		System.out.println(sum);
		int result = 525-sum-48;
		
		//출력...
		System.out.println(result);
		
		
		
		
		
		
		//nextline, split, parsint api는 이거 세개만 쓰면됨.
		
	}

}
