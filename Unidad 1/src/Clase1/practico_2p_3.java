package Clase1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*\b Retroceso o backspace
\t Tabulación
\n Nueva línea (enter)
\f Salto de página 
		System.out.println ("Hola Mundo. Estoy programando.");
		System.out.println ("Hola Mundo. \nEstoy programando.");
		System.out.println ("Hola Mundo. \n\tEstoy programando.");
		System.out.println ("Hola Mundo. \n\t\tEstoy programando.");*/

/*Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
salida debe imprimir por pantalla la factura en un formato similar al siguiente
(utilizar literales):*/
public class practico_2p_3 {

	public static void main(String[] args) {
		String factura;
		int numero;
		String nombre;
		String producto1;
		double importe;
		String producto2;
		double importe2;
		double importeTotal;
		
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese el tipo de factura: ");
			factura = entrada.readLine();
			
			System.out.println("Ingrese el numero de factura: ");
			numero = Integer.valueOf(entrada.readLine());
			
		System.out.println("Ingrese el nombre: ");
			nombre = entrada.readLine();
		
			System.out.println("Ingrese el producto: ");
			producto1 = entrada.readLine();
			
			System.out.println("Ingrese el importe: ");
			importe = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese el producto2: ");
			producto2 = entrada.readLine();

		
			System.out.println("Ingrese el importe2: ");
			importe2 = Double.valueOf(entrada.readLine());
			
			
			importeTotal = importe + importe2;

			System.out.println("Factura: " + factura  + " \tNumero: " + numero + " \tNombre: " + nombre + " \nProducto 1: " + producto1 + " \tImporte: "+ importe  + " \nProducto 2: " + producto2 
					 + " \tImporte 2: " + importe2 + " \nImporte Total: " + importeTotal);
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}
