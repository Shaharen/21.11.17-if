package ���ǹ�;

import java.util.Scanner;

public class Exam_0001 {

	public static void main(String[] args) {
		// �� �߽�, ������ �Ǽ��� �Է� �ް� �ٸ� �� (x,y)�� �� ���ο� �ִ°�?
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();

		System.out.println("�� �Է� >> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		boolean isCheck1 = (x - a) * (x - a) + (y - b) * (y - b) == r * r;
		boolean isCheck2 = (x - a) * (x - a) + (y - b) * (y - b) < r * r;
		boolean isCheck3 = (x - a) * (x - a) + (y - b) * (y - b) > r * r;

		if (isCheck1) {
			System.out.println("(a,b)�� �� ���� �ֽ��ϴ�.");
		} else if (isCheck2) {
			System.out.println("(a,b)�� �� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("(a,b)�� �� �ۿ� �ֽ��ϴ�.");
		}

	}

}
