package com.javaex.ex05;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자을 입력하세요.");
		
		int n = sc.nextInt();
		
		sc.close();
		
		dan2();
	}
	
	public static void dan2() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+ i*j);
			}
			System.out.println("");
		}
	}
	
	public static void sum2(int n) {
		int result = 0;
		
		for(int i = 1; i <=10; i++) {
			result += i;
			System.out.println(i+"까지의 합은 "+result+"입니다.");
		}
	}
	
	public static void dan(int n) {
		for(int i = 0; i < 9; i++) {
			System.out.println(n+" * "+(i+1)+" = "+ n * (i+1));
		}
	}
	
	public static void sum(int n) {
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		
		System.out.println("1부터 "+n+"까지의 정수의 합은 "+result+"입니다.");
	}
}
