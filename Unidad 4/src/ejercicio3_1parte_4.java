import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que ingrese un n�mero entero por teclado y
 realice:
 _ imprima es m�ltiplo de 6 y de 7 si cumple con esa condici�n,
 _ o imprima es mayor a 30 y m�ltiplo de 2 si cumple con esa
 condici�n,
 _ imprima si el cociente de la divisi�n de dicho n�mero con 5 es
 mayor a 10 sin importar las condiciones previas.*/
public class ejercicio3_1parte_4 {
	public static void main(String[] args) {
		int num;
		boolean resultado;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Ingrese un numero: ");
			num = Integer.valueOf(entrada.readLine());
			
			resultado = ((num % 6) == 0) && ((num % 7) == 0);
			if (((num % 6) == 0) && ((num % 7) == 0)) {
				System.out.println("Es multiplo de 6 y 7 wss" + resultado);

			} else{
				resultado=((num > 30) && ((num % 2) == 0));
				System.out.println("El numero es mayor a 30 y multiplo de 2 " +  resultado);

			}
			
			resultado = (num / 5) > 10;
			System.out.println("El cociente de dicho numero con cinco es mayor a 10 " + resultado);
				
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
