/*Escribir un programa que mientras el usuario ingrese un n�mero entero
menor que 10 y mayor a 1, muestre por pantalla si el n�mero es m�ltiplo de
2 y m�ltiplo de 3 simult�neamente. (�Los valores mencionados en el
enunciado deber�an ser constantes?. De a poco habr�a que definirlos
como constantes).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_5 {
	public static void main(String[] args) {
		
		final int MAX = 20;
		final int MIN = 1;
		int numero;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{		
			System.out.println("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>MIN)&&(numero<MAX)) {
				if ((numero%2==0)&&(numero%3==0)) {
					System.out.println("El numero es multiplo de 2 y 3");
				}
				else{
					System.out.println("No es multiplo de 2 y 3");
				}
				
				System.out.println("Ingrese un 0 para salir ");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		
		}catch(Exception exc){
			System.out.println(exc);
		}
		

	}

}
