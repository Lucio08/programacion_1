/*Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10 realice:
Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter
ingresado imprima a que tipo de carácter esta asociado:
"letra minúscula" si el caracter es una letra del abecedario en minúscula;
• "letra mayúscula" si el caracter es una letra del abecedario en mayúscula;
"dígito" si el caracter corresponde a un carácter número;
• "otro" para los restantes casos de caracteres.


Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_11_6 {
	public static void main(String[] args) {
		int numero;
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un  numero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			while(numero > 1 && numero < 10){
				if((numero % 3 )== 0){
					//metodo caracter
					System.out.println("Ingrese un caracter: ");
					caracter = entrada.readLine().charAt(0);
					metodo_caracter_general(caracter);
				}else if((numero % 5) == 0){
					metodo_tabla_numero(numero);
				}
				System.out.println("Ingrese un 0 para salir ");
				numero = Integer.valueOf(entrada.readLine());
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
		
		
	}

	public static void metodo_caracter_general(char caracter) {
		if ((caracter >= 'a') && (caracter <= 'z')) {
			System.out.println("El caracter es minuscula ");

		} else if ((caracter >= 'A') && (caracter <= 'Z')) {
			System.out.println("El caracter es mayuscula ");
		} else if ((caracter >= '0') && (caracter <= '9')) {
			System.out.println("El caracter es digito ");

		} else {
			System.out.println("Es otro caracter");
		}

}
	public static void metodo_tabla_numero(int numeroGeneral){
		int max = 10;
		int min = 0;
		
		
		for(int multiplicador = min ; multiplicador <= max; multiplicador ++){
			System.out.println(numeroGeneral +  " * " +  multiplicador +  " = " + (numeroGeneral * multiplicador) );
		}
	}
}