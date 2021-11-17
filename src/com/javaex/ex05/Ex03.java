package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		block2(5);
		
	}
	
	static void block(int line) {
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
	static void block2(int line) {
		for(int i = 0; i < line; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}

	}
}
