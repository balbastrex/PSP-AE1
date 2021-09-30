package es.florida.ae1;

public class Ejercicio4 {
	public static void main(String[] args) {
		double fact = 1;
		for (int i = 15; i > 0; i--) {
			fact = fact*i;
		}
		System.out.println("El factorial de 15 es: " + fact);
	}
}
