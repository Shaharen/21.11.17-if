package 조건문;

import java.util.Scanner;

public class Exam_0001 {

	public static void main(String[] args) {
		// 원 중심, 반지름 실수로 입력 받고 다른 점 (x,y)가 원 내부에 있는가?
		Scanner sc = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력 >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();

		System.out.println("점 입력 >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		boolean isCheck1 = (x - a) * (x - a) + (y - b) * (y - b) == r * r;
		boolean isCheck2 = (x - a) * (x - a) + (y - b) * (y - b) < r * r;
		
		if (isCheck1) {
			System.out.println("(a,b)는 원 위에 있습니다.");
		} else if (isCheck2) {
			System.out.println("(a,b)는 원 안에 있습니다.");
		} else {
			System.out.println("(a,b)는 원 밖에 있습니다.");
		}

	}

}
 
