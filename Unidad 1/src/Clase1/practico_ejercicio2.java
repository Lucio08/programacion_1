package Clase1;

public class practico_ejercicio2 {
	/*Escribir un programa que declare tres variables de tipo double y
	una constante de tipo double con valor 1.0 . Luego deberá
	asignar el valor de la constante a una de la variables declaradas,
	
	y posteriormente sobre las dos restantes variables se le deberá
	asignar el valor de la variable que inicialmente fue seteada con el
	valor de la constante. Finalmente imprima por pantalla cada una
	de las variables.*/
	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		
		final double constante;
		
		constante = 1.0;
		n3 = constante; 
		n1 = n3;
		n2 = n3;
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(constante);
		System.out.println(n3);
		
	}

}
