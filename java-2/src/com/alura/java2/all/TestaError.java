package com.alura.java2.all;

public class TestaError {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] ss = new String[Integer.MAX_VALUE];
	}

}