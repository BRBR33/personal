package com.human.ex;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		
		for(int i=0;i<5;i++) {
			System.out.print("���Է�>>");
			int input = Integer.parseInt(sc.nextLine());
			if(max<input) {
				max=input;
			}
			if(min>input) {
				min=input;
			}
			
			
		}
		System.out.println("ū��:"+max+"������:"+min);
		
	sc.close();
	
	}
}