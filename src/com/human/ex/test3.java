package com.human.ex;
import java.util.Scanner;  
public class test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

			for (int i = 0; i < 5; i++) {
				System.out.print(String.format("%d번째 수를 입력하세요 : ", i + 1));
				int temp = sc.nextInt();    

				max = Math.max(temp, max);   

				min = Math.min(temp, min);   

			}
		System.out.println("가장 큰 수는 : " + max);

		System.out.println("가장 큰 수는 : " + min);

		sc.close();

	}

}