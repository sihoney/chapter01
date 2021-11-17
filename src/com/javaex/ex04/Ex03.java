package com.javaex.ex04;

import java.util.Scanner;
// 5번 문제
public class Ex03 { 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요");
		
		System.out.print("키: ");
		
		int height = sc.nextInt();
		
		System.out.print("weight: ");
		
		int weight = sc.nextInt();
		
		double a = (height - 100) * 0.9;
		
		if(weight > a + 10) {
			System.out.println("과체중 입니다.");
		} else if(weight < a - 10) {
			System.out.println("저체중 입니다");
		} else {
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+a);
	}
}
