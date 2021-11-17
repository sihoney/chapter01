package com.javaex.ex06;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int n = sc.nextInt();
		
		sc.close();
		
		for(int i = n; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
