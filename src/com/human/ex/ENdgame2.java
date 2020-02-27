package com.human.ex;

public class ENdgame2 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.Random ran = new java.util.Random();
		int wc = 0, dc = 0, lc = 0;
		String rank = "BRONZE";
		int tear = 4;
		int lp = 0;
		double wr = 0;
		int gradedown = 0;
		for (;;) {
			int point = ran.nextInt(4) + 19;
			System.out.print("뭘 낼꺼니 ? "); // q : 가위; w : 바위; e : 보;
			String str = sc.nextLine();
			int a = ran.nextInt(3);
			switch (a) {
			case 0:
				System.out.println("컴퓨터 : 가위");
				if (str.equals("q")) {
					System.out.println("사용자 : 가위");
					System.out.println("무승부");
					dc++;
				} else if (str.equals("w")) {
					System.out.println("사용자 : 바위");
					System.out.println("승리");
					wc++;
					lp = lp + point;
				} else {
					System.out.println("사용자 : 보");
					System.out.println("패배");
					lc++;
					lp = lp - point;
					if (lc == lc + 3)
						gradedown++;
				}
				break;
			case 1:
				System.out.println("컴퓨터 : 바위");
				if (str.equals("w")) {
					System.out.println("사용자 : 바위");
					System.out.println("무승부");
					dc++;
				} else if (str.equals("e")) {
					System.out.println("사용자 : 보");
					System.out.println("승리");
					wc++;
					lp = lp + point;
				} else {
					System.out.println("사용자 : 가위");
					System.out.println("패배");
					lc++;
					lp = lp - point;
					if (lc == lc + 3)
						gradedown++;
				}
				break;
			case 2:
				System.out.println("컴퓨터 : 보");
				if (str.equals("e")) {
					System.out.println("사용자 : 보");
					System.out.println("무승부");
					dc++;
				} else if (str.equals("q")) {
					System.out.println("사용자 : 가위");
					System.out.println("승리");
					wc++;
					lp = lp + point;
				} else {
					System.out.println("사용자 : 바위");
					System.out.println("패배");
					lc++;
					lp = lp - point;
					if (lc == lc + 3)
						gradedown++;
				}
			}

			if (lp < 0)
				lp = 0;
			if (lp > 100)
				lp = 100;
			if (wc == 0 && lc == 0) {
				wr = 0;
			} else {
				wr = (double) wc / (wc + lc) * 100;
			}
			System.out.println(String.format("전적 : %d승 %d무 %d패\n승률 : %.2f%%\n현재 티어 : %s %d\nLP : %d\n", wc, dc, lc, wr,
					rank, tear, lp));

			if (lp == 0 && gradedown == 3) {

				lp = 75;
				tear++;
				if (tear == 5) {
					if (rank.equals("BRONZE")) {
						tear = 4;
						lp = 0;
					} else if (rank.equals("SILVER")) {
						rank = "BRONZE";
						tear = 1;
					} else if (rank.equals("GOLD")) {
						rank = "SILVER";
						tear = 1;
					}
				}
				gradedown = 0;
				System.out.println(String.format("%s %d로 강등되었습니다.", rank, tear));
			}

			if (lp == 100) {
				System.out.println("승급전");
				int pw = 0, pl = 0, pd = 0;
				for (;;) {
					System.out.print("뭘 낼꺼니 ? ");
					str = sc.nextLine();
					int a1 = ran.nextInt(3);
					switch (a1) {
					case 0:
						System.out.println("컴퓨터 : 가위");
						if (str.equals("q")) {
							System.out.println("사용자 : 가위");
							System.out.println("무승부");
							pd++;
						} else if (str.equals("w")) {
							System.out.println("사용자 : 바위");
							System.out.println("승리");
							pw++;
						} else {
							System.out.println("사용자 : 보");
							System.out.println("패배");
							pl++;
						}
						break;
					case 1:
						System.out.println("컴퓨터 : 바위");
						if (str.equals("w")) {
							System.out.println("사용자 : 바위");
							System.out.println("무승부");
							pd++;
						} else if (str.equals("e")) {
							System.out.println("사용자 : 보");
							System.out.println("승리");
							pw++;

						} else {
							System.out.println("사용자 : 가위");
							System.out.println("패배");
							pl++;
						}
						break;
					case 2:
						System.out.println("컴퓨터 : 보");
						if (str.equals("e")) {
							System.out.println("사용자 : 보");
							System.out.println("무승부");
							pd++;
						} else if (str.equals("q")) {
							System.out.println("사용자 : 가위");
							System.out.println("승리");
							pw++;
						} else {
							System.out.println("사용자 : 바위");
							System.out.println("패배");
							pl++;
						}
					}
					if (pw == 2 || pl == 2 || pd == 2 || pw + pd + pl == 3)
						break;
				}

				if (pw == 2) {

					lp = 0;
					tear--;
					if (rank.equals("GOLD") && tear == 0 && lp == 0 && pw == 2) {
						System.out.println("MISSION COMPLETE !!!");
						break;
					}

					if (tear == 0) {
						if (rank.equals("BRONZE")) {
							rank = "SILVER";
							tear = 4;
						} else if (rank.equals("SILVER")) {
							rank = "GOLD";
							tear = 4;
						}
					}

					System.out.println(String.format("축하합니다. %s %d로 승급하셨습니다.", rank, tear));
				} else {
					System.out.println("승급에 실패하였습니다.");
					lp = lp - (pl * point) + (pw * point);
					if (lp > 100)
						lp = 100;
					System.out.println(String.format("현재 티어 : %s %d\nLP : %d", rank, tear, lp));

				}

			}

			if (rank.equals("GOLD") && tear == 0 && lp == 0) {
				System.out.println("MISSION COMPLETE !!!");
				break;
			}

		}
		sc.close();
	}

}
