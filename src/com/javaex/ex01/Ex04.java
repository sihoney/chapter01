package com.javaex.ex01;

import java.util.Scanner;

class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 5;
		
		int b = a++;
		
		System.out.println(b);
		
		System.out.println(a);
		
		sc.close();
		
		System.out.println("git test-version 01");
		System.out.println("git test-version 02-1");
		System.out.println("git test-version 02-2");
	}
}