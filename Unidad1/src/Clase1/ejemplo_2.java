package Clase1;

//importar librerias de operacion entrada/salida
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo_2 {
	public static void main(String[] args) {
		// declaro la variable donde quiero cargar el valor ingresado
		int numero;
		try {
			// try define un bloque {...} para capturar posibles errores o
			// excepciones
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			// imprimo por consola un mensaje que indique al usuario el valor a
			// ingresar
			System.out.println("Ingrese un numero numero: ");
			/*
			 * cuando se ejecuta Integer.valueOf(entrada.readLine()) sobre la
			 * pantalla de la consola aparece un cursor en espera de que el
			 * usuario ingrese un dato. Una vez que lo tipea y aprieta enter el
			 * valor ingresado se convierte a un valor numero
			 */
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("El numero ingresado es: " + numero);

		}

		catch (Exception exc) {
			// catch define un bloque {...} que se ejecuta solo cuando ocurre un
			// error en el bloque del try
			// exc es una variable de tipo Exception (tipo predefinido de java)
			// cuyo valor es el tipo de error
			
			//imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
			System.out.println(exc);
		}
	}

}
