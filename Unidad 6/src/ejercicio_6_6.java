/*Escribir un programa que mientras que el usuario ingrese un n�mero entero
natural, llame a un m�todo que calcule la sumatoria entre 1 y dicho
numero y se lo retorne*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_6_6 {
	public static void main(String[] args) {
		int numero;
		int resultado;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());

			while(numero >= 0 && numero <= 9){
				resultado = sumatoria_numero(numero);
				System.out.println("El resultado es: " + resultado);
				
				System.out.println("Ingrese un numero mayor a 9 para salir");
				numero = Integer.valueOf(entrada.readLine());
			}

		}catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static int sumatoria_numero(int numeroGeneral){

		int resultado = numeroGeneral+1;
		
		return resultado;
	}
	
}
