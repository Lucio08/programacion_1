/*Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, se quede con la menor y la mayor letra ingresada. Finalmente
muestre por pantalla dichas letras.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio7_5 {
	public static void main(String[] args) {
		final char	MIN = 'a';
		final char	MAX = 'z';
		char caracter, menor, mayor;
		menor = MAX;
		mayor = MIN;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while((caracter >= MIN)&&(caracter <= MAX)){
				if(caracter < menor){
					menor = caracter;
				}else if(caracter > mayor){
					mayor = caracter;
				}
				
				System.out.println("Aprete un numero para salir. ");
				caracter = entrada.readLine().charAt(0);
			}
			System.out.println("Las letras ingresadas mayor y menor son: " + menor + " y " + mayor );
			
		}catch(Exception exc){ 
			System.out.println(exc);
		}
	}

}
