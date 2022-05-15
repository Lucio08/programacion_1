/*Escribir un programa que permita el ingreso de dos números enteros
por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son múltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2_1parte_4 {
	public static void main(String[] args) {
		//Declaro los dos numeros que va a ingresar el usuario por consola
		int num1;
		int num2;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese el primer numero: ");
			num1 = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese el segundo numero: ");
			num2 = Integer.valueOf(entrada.readLine());

			// imprima A si el primero mayor al segundo
			if (num1 > num2) {
				System.out.println("A");
			}
			// imprima B si ambos son múltiplos de 2,
			else if (((num1 % 2) == 0) && ((num2 % 2) == 0)) {
				System.out.println("B");
			} else {
				System.out.println("No es ninguna de la dos opciones");
			}
			
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}
