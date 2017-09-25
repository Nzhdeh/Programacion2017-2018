/**Nombre del Programa: Imc
 * 
 * analisis: Diseñar un algoritmo para calcular el índice de masa corporal (IMC).
 * 
 * entradas: double peso, double altura, char quiere
 * salida: double imc
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * 		inicio
 * 			preguntar si el usuario quiere calcular el imc
 * 			si quiere
 * 				leer el peso y la altura
 * 				calcular y mostrar el imc
 * 			fin_si
 * 
 * MODULO 1
 * 
 * 	//preguntar si el usuario quiere calcular el imc
 * 	pintar(Quieres calcular el imc? s/n: )
 * 	leer(quiere)
 * 
 * 	MODULO 2
 * 
 *  //introducir el peso y la altura
 * 	pintar(Introduce el peso en kilos: )
 *  leer (peso)
 * 	
 * 	pintar(Introduce la altura en metros: )
 * 	leer (altura)
 * 
 * 	MODULO 3
 * 
 * 	//calcular mostrar el imc
 * 	
 * 	imc=peso/(altura*altura)
 * 	si(peso<1)
 * 		pintar(el peso no puede ser cero)
 * 	fin si
 * 	sino si(imc<18.5)
 * 		pintar("Tu IMC es "+imc)
 * 		pintar(Peso inferior al normal)
 * 	fin_sino_si
 * 	sino si(imc>=18.5 && imc<25)
 * 		pintar("Tu IMC es "+imc)
 * 		pintar(Peso normal)
 * 	fin_sino_si
 * 	sino si(imc>=25 && imc<30)
 * 		pintar("Tu IMC es "+imc)
 * 		pintar(Peso superior al normal)
 * 	fin_sino_si
 * 	sino
 * 		pintar("Tu IMC es "+imc)
 * 		pintar(Obesidad)
 * 	fin_sino
 */
 import java.util.Scanner;
 
 public class Imc
 {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//variables
		double peso=0.0;
		double altura=0.0;
		double imc=0.0;
		char quiere=' ';
		
		
		//preguntar si el usuario quiere calcular el imc
		System.out.println("Quieres calcular el imc? s/n: ");
		quiere=Character.toUpperCase(sc.next().charAt(0));
		
		if(quiere=='S')
		{
			//introducir el peso y la altura
			System.out.println("Introduce el peso en kilos: ");
			peso=sc.nextDouble();
			
			System.out.println("Introduce la altura en metros: ");
			altura=sc.nextDouble();
			
			imc=peso/(altura*altura);
			
			if(peso<1)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Tu IMC es "+imc);
				System.out.println("El peso no puede ser cero");
				System.out.println("---------------------------------------------");
			}
			else if(imc<18.5)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Tu IMC es "+imc);
				System.out.println("Peso inferior al normal");
				System.out.println("Recuerda que esto no es una prueba medica");
				System.out.println("---------------------------------------------");
			}
			else if(imc>=18.5 && imc<25)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Tu IMC es "+imc);
				System.out.println("Peso normal");
				System.out.println("Recuerda que esto no es una prueba medica");
				System.out.println("---------------------------------------------");
			}
			else if(imc>=25 && imc<30)
			{
				System.out.println("---------------------------------------------");
				System.out.println("Tu IMC es "+imc);
				System.out.println("Peso superior al normal");
				System.out.println("Recuerda que esto no es una prueba medica");
				System.out.println("---------------------------------------------");
			}
			else
			{
				System.out.println("---------------------------------------------");
				System.out.println("Obesidad");
				System.out.println("Recuerda que esto no es una prueba medica");
				System.out.println("---------------------------------------------");
			}
		}
		
	} 
 }
