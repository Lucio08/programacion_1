/*7*Escribir un programa que mientras que el usuario ingrese un caracter d?gito
o caracter letra min?scula, imprima si es caracter d?gito o caracter letra
min?scula, y si es letra min?scula imprimir si es vocal o consonante.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4_5 {
	public static void main(String[] args) {
		char caracter;
		//char salida;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			while( ((caracter >= 'a')&&(caracter <= 'z')) || ((caracter >= '0')&&(caracter <= '9')) ){
				if((caracter >= '0')&&(caracter <= '9')){
					System.out.println("El caracter ingresado es digito ");
					
				}else{
					switch(caracter){
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
						System.out.println("El caracter es consonante ");
						break;
					}
					}
				}
				System.out.println("Ingrese otro tipo de caracter que no esten mencionados anteriormente para salir. ");
				caracter = entrada.readLine().charAt(0);
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}
