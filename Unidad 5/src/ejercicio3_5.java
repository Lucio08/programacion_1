/*Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3_5 {
	public static void main(String[] args) {
		int numero;
		//int num2;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			
			System.out.println("Ingrese un numero distinto de 0: ");
			numero = Integer.valueOf(entrada.readLine()); 
			while(numero != 0){
				
				System.out.println("Ingrese otro numero por favor: ");
				numero = Integer.valueOf(entrada.readLine());
				
				System.out.println("El numero ingresado anteriormente es: " + numero);
				
				System.out.println("Pulse 0 para terminar.");
				numero = Integer.valueOf(entrada.readLine());
			}
			
			
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}
