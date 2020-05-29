package edu.es.eoi;

import java.util.Scanner;

public class EjercicioOcho {
	
	public static void caracterPorCaracter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase:");
		String cadena = sc.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		caracterPorCaracter();

	}

}
