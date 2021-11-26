package 조건문;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// int 타입 변수 age 선언, 키보드로 값 입력받기
		// age가 20보다 크거나 같으면 성인입니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		/* if(age >= 20) {
			System.out.println("성인입니다");
		}// 아니라면 미성년자입니다 출력
		else {
			System.out.println("미성년자입니다");
		} */
		// 다중 if 문 - 조건 중 True가 되는순간 빠져나와서 결론 출력
		if(age < 10) {
			System.out.println("10살 미만입니다");
		}		
		else if(age>=10 && age <20) {
			System.out.println("10대입니다");
		}
		else if(age>=20 && age <30) {
			System.out.println("20대입니다");
		}
		else if(age>=30 && age <40) {
			System.out.println("30대입니다");
		}
		else {
			System.out.println("30대 이상입니다");
		}
		

	}

}