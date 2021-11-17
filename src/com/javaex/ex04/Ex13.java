package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		
		System.out.print("숫자: ");
		
		double n = (double) sc.nextInt();
		
		double result = 0;
		
		if(n <= 0) {
			result = n*n*n - 9*n + 2;
		} else if(n > 0) {
			result = 7*n + 2;
		}
		
		System.out.println("계산결과는 "+result);
		
	}
}
