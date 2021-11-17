package com.javaex.ex06;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean action = true;
		
		while(action) {
			int answer = (int) (Math.random() * 100);
			
			System.out.println("============================");
			System.out.println("      [숫자맟주기 게임 시작]");
			System.out.println("============================");
			
			boolean wrong = true;
			
			while(wrong) {
				System.out.print(">>");
				
				int input = sc.nextInt();
				
				if(input > answer) {
					System.out.println("더 낮게");
				} else if(input < answer) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다.");
					wrong = false;
				}
			}
			
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			
			String replay = sc.next();
			
			if(replay.equals("y")) {
				action = false;
			}
		}
	}
}
