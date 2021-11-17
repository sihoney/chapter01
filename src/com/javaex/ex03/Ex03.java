package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시요");
		int n = sc.nextInt();
		sc.close();
		
		if(n > 0) {
			if(n % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else if(n < 0) {
			System.out.println("음수");
		}
	}
}
