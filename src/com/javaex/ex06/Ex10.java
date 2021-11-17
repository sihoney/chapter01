package com.javaex.ex06;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			
			int n = sc.nextInt();
			
			if(n > max) {
				max = n;
			}
		}
		
		System.out.println("최댓값은 "+max+"입니다.");
		
	}
}
