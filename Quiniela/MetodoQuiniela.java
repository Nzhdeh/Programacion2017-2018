/**
 * 
 * 
 * 
 * 
 */

public class MetodoQuiniela
{
	/*
	Interfaz
	
	prototipo: public static void GeneraTabla(int columna)
	comentario: sirve para generar automaticamente la tabla 
	precondiciones: la columna tiene que ser mayor que cero
	entradas: int columna
	salidas: No hay
	entr/sal: no hay
	postcondiciones: No hay,solo pinta la tabla de la quiniela
	*/
	/*
	//resguardo
	public static void GeneraTabla(int columna)
	{
		System.out.println("En construccion");
	}*/
	
	public static void GeneraTabla(int columna)
	{
		int generaColumna=0;
		int contUno=0;
		int contX=0;
		int contDos=0;
		
		System.out.println("1 x 2");
		System.out.println("-----");
		
		for(int cont=0;cont<columna;cont++)
		{
			generaColumna=(int) Math.floor(Math.random()*100+1);
			
			if(generaColumna>50 && generaColumna<101)
			{
				System.out.println("1");
				contUno++;
			}
			else if(generaColumna>20 && generaColumna<=50)
			{
				System.out.println("  x");
				contX++;
			}
			else if(generaColumna>0 && generaColumna<=20)
			{
				System.out.println("    2");
				contDos++;
			}
	
		}
		System.out.println("El 1 ha salido "+contUno+" veces");
		System.out.println("La x ha salido "+contX+" veces");
		System.out.println("El 2 ha salido "+contDos+" veces");
	}

}
