import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3_practico3 {
	/*Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima el resultado de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2.*/

	public static void main(String[] args) {
		int num1, num2;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el primer numero entero: ");
			num1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el segundo numero entero: ");
			num2 = Integer.valueOf(entrada.readLine());
			
			System.out.println("El primero es mayor que el segundo: " + (num1>num2));
			System.out.println("Ambos numeros son multiplo de 2: " + (((num1%2)==0)&&((num2%2)==0)));
			
			
		}catch(Exception exc){
			System.out.println(exc);
		}
		
	}

}
