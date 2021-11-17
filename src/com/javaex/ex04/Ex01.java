package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		if(n > 0 && n < 18) {
			System.out.println("청소년 입니다.");
		}
	}
}
