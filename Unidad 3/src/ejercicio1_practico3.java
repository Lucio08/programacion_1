import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_practico3 {
	/*
	 * Escribir un programa que permita el ingreso de un número entero por
	 * teclado e imprima el cociente de la división de dicho número con 2, 3, y
	 * 4.
	 */
	public static void main(String[] args) {
		int numero;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			
			System.out.println("El cociente de la division sobre 2 es: " + numero/2);
			System.out.println("El cociente de la division sobre 3 es: " + numero/3);
			System.out.println("El cociente de la division sobre 4 es: " + numero/4);
		}catch(Exception exc){
			System.out.println(exc);
			
		}
		
	}
}
