package ���ǹ�;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ���� ���߱�
		Scanner sc = new Scanner(System.in);

		int answer = 10;

		System.out.print("������ �Է����ּ��� >> ");
		int user = sc.nextInt();

		// ���� ����ڰ� 10�� �Է��ߴٸ� "�����Դϴ�" ��� �� "���α׷� ����" ���
		// 10�� �ƴ϶�� "���α׷� ����" ���
		if (user == answer) {
			System.out.println("�����Դϴ�");
		}
		System.out.println("���α׷� ����!");

	}

}
