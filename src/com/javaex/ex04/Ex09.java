package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int b = sc.nextInt();
		
		sc.close();
		
		boolean c = false;
		
		if(a % b == 0) {
			c = true;
		}
		
		if(c == true) {
			System.out.println(a+"는(은) "+b+"의 약수가 맞습니다.");
		} else {
			System.out.println(a+"는(은) "+b+"의 약수가 아닙니다.");
		}
	}
}
