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

	public static void main(String[] args) {
		int[] llista = {1,2,3,10,5,6,7,8};
		System.out.println(listFilter(llista));
		
		
	}

}
