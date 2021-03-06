/*Escribir un programa que mientras que el usuario ingrese un caracter letra
min?scula, pida:

ingresar un numero entero. Si el n?mero ingresado est?
entre 1 y 5 inclusive

deber? imprimir la tabla de multiplicar de dicho
numero.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8_5 {	
	public static void main(String[] args)
	{
		//Constantes
		final int MAXMULTIPLICADOR = 10;
		final int MAX = 100;
		final int MIN = 1;
		
		int numero;
		char caracter;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			while((caracter >= 'a') && (caracter <= 'z')){
				System.out.println("El caracter ingresado es: " + caracter);
				
				System.out.println("Ingrese un numero entero: ");
				numero = Integer.valueOf(entrada.readLine());
				
				if((numero >= MIN) &&(numero <= MAX)){
					for(int multiplicador = 1; 	multiplicador <= MAXMULTIPLICADOR; multiplicador++){
						System.out.println(multiplicador + " * " + numero + " = " + (multiplicador * numero));
					}
				}else{
					System.out.println("El numero ingresado es mayor al " + MAX);
				}
				System.out.println("Ingrese el caracter ' * ' para poder salir ");
				caracter = entrada.readLine().charAt(0);
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
