package es.florida.ae1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int pairSum = 0;
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num = Integer.parseInt(teclado.nextLine());
		for (int i = 0; i < num; i++){
			if (i%2 == 0) {
				pairSum = pairSum + i;
			}
		}
		System.out.println("La suma de los números pares desde 0 hasta " + num + " es " + pairSum);
	}

}
