/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ?*?, invoque a un m?todo que imprima si es caracter d?gito o
caracter letra min?scula, y si es letra min?scula imprimir si es vocal o
consonante.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_5_6 {
	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese un caracter: " );
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				imprimir_caracter_tipo(caracter);
				System.out.println("Ingrese el caracter '*' para salir ");
				caracter = entrada.readLine().charAt(0);
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void imprimir_caracter_tipo(char caracterGeneral) {
		if ((caracterGeneral >= '0') && (caracterGeneral <= '9')) {
			System.out.println("El caracter es digito ");
		} else {
			switch (caracterGeneral) {
			case 'a': {
				System.out.println("Es vocal ");
				break;
			}
			case 'e': {
				System.out.println("Es vocal ");
				break;
			}
			case 'i': {
				System.out.println("Es vocal ");
				break;
			}
			case 'o': {
				System.out.println("Es vocal ");
				break;
			}
			case 'u': {
				System.out.println("Es vocal ");
				break;
			}
			default: {
				System.out.println("Es consonante ");
				break;
			}
			}

		}
	}

}
