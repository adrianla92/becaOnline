package edu.es.eoi;

import java.util.Scanner;

public class EjercicioSiete {

	public static void invertirCadena() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String cadena = sc.nextLine();
		String cadenaInvertida = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		System.out.println("Cadena invertida: " + cadenaInvertida);
		
	}
	
	public static void main(String[] args) {
		invertirCadena();
	}
}
