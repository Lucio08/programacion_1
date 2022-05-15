/*Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_10_6 {

	public static void main(String[] args) {
		final int MAX = 10;
		final int MIN = 1;
		int numero;
		char caracter;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			while (numero > MIN && numero < MAX) {
				System.out.println("Ingrese un caracter: ");
				caracter = entrada.readLine().charAt(0);
				caracter_general(caracter);
				//caracter_digito(caracter);
				
				System.out.println("Aprete 0 para salir");
				numero = Integer.valueOf(entrada.readLine());
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}

	public static void caracter_general(char caracterGeneral) {
		if (caracterGeneral >= 'a' && caracterGeneral <= 'b') {
			System.out
					.println("el caracter es una letra del abecedario en minúscula ");
		} else if ((caracterGeneral >= 'A' && caracterGeneral <= 'B')) {
			System.out
					.println("el caracter es una letra del abecedario en mayuscula ");
		} else if (caracterGeneral >= '0' && caracterGeneral <= '9') {
			System.out.println("el caracter es un digito ");
		} else {
			System.out.println("Es otro caracter");
		}

}
}