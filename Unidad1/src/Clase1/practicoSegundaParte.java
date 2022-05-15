package Clase1;

/*1. Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practicoSegundaParte {
	public static void main(String[] args) {
		final double pi;
		double  area,diametro, radio, base, altura;

		pi = 3.14;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					System.in));
			// circulo
			System.out.println("Ingrese el radio: ");
			radio = Double.valueOf(entrada.readLine());
			diametro = radio * 2;
			area = pi * (radio * radio);
			System.out.println("El diametro del circulo es: " + diametro);
			System.out.println("El area del circulo es: " + area);

			// Triangulo
			System.out.println("Ingrese la base: ");
			base = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la altura");
			altura = Double.valueOf(entrada.readLine());
			area = base*altura/2;	
			System.out.println("La area del triangulo es: " + area);

		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
	