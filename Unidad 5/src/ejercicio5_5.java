/*Escribir un programa que mientras que el usuario ingrese un n?mero entero
entre 1 y 10 inclusive, lleve la suma de los n?meros ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5_5 {

	public static void main(String[] args) {
		int numero, suma;
		suma = 0;
		BufferedReader entrada =  new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero entero: "); 
			numero = Integer.valueOf(entrada.readLine()); 
			while((numero>=1) && (numero<=10)){
				suma+=numero;
				
				System.out.println("Ingrese otro numero mayor a 10 si quiere salir ");
				numero = Integer.valueOf(entrada.readLine()); 
			}
			System.out.println("La suma final de los numeros es " + suma);
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}
