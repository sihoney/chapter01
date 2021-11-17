package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("R101호");
		} else if(n == 2) {
			System.out.println("R202호");
		} else if(n == 3) {
			System.out.println("R303호");
		} else {
			System.out.println("상담원에게 문의하세요.")
		}
		
		sc.close();
	}
}
