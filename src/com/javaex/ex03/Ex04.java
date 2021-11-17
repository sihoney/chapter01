package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수를 입력하시요");
		
		int n = sc.nextInt();
		sc.close();
		
		if(n >= 90) {
			System.out.println("A 등급");
		} else if(n >= 80) {
			System.out.println("B 등급");
		} else if(n >= 70) {
			System.out.println("C 등급");
		} else if(n >= 60) {
			System.out.println("D 등급");
		} else {
			System.out.println("F 등급");
		}
	}
}
