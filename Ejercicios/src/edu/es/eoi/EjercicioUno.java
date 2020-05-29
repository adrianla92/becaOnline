package edu.es.eoi;

public class EjercicioUno {
	public static int numeroUno = 7;
	public static int numeroDos = 12;

	public void sumar() {
		int res = numeroUno + numeroDos;
		System.out.println(res);
	}

	public void restar() {
		int res = numeroUno - numeroDos;
		System.out.println(res);
	}

	public void multiplicar() {
		int res = numeroUno * numeroDos;
		System.out.println(res);
	}

	public void dividir() {
		int res = numeroUno / numeroDos;
		System.out.println(res);
	}

	public static void main(String[] args) {
		
		EjercicioUno ej1 = new EjercicioUno();
		ej1.sumar();
		ej1.restar();
		ej1.multiplicar();
		ej1.dividir();

		if (numeroUno > numeroDos) {
			System.out.println(numeroUno + " es el mayor");
		} else if (numeroUno < numeroDos) {
			System.out.println(numeroDos + " es el mayor");
		} else {
			System.out.println("son iguales");
		}
	}
}
