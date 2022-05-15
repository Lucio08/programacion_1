/*Hacer un programa que solicite la carga desde consola de un
numero entero y realice:

_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
es menor. Además deberá imprimir que el valor es positivo.

_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
ninguna de las opciones anteriores.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_2parte_4 {
	public static void main(String[] args) {
		// solicitar por consola numero entero
		int numero;

		try {
			// carga de numero
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());

			/*
			 * _si el numero es positivo, imprima “grande” si es mayor a 100 o
			 * “chico “ si es menor. Además deberá imprimir que el valor es
			 * positivo.
			 */
			if (numero > 100) {
				System.out.println("el numero es  grande");
				if (numero > 0) {
					System.out.println("el valor es positivo ");
				}
				/*
				 * _si no lo es, imprima si el numero es par, o si el numero es
				 * múltiplo de 3, o ninguna de las opciones anteriores.
				 */
				if ((numero % 2) == 0) {

					System.out.println("El numero es par");

				} else if ((numero % 3) == 0) {
					System.out.println("El numero es multiplo de 3");
				} else {
					System.out
							.println("No es ninguna de las opciones anteriores");
				}

			} else {
				System.out.println("es chico");
			}

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
