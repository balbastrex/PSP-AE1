package es.florida.ae1;

public class Ejercicio5 {
	
	static int listFilter(int[] llista){
		int max = 0;
		for (int i = 0; i<llista.length; i++) {
			if (llista[i] > max) {
				max = llista[i];
			}
		}
		return max;
	}

	public static void main(int[] args) {
		
		int[] llista = {1,2,3,4,5,6,7,8};
		System.out.println(listFilter(llista));
		
		
	}

}
