/*Hacer un programa que dado un arreglo de enteros de tama�o 10 que se encuentra
precargado, obtenga la cantidad de n�meros pares que tiene y la imprima.*/
import java.util.Random;
public class ejercicio_2_7 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 0;
	public static void main(String[] args) {
		int [] arr = new int [MAX];	
		
		carga_aleatoria_arreglo(arr);
		imprimir_arreglo(arr);
		obtener_numeros_pares(arr);
		
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
	public static void obtener_numeros_pares(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			if( arr[pos]% 2 == 0){
				System.out.println("La cantidad de numeros pares es: " + pos);
			}
		}
		
	}
}