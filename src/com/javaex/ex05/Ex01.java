package com.javaex.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int i = 0;
		
		while(i < 10) {
			System.out.println(n+" * "+i+" = "+n*i );
			i++;
		}
	}
}
