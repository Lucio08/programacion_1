/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en el arreglo. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán
tantas copias de la última posición del arreglo como cantidad de ocurrencias del número).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_6_7 {
	public static final int MAX = 10;
	
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	
	public static void main(String[] args) {
		int [] arrenteros = new int [MAX];
		int numeroEntero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimir_arreglo_int(arrenteros);
			
			System.out.println("Ingrese un numero: ");
			numeroEntero = Integer.valueOf(entrada.readLine());
			
			
			
			eliminar_todas_ocurrencias(arrenteros, numeroEntero);
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
	public static void imprimir_arreglo_int(int [] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
		}
	}
	
	public static void eliminar_todas_ocurrencias(int [] arrenteros, int numeroEntero){
		int posicion;
		posicion = buscar_posicion_arreglo(arrenteros,numeroEntero);
		while((posicion >= 0)&&(posicion < MAX-1)){
			if(arrenteros[posicion]==numeroEntero){
				corrimiento_izquierda(arrenteros, posicion);
			}
			posicion++;
		}
	}
	public static int buscar_posicion_arreglo(int [] arrenteros, int numeroEntero){
		int posicion = 0;
		while((posicion < MAX)&& (posicion != numeroEntero)){
			posicion ++;
		}
		return posicion;
	}
	public static void corrimiento_izquierda(int [] arrenteros, int posicion){
		int pos = posicion;
		while(pos < MAX-1){
			arrenteros[pos] = arrenteros[pos+1];
			pos++;
		}
	}
}
