/*Realizar un programa que dado dos n?meros enteros y un
car?cter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operaci?n matem?tica b?sica
considerando el valor del car?cter. Si ingreso el caracter:
? ?a? la suma, ?b? la resta, ?c? la multiplicaci?n y ?d? la divisi?n
entre ambos n?meros.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9_6 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		char letra;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Ingrese un numero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero: ");
			numero2 = Integer.valueOf(entrada.readLine());

			
			System.out.println("Ingrese una letra");
			letra = entrada.readLine().charAt(0);

			operaciones_letra(numero1, numero2, letra);

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static void operaciones_letra(int numero1, int numero2, char letra) {
		int resultado;
		switch (letra) {
		case 'a': {
			System.out.println("La operacion ingresada es la suma ");
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es " + numero1 + " + "
					+ numero2 + " = " + resultado);
			break;
		}
		case 'b': {
			System.out.println("La operacion ingresada es la resta ");
			resultado = numero1 - numero2;
			System.out.println("El resultado de la resta es " + numero1 + " - "
					+ numero2 + " = " + resultado);
			break;
		}
		case 'c': {
			System.out.println("La operacion ingresada es la multiplicacion ");
			resultado = numero1 * numero2;
			System.out.println("El resultado de la multiplicacion  es "
					+ numero1 + " * " + numero2 +  " = " + resultado);
			break;
		}
		case 'd': {
			if(numero2 == 0){
				System.out.println("No se puede dividir por 0 ");
			}
			System.out.println("La operacion ingresada es la division ");
			resultado = numero1 / numero2;
			
			System.out.println("El resultado de la multiplicacion  es "
					+ numero1 + " / " + numero2 + " = " + resultado);
			break;
		}
		default: {
			System.out.println("La letra no corresponde a operaciones ");
		}
		}
	}
}
