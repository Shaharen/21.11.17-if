package ���ǹ�;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// ���� num �� �Է¹޾� 1�� �ڸ����� �ݿø� �� ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.print("�ݿø� �� : ");
		if(num % 10 >= 5) {
			System.out.println((num/10 + 1)* 10);  // (num+10) - (num % 10)
		}else {
			System.out.println((num/10)*10);       // (num - (num % 10)) 
		}

	}

}
