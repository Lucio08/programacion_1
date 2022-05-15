/*Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un día, un número de mes, y un año; luego calcule la cantidad
de días desde la última luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha (ver cálculo en ejercicios
resueltos p4e4.xlsx).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4_2parte_4 {	
	public static void main(String[] args) {
		final int ciclo = 19;
		int dia, mes, anio,numeroAureo, epacta, edadLunar;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un dia: ");
			dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un numero de mes: ");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un anio: ");
			anio = Integer.valueOf(entrada.readLine());
			
			numeroAureo = ((anio + 1)%ciclo);
			epacta = (((numeroAureo - 11)*11)%30);
			
			
			if((mes >= 3)&&(mes <= 12)){
				edadLunar = epacta + (mes-3)+1 + dia;
			}else{
				edadLunar = 10 + mes + dia;
			}
			
			if(edadLunar > 29 ){
				edadLunar = edadLunar % 30;
			}
			System.out.println("El " + dia +" del " + mes + " del " + anio + " habran pasado " + edadLunar + " dias desde la ultima luna nueva ");
			
		}catch(Exception exc){
			System.out.println(exc);
		}

	}

}
