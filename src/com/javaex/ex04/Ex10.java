package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		
		System.out.print("사번: ");
		
		int n = sc.nextInt();
		
		switch(n % 3) {
		case 0:
			System.out.println("A팀입니다.");
			break;
		case 1:
			System.out.println("B팀입니다.");
			break;
		case 2:
			System.out.println("C팀입니다.");
			break;
		}
		
		if(n < 0) {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
