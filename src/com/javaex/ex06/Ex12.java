package com.javaex.ex06;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 1;
		
		for(int i = 1; i <= n; i++) {
			sum *= i;
		}
		
		System.out.println("결과값: "+sum);
	}
}
