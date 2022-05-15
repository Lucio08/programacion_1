
public class ejercicio2_practico3 {
	/*Escribir un programa que imprima por pantalla la tabla de valores
de verdad para el or y and por separado.*/
	public static void main(String[] args) {
		boolean v;
		boolean f;
		
		v = true;
		f = false;
		
		System.out.println("Tabla de verdad or: " + "\n verdadero or verdadero: " + (v || v) + " \n verdadero or falso: " + (v||f) +
				"\n falso or verdadero: " + (f||v) + "\n falso or falso: " + (f||f));
		
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("Tabla de verdad and: " + "\n verdadero and verdadero: " + (v && v) + " \n verdadero and falso: " + (v&&f) +
				"\n falso and verdadero: " + (f&&v) + "\n falso and falso: " + (f && f));
	}


		
	
	}



