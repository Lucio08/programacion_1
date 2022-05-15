import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4_practico3 {
	/*
	 * Escribir un programa que ingrese un número entero por teclado e imprima
	 * 
	 * el resultado de determinar: _ es múltiplo de 6 y de 7, 
	 * 
	 * _ es mayor a 30 y múltiplo de 2, o es menor igual a 30, 
	 * 
	 * _ el cociente de la división de* dicho número con 5 es mayor a 10.
	 */
	public static void main(String[] args) {
		int numero;
		boolean resultado;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Ingrese un numero entero: ");

			numero = Integer.valueOf(entrada.readLine());
			// % se usa cuando se hace un cociente y se necesita el resto
			resultado = (((numero%6)==0)&&((numero%7)==0));
			
			System.out.println("El numero es multiplo de 6 y 7: " + resultado);
			
			//resultado = ( ((numero > 30) && ((numero%2)==0)) || (numero<=30) ) ; 
			System.out.println("El numero es mayor a 30 y multiplo de 2: " + ( ((numero > 30) && ((numero%2)==0))  + " \to menor igual que 30: " + (numero<=30)) );
			// el simbolo / se utiliza cuando se hace un cociente para comparar;
			resultado = ((numero/5)>10);
			
			System.out.println("El cociente de " + numero + " divido 5 es mayor a 10: " + resultado);
			
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
