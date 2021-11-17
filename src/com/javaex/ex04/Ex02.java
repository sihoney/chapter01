package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		if(n == 0) {
			System.out.println("x는 0이다.");
		}
	}
}
