/*Hacer un programa que solicite la carga desde consola de
un carácter y realice: imprima si es dígito, o letra minúscula, o
es cualquier otro carácter. Si es letra minúscula indicar si es
vocal o consonante.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2_2parte_4 {
	public static void main(String[] args) {
		char caracter;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter: ");	
			caracter = entrada.readLine().charAt(0);
			
			if((caracter >= '0') && (caracter <= '9')){
				System.out.println("El caracter es digito");	
				
			}else if((caracter >= 'a') && (caracter <= 'z')){
				System.out.println("Es una letra minuscula");
				switch (caracter) {
				case 'a':
					System.out.println("Es vocal");
					break;
				case 'e':
					System.out.println("Es vocal");
					break;
				case 'i':
					System.out.println("Es vocal");
					break;
				case 'o':
					System.out.println("Es vocal");
					break;
				case 'u':
					System.out.println("Es vocal");
					break;
				default: {
					System.out.println("Es consonante");
				}
				}
				
			}else{
				System.out.println("Es otro caracter");
			}
				
			
		
			
		}catch(Exception exc){
			System.out.println(exc);
		}

	}

}
