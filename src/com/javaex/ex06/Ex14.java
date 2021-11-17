package com.javaex.ex06;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i != 1) {
				System.out.print("+");
			}
			System.out.print(i);
			sum += i;
		}
		
		System.out.println("\n합계: "+sum);

	}
}
