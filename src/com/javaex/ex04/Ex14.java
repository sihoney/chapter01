package com.javaex.ex04;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		
		double m = (double) sc.nextInt();
		
		double t = 0;
		
		sc.close();
		
		if(m <= 0) {
			System.out.println("잘못 입력했습니다.");
		}
		
		else if(m <= 1000) {
			t = m * 0.09;
		} else if(m <= 4000) {
			t = 1000*0.09 + 0.18*(m-1000); 
		} else if(m < 8000) {
			t = 1000*0.09 + 3000*0.18 + 0.27*(m-4000);
		} else if(m >= 8000) {
			t = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(m-8000);
		}
		
		if(t != 0) {
			System.out.println("소득세는 "+t+"입니다.");
		}
		
	}
}
