package edu.es.eoi;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		String password = "holaholita";
		ArrayList passwords = new ArrayList();
		System.out.println("Password:");
		Scanner scanner = new Scanner(System.in);
		String passwordTried = scanner.nextLine();

		if (passwordTried.equals(password)) {
			System.out.println("BIENVENIDO");
		} else if (passwordTried.equals("FIN")) {
			System.out.println("Lo has intentado");
		}

		while (!passwordTried.equals(password) || !passwordTried.equals("FIN")) {
			System.out.println("Password incorrecta, vuelve a intentarlo: ");
			passwordTried = scanner.nextLine();
			passwords.add(passwordTried);
		}
		
//		passwords.sort();
	}
}
