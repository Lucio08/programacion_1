/*Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra min?scula, llame a un m?todo
que imprime por pantalla la tabla de multiplicar de 9.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_3_6 {
	//declarar variables y entrada
	//carga por teclado
	//mientras se carga una letra
		//llamar a un metodo que imprima la tabla del 9
	public static void main(String[] args) {
		char letra;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un caracter letra: ");
			letra = entrada.readLine().charAt(0);
			
			while(letra >= 'a' && letra <= 'z'){
				imprimir_tabla_9();
				
				System.out.println("Ingrese un caracter numero para salir");
				letra = entrada.readLine().charAt(0);
			}
		}catch(Exception exc){
			System.out.println(exc);
		}

	}
	public static void imprimir_tabla_9(){
		final int MAXMULTIPLICADOR = 10;
		final int MIN = 0;
		int numero;
		numero = 9;
		for(int multiplicador = MIN; multiplicador < MAXMULTIPLICADOR ; multiplicador++){
			System.out.println(multiplicador * numero);
		}
	}
}
