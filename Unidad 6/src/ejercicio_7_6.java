/*Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de d?as del
mes ingresado (suponer febrero de 28 d?as) (?mostrar por pantalla la
cantidad de d?as del mes deber?a realizarse con un m?todo? Deber?a).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_7_6 {

	public static void main(String[] args) {
		int numeroMes;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero de mes: ");
			numeroMes = Integer.valueOf(entrada.readLine());
			 while(numeroMes >= 1 && numeroMes <= 12){
				 numero_mes(numeroMes);
				 System.out.println("Ingrese un 0 para salir ");
				 numeroMes = Integer.valueOf(entrada.readLine());
			 }
			
		}catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void numero_mes(int numero){
		switch(numero){
		//Enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 d?as.
		case 1:case 3:case 5: case 7: case 8: case 10: case 12: {
			System.out.println("El mes " + numero + " tiene 31 dias");
			break;
		}
		//Tienen 30 d?as: Abril, junio, septiembre y noviembre.
		case 4: case 6: case 9: case 11:{
			System.out.println("El mes " + numero + "tiene 30 dias");
			break;
		}
		case 2:{
				System.out.println("El mes " + numero + "tiene 28 dias");
				break;
			}
		default:{
			System.out.println("No es numero de mes");
		}
			
		}
	
	}

}
