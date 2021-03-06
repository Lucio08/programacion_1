/*Hacer un programa que dado un arreglo de enteros de tama?o 10 que se encuentra
precargado, solicite al usuario una posici?n y realice un corrimiento a izquierda o hacia la
menor posici?n del arreglo.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_3_7 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		int[] arrenteros = new int[MAX];
		int pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			cargar_arreglo(arrenteros);
			imprimir_arreglo(arrenteros);
			
			System.out.println("Ingrese una posicion: ");
			pos = Integer.valueOf(entrada.readLine());
			corrimiento_izquierda(arrenteros, pos);
			imprimir_arreglo(arrenteros);

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}

	public static void cargar_arreglo(int[] arrenteros) {
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++) {
			arrenteros[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
		}
	}

public static void imprimir_arreglo(int[] arrenteros) {
	for (int pos = 0; pos < MAX; pos++) {
		System.out.println("Arrenteros [" + pos + "] =>: "
				+ arrenteros[pos]);
	}
}

	
	public static void corrimiento_izquierda(int [] arrenteros, int pos){
		 
		 int indice =  MIN + 1;
		while(indice < pos){
			arrenteros[indice]=arrenteros[indice + 1];
			indice ++;
		}
	}
}

