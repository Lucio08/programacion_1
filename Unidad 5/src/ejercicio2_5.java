/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2_5 {
	public static void main(String[] args) {
		char caracter;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				if ((caracter >= '0') && (caracter <= '9')) {
					System.out.println("El caracter es digito");
				} else {
					switch (caracter) {
					case 'a':{
						System.out.println("Es vocal");
						break;
					}
					case 'e':{
						System.out.println("Es vocal");
						break;
					}
					case 'i':{
						System.out.println("Es vocal");
						break;
					}
					case 'o':{
						System.out.println("Es vocal");
						break;
					}
					case 'u':{
						System.out.println("Es vocal");
						break;
					}
					default:{
						System.out.println("Es consonante");
						break;
					}
					}
				}
				System.out
						.println(" ingrese * para poder salir");
				caracter = entrada.readLine().charAt(0);
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
