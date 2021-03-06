/*Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un m?todo
que calcula la sumatoria de los primeros 200 n?meros
naturales (son n?meros enteros en 1 y 200).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_4_6 {
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			 
			while(numero != 0){
				imprimir_suma_primeros_200();
				
				System.out.println("Ingrese 0 para salir");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_suma_primeros_200(){
		final int MAX = 200;
		final int MIN = 1;
		int sumatoria = 0;
		
		for(int numero = MIN; numero<=MAX; numero++){
			sumatoria+= numero;
		}
		System.out.println("La suma es " + sumatoria);
	}

}
