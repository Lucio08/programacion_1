/*Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6_5 {
	public static void main(String[] args) {
		char letra;
		int acumuladorVocal;
		
		acumuladorVocal = 0;

		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese una letra: ");
			letra = entrada.readLine().charAt(0);

			while ((letra >= 'a') && (letra <= 'z')) {
				
				switch (letra) {
				case 'a': {
					System.out.println("Es vocal ");
					acumuladorVocal++;
					break;
				}
				case 'e': {
					System.out.println("Es vocal ");
					acumuladorVocal++;
					break;

				}
				case 'i': {
					System.out.println("Es vocal ");
					acumuladorVocal++;
					break;

				}
				case 'o': {
					System.out.println("Es vocal ");
					acumuladorVocal++;
					break;

				}
				case 'u': {
					System.out.println("Es vocal ");
					acumuladorVocal++;
					break;

				}
				default: {
					System.out.println("No es vocal ");
					break;

				}

				}
				System.out.println("Aprete caracter especial o numero para poder salir ");
				letra = entrada.readLine().charAt(0);

			}
				System.out.println("La acumulacion final de vocales es: "
					+ acumuladorVocal + " veces ");
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
