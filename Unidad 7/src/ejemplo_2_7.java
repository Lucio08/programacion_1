/*Hacer un programa que cargue en un arreglo de enteros 5 valores desde teclado y lo imprima.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo_2_7 {
	public static int MAX = 5;
	public static void main(String[] args) {
		//declaro arreglo
		int [] arrenteros = new int [MAX];
		//metodos de carga y impresion
		cargar_arreglo_int(arrenteros);
		imprimir_arreglo(arrenteros);
	}
	
	public static void cargar_arreglo_int(int [] arr){
		BufferedReader entrada = new BufferedReader( new  InputStreamReader(System.in));
		try{	
			//cargar arreglo con for
			for(int pos = 0; pos<MAX; pos++){
				System.out.println("Ingrese un entero: ");
				arr[pos] = Integer.valueOf(entrada.readLine());
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_arreglo(int []arr){
		for( int pos = 0; pos < MAX; pos++){
			System.out.println("arrenteros ["+pos+"]=>: " + arr[pos]);
		}
	}
}
