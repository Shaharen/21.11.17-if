package ���ǹ�;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// int Ÿ�� ���� age ����, Ű����� �� �Է¹ޱ�
		// age�� 20���� ũ�ų� ������ �����Դϴ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		/* if(age >= 20) {
			System.out.println("�����Դϴ�");
		}// �ƴ϶�� �̼������Դϴ� ���
		else {
			System.out.println("�̼������Դϴ�");
		} */
		// ���� if �� - ���� �� True�� �Ǵ¼��� �������ͼ� ��� ���
		if(age < 10) {
			System.out.println("10�� �̸��Դϴ�");
		}		
		else if(age>=10 && age <20) {
			System.out.println("10���Դϴ�");
		}
		else if(age>=20 && age <30) {
			System.out.println("20���Դϴ�");
		}
		else if(age>=30 && age <40) {
			System.out.println("30���Դϴ�");
		}
		else {
			System.out.println("30�� �̻��Դϴ�");
		}
		

	}

}