package edu.es.eoi;

import java.util.Scanner;

public class EjercicioSeis {
	
	static int filas;
	static int columnas;
	static char caracter;
	
	public static void dibujarRectangulo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce numero de filas:");
		filas = scanner.nextInt();
		System.out.println("Introduce numero de columnas:");
		columnas = scanner.nextInt();
		System.out.println("Introduce caracter:");
		caracter = scanner.next().charAt(0);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(caracter);
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		dibujarRectangulo();
	}

}
