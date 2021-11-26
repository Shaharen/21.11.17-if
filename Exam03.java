package 조건문;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 정수 num 을 입력받아 1의 자리에서 반올림 한 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("반올림 수 : ");
		if(num % 10 >= 5) {
			System.out.println((num/10 + 1)* 10);  // (num+10) - (num % 10)
		}else {
			System.out.println((num/10)*10);       // (num - (num % 10)) 
		}

	}

}
