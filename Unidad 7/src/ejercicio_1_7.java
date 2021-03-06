/*Hacer un programa que dado un arreglo de enteros de tama?o 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que est? en 0 se intercambia con
el que est? en 9, el que est? en 1 con el que est? en 8...). Este intercambio no se debe realizar
de manera expl?cita, hay que hacer un m?todo que incluya una iteraci?n de intercambio.*/


import java.util.Random;


public class ejercicio_1_7 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;

	public static void main(String[] args) {
		int[] arrenteros = new int[MAX];
		carga_aleatoria_arreglo(arrenteros);
		imprimir_arreglo(arrenteros);
		invertir_orden(arrenteros);
		imprimir_arreglo(arrenteros);
		
		
	}

	public static void carga_aleatoria_arreglo(int[] arrenteros) {
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
	public static void invertir_orden(int [] arrenteros){
		// indice = MAX -1
		int inicio =0;
		int fin=MAX-1;
		while( inicio < fin){
			//guardar variable el inicio
			int aux = arrenteros[inicio];
			//se pisa el valor
			arrenteros[inicio]=arrenteros[fin];
			
			arrenteros[fin]=aux;
			fin--;
			inicio++;
		}
	}
	
}
