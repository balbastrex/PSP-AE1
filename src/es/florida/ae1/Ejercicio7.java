package es.florida.ae1;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
//		String nom = "";
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introduzca nombre del trabajador: ");
		String nom = teclat.nextLine();
		
//		System.out.println(nom);
		
		System.out.println("Introduzca experiencia del trabajador (en años): ");
		Double xp = teclat.nextDouble();
		
//		System.out.println(xp);
		
		if(xp < 1) {
			System.out.print(nom + ": Desarrollador Junior L1 – 15000-18000");
		} else if(xp <= 3) {
			System.out.print(nom + ": Desarrollador Junior L2 – 18000-22000");
		} else if(xp <= 5) {
			System.out.print(nom + ": Desarrollador Senior L1 – 22000-28000");
		} else if(xp <= 8) {
			System.out.print(nom + ": Desarrollador Senior L2 – 28000-36000");
		} else {
			System.out.print(nom + ": Analista / Arquitecto. Salario a convenir en base a rol");
		}
	}

}
