/*Hacer un programa que dado un arreglo de enteros de tama?o 10 que se encuentra
precargado,

solicite al usuario un numero entero y 

elimine la primer ocurrencia de numero (un
n?mero igual) en el arreglo si existe.

Para ello tendr? que buscar la posici?n y si est?,

realizar un corrimiento a izquierda (queda una copia de la ?ltima posici?n del arreglo en la ante?ltima
posici?n).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_5_7 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
;
	//precargar arreglo
	//solicitar numero(Buffer etc)
	
	//Si existe el numero
		//eliminar la primera ocurrencia(numeros repetidos)
		//buscar pos
			//si esta la pos
					//corrimiento a izquierda
		
	
	public static void main(String[] args) {
		int [] arrenteros = new int [MAX];
		int numero;
		int pos;
		
		BufferedReader entrada = new BufferedReader ( new InputStreamReader(System.in));
		try{
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimir_arreglo_int(arrenteros);
			
			//Si el numero existe
			System.out.println("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
				//buscar posicion, si esta eliminar ocurrencia
			eliminar_ocurrencia( arrenteros, numero);
						//si la posicion est?, corrimieto de izquierda
			
					
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
	public static void eliminar_ocurrencia(int [] arrenteros, int numero){
		int pos;	
		pos = obtener_pos_arreglo(arrenteros, numero);
		if ((pos>=0)&&(pos<MAX)){
			corrimiento_Izq(arrenteros,pos);	
		}
	}
	public static int obtener_pos_arreglo(int [] arr, int numero){
		int posicion = 0;
		while ((posicion < MAX) && (arr[posicion] != numero)){
			posicion++;
		}
		return posicion;
	}
	
	public static void corrimiento_Izq(int[]arr,int posicion){
		int pos = posicion;
		while(pos < MAX-1){
			arr[pos] = arr[pos+1];
			pos++;
		}
	}

	
}
	
