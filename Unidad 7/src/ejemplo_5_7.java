/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y
realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del
corrimiento
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejemplo_5_7 {
public static final int MAX = 8;
public static final int MAXVALOR = 10;
public static final int MINVALOR = 1;

	public static void main(String[] args) {
		int [] arrenteros = new int [MAX];
		int pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			//carga e impresion de arreglo aleatorio
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimir_arreglo_int(arrenteros);
			
			//pedir posicion
			System.out.println("Ingrese una posicion: ");
			pos = Integer.valueOf(entrada.readLine());
			
			corrimiento_derecha(arrenteros, pos);
			imprimir_arreglo_int(arrenteros);
			
		}catch(Exception exc){
			System.out.println(exc);
		}

	}	
	public static void cargar_arreglo_aleatorio_int(int []arrenteros){
		//carga de arreglo de int con valores de MINVALOR a MAXVALOR
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
		arrenteros[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}

	public static void imprimir_arreglo_int(int[] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
		}
	}
	public static void corrimiento_derecha(int [] arrenteros, int pos){
		int indice = MAX-1;
		while(indice > pos){
			arrenteros[indice]=arrenteros[indice - 1];
			indice --;
		}
	}

}

