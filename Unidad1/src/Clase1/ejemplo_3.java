package Clase1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo_3 {
	public static void main(String[] arr) {
		int entero;
		double doble;
		float flotante;
		char caracter;
		String texto;	

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
//			Ingresar un entero;
			System.out.println("Ingrese un numero:");
			entero = Integer.valueOf(entrada.readLine());
			
//			Ingresar un double;
			System.out.println("Ingrese un double: ");
			doble = Double.valueOf(entrada.readLine());
			
//			Ingresar un float;
			System.out.println("Ingrese un float:");
			flotante = Float.valueOf(entrada.readLine());	
			
//			Ingresar un caracter;
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
//			Ingresar un texto;
			System.out.println("Ingrese un texto: ");
			texto = entrada.readLine();
			
			//Imprimir por consola los datos;
			System.out.println(entero);
			System.out.println(doble);
			System.out.println(flotante);
			System.out.println(caracter);
			System.out.println(texto);
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
}
