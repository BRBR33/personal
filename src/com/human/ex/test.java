package com.human.ex;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<5;i++) {
			System.out.print(String.format("%d번 째 수를 입력하세요 : ",i+1));
			int temp = Integer.parseInt(sc.nextLine());
			max = Math.max(temp, max);
			min = Math.min(temp, min);
			
		}
	
		System.out.print(String.format("가장 큰 수는 : %d ", max));
		System.out.print(String.format("가장 작은 수는 : %d ", min));
		
	sc.close();
	
	}
}