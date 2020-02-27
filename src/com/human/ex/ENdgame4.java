package com.human.ex;

public class ENdgame4 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("입력하세요>>");
		String userData = sc.nextLine();
		java.util.Random rd = new java.util.Random();
		int cumputeDataNum = rd.nextInt(3);
		String cumputeData = "";
		String whoIsWin = "";

		switch (userData) {
		case "가위":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "가위";
				whoIsWin = "비김";
				break;
			case 1:
				cumputeData = "바위";
				whoIsWin = "컴퓨터 승";
				break;
			case 2:
				cumputeData = "보";
				whoIsWin = "사람 승";
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}
			break;
		case "바위":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "가위";
				whoIsWin = "사람 승";
				break;
			case 1:
				cumputeData = "바위";
				whoIsWin = "비김";
				break;
			case 2:
				cumputeData = "보";
				whoIsWin = "컴퓨터 승";
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}
			break;
		case "보":
			switch (cumputeDataNum) {
			case 0:
				cumputeData = "가위";
				whoIsWin = "컴퓨터 승";
				break;
			case 1:
				cumputeData = "바위";
				whoIsWin = "사람 승";
				break;
			case 2:
				cumputeData = "보";
				whoIsWin = "비김";
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");

		}
		
		System.out.println(" 사람:"+userData);
		System.out.println(" 컴퓨터:"+cumputeData);
		System.out.println(" 승패:"+whoIsWin);
		sc.close();
	}

}
