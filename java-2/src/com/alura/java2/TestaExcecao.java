package com.alura.java2;

public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("INÍCIO main");
		m1();
		System.out.println("FIM main");
	}

	private static void m1() {
		System.out.println("INÍCIO m1");
		m2();
		System.out.println("FIM m1");
	}

	private static void m2() {
		System.out.println("INÍCIO m2");
		int nums[] = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		System.out.println("FIM m2");
	}

}
