package Clase1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico_2p_2 {
	/*
	 * Escribir un programa que solicite los siguientes datos de una persona
	 * (nombre, apellido, edad, altura, ocupación, dirección) y los imprima por
	 * pantalla.
	 */
	public static void main(String[] args) {
		String nombre;
		String apellido;
		char inicial;
		int edad;
		double altura;
		String ocupacion;
		String direccion;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Ingrese su nombre: ");
			nombre = entrada.readLine();

			System.out.println("Ingrese su apellido: ");
			apellido = entrada.readLine();

			System.out.println("Ingrese la inicial de su nombre: ");
			inicial = entrada.readLine().charAt(0);

			System.out.println("Ingrese su edad:");
			edad = Integer.valueOf(entrada.readLine());

			System.out.println("Ingrese su altura:");
			altura = Double.valueOf(entrada.readLine());

			System.out.println("Ingrese su ocupacion:");
			ocupacion = entrada.readLine();

			System.out.println("Ingrese su direccion:");
			direccion = entrada.readLine();

			System.out.println(nombre);
			System.out.println(apellido);
			System.out.println(inicial);
			System.out.println(edad);
			System.out.println(altura);
			System.out.println(ocupacion);
			System.out.println(direccion);

		} catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
