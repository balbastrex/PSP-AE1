package es.florida.ae1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {

	public static int demanaNum() {
		Scanner teclat = new Scanner(System.in);
		int resultat = 0;
		List<Integer> llista = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			System.out.print("Introduce un número: ");
			int num = teclat.nextInt();
			llista.add(num);
		}
		for(int i=0; i<llista.size();i++) {
			resultat = resultat + Integer.parseInt(llista.toArray()[llista.size()-i-1].toString());
		}
		return resultat;
	}

	public static void main(String[] args) {
		int sumaTotal = demanaNum();
		System.out.println("La suma de todos los números es: " + sumaTotal);
	}
}
