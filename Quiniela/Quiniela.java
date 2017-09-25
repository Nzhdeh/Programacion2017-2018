/**Nombre del programa: Quiniela
 * 
 * analisis: Generar aleatoriamente una quiniela de n columnas. Supóngase que las probabilidades son:
 * 											50% para que salga 1
 * 											30% para que salga x
 * 											20% para que salga 2
 * 
 * entradas: int columna, char seguir
 * salidas: la tabla de la quinela 
 * 
 * PG
 * 		inicio
 * 			preguntar si el usuario quiere generar una quiniela y leer y validar seguir
 * 			mientras(seguir=='S')
 * 				leer y validar la columna
 * 				pintar la tabla de la quiniela
 * 				volver a preguntar si el usuario quiere generar una quiniela y leer y validar seguir
 * 			fin_mientas
 * 
 */
 
 import java.util.*;
 
 public class Quiniela
 {
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		//variables
		int columna=0;
		char seguir=' ';
		
		//preguntar si el usuario quiere generar una quiniela y leer y validar seguir
		do
		{
			System.out.print("Quieres generar una tabla de quiniela? s/n: ");
			seguir=Character.toUpperCase(sc.next().charAt(0));
		}while(seguir!='S' && seguir!='N');
		
		while(seguir=='S')
		{
			//leer y validar la columna
			do
			{
				System.out.print("Introduce la columna: ");
				columna=sc.nextInt();
			}while(columna<1);
			
			//pintar la tabla de la quiniela
			MetodoQuiniela.GeneraTabla(columna);
			
			
			//volver a preguntar si el usuario quiere generar una quiniela y leer y validar seguir
			do
			{
				System.out.print("Quieres generar una tabla de quiniela? s/n: ");
				seguir=Character.toUpperCase(sc.next().charAt(0));
			}while(seguir!='S' && seguir!='N');
		}
	} 
 }
