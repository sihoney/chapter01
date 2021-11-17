package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		
		System.out.print("기호: ");
		String b = sc.next();
		
		System.out.print("숫자1: ");
		int a = sc.nextInt();
		
		System.out.print("숫자2: ");
		int c = sc.nextInt();
		
		double result = 0;
		
		if(b.equals("+")) {
			result = a + c;
			System.out.println("결과는 "+result);
		} else if(b.equals("-")) {
			result = a - c;
			System.out.println("결과는 "+result);
		} else if(b.equals("*")) {
			result = a * c;
			System.out.println("결과는 "+result);
		} else if(b.equals("/")) {
			if(c == 0) {
				System.out.println("계산할 수 없습니다.");
			} else {
				result = a / c;
				System.out.println("결과는 "+result);
			}
			
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}	
		
	}
}
