package com.javaex.ex06;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		if(n % 2 == 0) {
			for(int i = 2; i <= n; i += 2) {
				sum += i;
			}
		} else if(n % 2 == 1) {
			for(int i = 1; i <= n; i += 2) {
				sum += i;
			}
		}
		
		System.out.println("결과값: "+sum);
	}
}
