/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejemplo_3_7 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		//definir arreglo
		int [] arrenteros = new int [MAX];
		int numero, pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			cargar_arreglo_aleatorio_int(arrenteros);
			imprimir_arreglo(arrenteros);
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			pos = cargar_pos(arrenteros, numero);
			
			if(pos < MAX){
				System.out.println(numero + " esta en " + pos);
			}else{
				System.out.println(" no exite " + numero);
			}
			
		}catch(Exception exc){
	}

}
	public static void cargar_arreglo_aleatorio_int(int [] arrenteros){
		Random r = new Random();
		for(int pos = 0; pos<MAX;pos++){
			arrenteros[pos]=(r.nextInt(MAXVALOR-MINVALOR + 1) + MINVALOR);
		}
	}
	public static int cargar_pos(int [] arrenteros, int numero){
		int pos = 0;
		while((pos < MAX) && (arrenteros[pos] != numero)){
			pos++;
			
		}
		return pos;
	}
	public static void imprimir_arreglo(int [] arrenteros){
		for(int pos = 0;pos < MAX;pos ++){
			System.out.println("arrenteros["+pos+"] => : " + arrenteros[pos]);
		}
	}
}
