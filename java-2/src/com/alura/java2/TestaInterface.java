package com.alura.java2;

public interface TestaInterface {

	public static void main(String[] args) {
		AreaCalculavel quadrado = new Quadrado(4);
		AreaCalculavel retangulo = new Retangulo(4, 2);
		AreaCalculavel circulo =  new Circulo(10);
		System.out.println(quadrado.calculaArea());
		System.out.println(retangulo.calculaArea());
		System.out.println(circulo.calculaArea());
	}
}
