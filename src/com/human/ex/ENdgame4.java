package com.human.ex;

public class ENdgame4 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("�Է��ϼ���>>");
		String userData = sc.nextLine();
		java.util.Random rd = new java.util.Random();
		int cumputeDataNum = rd.nextInt(3);
		String cumputeData = "";
		String whoIsWin = "";

		switch (userData) {
		case "����":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "����";
				whoIsWin = "���";
				break;
			case 1:
				cumputeData = "����";
				whoIsWin = "��ǻ�� ��";
				break;
			case 2:
				cumputeData = "��";
				whoIsWin = "��� ��";
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}
			break;
		case "����":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "����";
				whoIsWin = "��� ��";
				break;
			case 1:
				cumputeData = "����";
				whoIsWin = "���";
				break;
			case 2:
				cumputeData = "��";
				whoIsWin = "��ǻ�� ��";
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}
			break;
		case "��":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "����";
				whoIsWin = "��ǻ�� ��";
				break;
			case 1:
				cumputeData = "����";
				whoIsWin = "��� ��";
				break;
			case 2:
				cumputeData = "��";
				whoIsWin = "���";
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");

		}
		
		System.out.println(" ���:"+userData);
		System.out.println(" ��ǻ��:"+cumputeData);
		System.out.println(" ����:"+whoIsWin);
		sc.close();
	}

}
