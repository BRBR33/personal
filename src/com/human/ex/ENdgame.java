package com.human.ex;

public class ENdgame {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("�� ��?? : ");
		int a = Integer.parseInt(sc.nextLine());

		switch (a) {
		case 1:
		case 2:
		case 12:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("���� ���� �Դϴ�.");
		}

		sc.close();

	}

}
