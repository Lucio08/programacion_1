/* Similar a Clase_6_Ejemplo_3. Escribir un programa que llame un m?todo que calcule el promedio de la suma
de valores enteres entre 1 y 1000. Finalmente, el promedio debe mostrarse por pantalla.
*/
public class ejemplo_5 {
	
	public static final int MAX = 1000;
	public static final int MIN = 1;
	
	public static void main(String[] args) {
		int promedio;
		
		promedio = calcular_promedio_suma();
		
		System.out.println("El promedio de la suma es: " + promedio);
	}
	public static int calcular_promedio_suma(){
		int promedio;
		int suma = 0;
		
		for ( int numero = MIN; numero <= MAX; numero++){
			suma += numero;
		}
		promedio = (suma/MAX - MIN + 1);
		return promedio;
	}
}
