
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que permita el ingreso de un car�cter y realice:
_ imprima es car�cter d�gito si el car�cter ingresado es car�cter
d�gito,
_ o imprima no es car�cter d�gito*/

public class ejercicio1_1parte_4 {
	public static void main(String[] args) {
		//declaro caracter para luego ingresar por consola
		char caracter;	
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			
			//Si es caracter digito imprimir carac digito;
			if((caracter >= '0' ) && (caracter<='9')){
				System.out.println("Es caracter digito");
			}
			//Si no es caracter digito
			else{
				System.out.println("No es caracter digito");
			}
		}catch(Exception exc){
			System.out.println(exc);
		}
	}

}