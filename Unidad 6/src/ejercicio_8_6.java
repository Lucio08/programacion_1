/*Escribir un programa que mientras que el usuario ingrese un caracter letra
min?scula, pida ingresar un numero entero. Si el n?mero ingresado est?
entre 1 y 5 inclusive deber? imprimir la tabla de multiplicar de dicho
numero.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_8_6 {

	public static void main(String[] args) {
		char letra;
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try{
			System.out.println("Ingrese una letra: ");
			letra = entrada.readLine().charAt(0);
			
			 while(letra >= 'a' && letra <= 'z'){
				 System.out.println("Ingresar un numero entero: ");
				 numero = Integer.valueOf(entrada.readLine());
				 if(numero >= 1 && numero <= 5){
					 imprimir_tabla_multiplicar(numero);
				 }else{
					 System.out.println("El numero es mayor a 5 ");
				 }
				 System.out.println("Ingrese un A para salir ");
				 letra = entrada.readLine().charAt(0);
			 }
		}catch(Exception exc){
			System.out.println(exc);
		}
		

	}
	public static void imprimir_tabla_multiplicar(int numero){
		final int MAX = 10;
		final int MIN = 0;
		int multiplicador;
		for( multiplicador = MIN; multiplicador < MAX; multiplicador++){
			System.out.println(numero * multiplicador);
		}
	}

}
