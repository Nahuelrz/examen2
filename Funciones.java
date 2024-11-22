package examen;

import java.util.Scanner;

public class Funciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funciones conversion = new Funciones(); // conversion.algo para funciones no static
		int opcion = menu(sc); //Hago el menu una función para que luego al repetir no tenga que añadir todo nuevamente
		// Hago un switch donde pondre las opciones 1, 2 y 3. Luego tendre que añadir un
		// while para que salga del bucle
		while (opcion!=4) {
		switch (opcion) {
		case 1: // Caso conversión a segundos
			System.out.println("Introduce los días");
			int days = sc.nextInt();
			System.out.println("Introduce las horas");
			int hours = sc.nextInt();
			System.out.println("Introduce los minutos");
			int minutes = sc.nextInt();
			System.out.println("Introduce los segundos");
			int seconds = sc.nextInt(); // Luego de pedirle toda la informacion para convertirlo a segundos realizo unas
										// funciones que depende de cada cual tendre que darle x variable
			conversion.dAS(days);
			conversion.hAS(hours);
			conversion.mAS(minutes);
			conversion.msAS(minutes, seconds);
			conversion.hmsAS(hours, minutes, seconds);
			conversion.dhmsAS(days, hours, minutes, seconds);
			break;

		case 2: // Nota media requiere que la nota sera >0 y 10<
			System.out.println("Introduzca 5 notas para calcular su media (Las notas deben ser mayor que 0 y menor que 10): ");
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			double nota4 = sc.nextDouble();
			double nota5 = sc.nextDouble();
			double media = notaMedia(nota1, nota2, nota3, nota4, nota5); // Devuelve un if donde si esta bien
																			// introducido las notas devuelve la media
																			// si no da error.
			break;
		// Hare un if donde depende que opcion eliga se realice una operacion
		case 3: // Temperatura
			System.out.println("Que opción quieres realizar: 1.De Celsius a Fahrenheit 2.De Fanhrenheit a Celsius ");
			int temperaturaopcion = sc.nextInt();
			if (temperaturaopcion == 1) {
				System.out.println("Introduce grados Celsius: ");
				double c = sc.nextDouble();
				conversion.c2f(c);
			}
			else if (temperaturaopcion == 2) {
				System.out.println("Introduce grados Fahrenheit: ");
				double f = sc.nextDouble();
				conversion.f2c(f);
			}
			else { 
				System.out.println("Elige una opcion correcta.");
			}
			break;
		}
	     opcion = menu(sc); //Menu funcion
		}
		System.out.println("Fin del programa. Examen realizado por Kevin Nahuel Ramirez Murieda. 23 de Noviembre de 2024.");
	}

	public static int menu(Scanner sc) {
		System.out.println("Elige la opción que quieras realizar: 1.Conversión a segundos 2.Nota media 3.Temperaturas 4. Salir del programa"); // Menu
		int opcion = sc.nextInt();
		return opcion;
	}

	public double f2c(double f) {
		double celsius = (f - 32) * 5/9;
		System.out.println("Los grados Celsius son: " + celsius + "ºC");
		return celsius;
	}

	public double c2f(double c) {
		double fahrenheit = (c * 9/5) + 32;
		System.out.println("Los grados Fahrenheit son: " + fahrenheit + "ºF");
		return fahrenheit;
	}

	public static double notaMedia(double nota1, double nota2, double nota3, double nota4, double nota5) {
		if (nota1 > 0 && nota1 < 10 && nota2 > 0 && nota2 < 10 && nota3 > 0 && nota3 < 10 && nota4 > 0 && nota4 < 10 && nota5 > 0 && nota5 < 10) {
			double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
			System.out.println("Tu media es: " + media);
			return media;
		} else {
			System.out.println("Introduzca bien las notas.");
			return 0;
		}
	}

	public long dAS(int days) {
		int dAS = days * 86400;
		System.out.println("dAS: " + dAS + " segundos");
		return dAS;
	}

	public long hAS(int hours) {
		int hAS = hours * 3600;
		System.out.println("hAS: " + hAS + " segundos");
		return hAS;
	}

	public long mAS(int minutes) {
		int mAS = minutes * 60;
		System.out.println("mAS: " + mAS + " segundos");
		return mAS;
	}

	public long msAS(int minutes, int seconds) {
		int msAS = minutes * 60 + seconds;
		System.out.println("msAS: " + msAS + " segundos");
		return msAS;
	}

	public long hmsAS(int hours, int minutes, int seconds) {
		int hmsAS = hours * 3600 + minutes * 60 + seconds;
		System.out.println("hmsAS: " + hmsAS + " segundos");
		return hmsAS;
	}

	public long dhmsAS(int days, int hours, int minutes, int seconds) {
		int dhmsAS = days * 86400 + hours * 3600 + minutes * 60 + seconds;
		System.out.println("dhmsAS: " + dhmsAS + " segundos");
		return dhmsAS;
	}

}
