/*Hacer un programa que dado un arreglo de enteros de tama?o 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posici?n
0). Para ello tendr? que realizar un corrimiento a derecha (se pierde el ?ltimo valor del arreglo) y
colocar el numero en el arreglo en la posici?n indicada.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_4_7 {
	public static final int MAX = 10;
	public static final int MINVALOR = 0;
	public static final int MAXVALOR = 10;
	
	public static void main(String[] args) {
		int [] arrenteros = new int [MAX];
		int numeroEntero;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try{
			cargar_arreglo(arrenteros);
			imprimir_arreglo(arrenteros);
			System.out.println("Ingrerse un numero entero: ");
			numeroEntero = Integer.valueOf(entrada.readLine());
			agregar_numero_principio(arrenteros, numeroEntero);
			imprimir_arreglo(arrenteros);
		}catch(Exception exc){
			System.out.println(exc);
		}

	}
	public static void cargar_arreglo(int [] arrenteros){
		Random r = new Random();
		for(int pos = 0; pos < MAX; pos ++){
			arrenteros[pos]= (r.nextInt(MAXVALOR-MINVALOR+1)+ MINVALOR);
		}
	}
	public static void imprimir_arreglo(int [] arrenteros){
		for(int pos = 0; pos < MAX; pos++){
			System.out.println("Arrenteros: ["+pos+"]=>: " + arrenteros[pos] );
		}
	}
	public static void agregar_numero_principio(int [] arrenteros, int numeroEntero){
		
		int valorFinal = MAX-1;
			while(valorFinal>0){
				arrenteros[valorFinal]=arrenteros[valorFinal-1];
				valorFinal--;
			}
			arrenteros[0]=numeroEntero;	
		}
	}
	

