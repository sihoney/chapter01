package com.javaex.ex05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		loop();
	}
	
	public static void loop() {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int n = sc.nextInt();
//			
//			if(n % 3 == 0 && n != 0) {
//				System.out.println("3의 배수입니다.");
//			} else if(n % 3 != 0){
//				System.out.println("3의 배수가 아닙니다.");
//			} else if( n == 0) {
//				System.out.println("종료");
//				break;
//			}
//		}
		boolean action = true;
		
		while(action) {
			System.out.println("숫자를 입력하세요.");
			int num =sc.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				action = false;
			} else if(num % 3 == 0) {
				System.out.println("3의 배수 입니다. ");
			} else {
				System.out.println("3의 배수가 아닙니다. ");
			}
		}
		
		sc.close();
	}
	
	public static void min() {
		// 6의 배수와 14의 배수를 만족하는 최소값을 구하시오.
		
		int a = 6;
		int b = 14;
		
		while(true) {
			if(b % a == 0) {
				System.out.println(b);
				break;
			}
			
			b += 14;
		}
	}
}
