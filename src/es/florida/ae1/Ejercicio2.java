package es.florida.ae1;

import java.util.ArrayList;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		String nombres[] = new String[]{"Noelia", "Ximo", "Manel", "Pablo", "Nestor", "Josep"};
		
		System.out.println("Parte A");

		for (int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("Parte B");
		
		ArrayList<String> nombresList = new ArrayList<String>();
		
		nombresList.add("Ximo");
		
		for (int i=0; i<nombresList.size(); i++) {
			System.out.println(nombresList[i]);
		}

	}

}


//package es.florida.ae1;
//
//import java.util.ArrayList;
//
//public class Ejercicio2 {
//	
//	public static ArrayList<String> lista() {
//		
//		ArrayList<String> nombres = new ArrayList<String>();
//		nombres.add("Ximo");
//		return nombres;
//	}
//	
//	public static void main(String[] args) {
//		var nombres = lista();
//		for (int i=0; i<nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
//	}
//
//}



//'Noelia', 'Ximo', 'Manel', 'Pablo', 'Nestor', 'Josep'


//package es.florida.ae1;
//
//import java.util.ArrayList;
//
//public class Ejercicio2 {
//	
//	public static ArrayList<String> lista() {
//		String nombres[] = {"Noelia", "Ximo", "Manel", "Pablo", "Nestor", "Josep"};
//		return nombres;
//	}
//	
//	public static void main(String[] args) {
//		var nombres = lista();
//		for (int i=0; i<nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
//	}
//
//}