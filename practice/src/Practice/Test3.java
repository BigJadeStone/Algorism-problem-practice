package Practice;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		//4개의 점..
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력 하세요>");
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		String row3 = scan.nextLine();
		
		int x1 = Integer.parseInt(row1.split(" ")[0]);
		int y1 = Integer.parseInt(row1.split(" ")[1]);
		
		
		int x2 = Integer.parseInt(row2.split(" ")[0]);
		int y2 = Integer.parseInt(row2.split(" ")[1]);
		
		
		int x3 = Integer.parseInt(row3.split(" ")[0]);
		int y3 = Integer.parseInt(row3.split(" ")[1]);
		
		//로직 처리
		int x4 = 0;
		int y4 = 0;
		
		if(x1 > 0 && y1 < 0) {
			x4 = -x1;
			y4 = -y1;
		} else if(x1 < 0 && y1 > 0) {
			x4 = -x1;
			y4 = -y1; 
		}
		
		if(x2 > 0 && y2 < 0) {
			x4 = -x2;
			y4 = -y2;
		} else if(x2 < 0 && y2 > 0) {
			x4 = -x2;
			y4 = -y2; 
		}
		
		if(x3 > 0 && y3 < 0) {
			x4 = -x3;
			y4 = -y3;
		} else if(x3 < 0 && y3 > 0) {
			x4 = -x3;
			y4 = -y3; 
		}
		
		
		String result = x4 +" "+y4;
		
		//출력
		System.out.println(result);
		
	}
	
}
