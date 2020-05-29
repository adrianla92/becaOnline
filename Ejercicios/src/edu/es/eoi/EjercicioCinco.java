package edu.es.eoi;

import java.util.Scanner;

public class EjercicioCinco {

	public static String vocales = "AaEeOoIiUu";
	public static int numeroVocales = 0;

	static Scanner scanner = new Scanner(System.in);
	static String  cadena = scanner.nextLine();
	
	public static void contar() {
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (vocales.charAt(j) == cadena.charAt(i)) {
					numeroVocales++;
				}
			}
		}
		System.out.println("En la frase: '" + cadena + "' hay " + numeroVocales + " vocales");
	}

	public static void main(String[] args) {
		EjercicioCinco.contar();
	}
}