package com.javaex.ex06;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		int count = 0;
		
		for(int i = 5; i <= n; i += 5) {
			count++;
			sum += i;
		}
		
		System.out.println("5의 배수의 개수: "+count);
		System.out.println("5의 배수의 합: "+sum);
	}
}
