package PokinoTest;

import Excepciones.ExcepcionTablero;
import PokinoClases.Baraja;
import PokinoClases.Tablero;
import PokinoClases.TipoPalo;

public class TestTablero 
{
	public static void main(String[] args) 
	{
		Baraja [][] tabla = new Baraja [5][5];
		
		tabla[0][0]=new Baraja("1 ",TipoPalo.O);
		tabla[0][1]=new Baraja("1 ",TipoPalo.B);
		tabla[0][2]=new Baraja("7 ",TipoPalo.O);
		tabla[0][3]=new Baraja("1 ",TipoPalo.E);
		tabla[0][4]=new Baraja("1 ",TipoPalo.B);
		
		tabla[0][0]=new Baraja("1 ",TipoPalo.O);
		tabla[0][1]=new Baraja("1 ",TipoPalo.B);
		tabla[0][2]=new Baraja("7 ",TipoPalo.O);
		tabla[0][3]=new Baraja("1 ",TipoPalo.E);
		tabla[0][4]=new Baraja("1 ",TipoPalo.B);
		
		tabla[0][0]=new Baraja("1 ",TipoPalo.O);
		tabla[0][1]=new Baraja("1 ",TipoPalo.B);
		tabla[0][2]=new Baraja("7 ",TipoPalo.O);
		tabla[0][3]=new Baraja("1 ",TipoPalo.E);
		tabla[0][4]=new Baraja("1 ",TipoPalo.B);
		
		tabla[0][0]=new Baraja("1 ",TipoPalo.O);
		tabla[0][1]=new Baraja("1 ",TipoPalo.B);
		tabla[0][2]=new Baraja("7 ",TipoPalo.O);
		tabla[0][3]=new Baraja("1 ",TipoPalo.E);
		tabla[0][4]=new Baraja("1 ",TipoPalo.B);
		
		tabla[0][0]=new Baraja("1 ",TipoPalo.O);
		tabla[0][1]=new Baraja("1 ",TipoPalo.B);
		tabla[0][2]=new Baraja("7 ",TipoPalo.O);
		tabla[0][3]=new Baraja("1 ",TipoPalo.E);
		tabla[0][4]=new Baraja("1 ",TipoPalo.B);
		
		Baraja b=new Baraja("2 ",TipoPalo.O);
		
		Tablero t1= new Tablero();
		Tablero t2=new Tablero();
		try 
		{
			t2 = new Tablero(tabla);
		} catch (ExcepcionTablero e) 
		{
			System.out.println(e);
		}
		Tablero t3= new Tablero();
		Tablero t4= new Tablero(t2);
		Tablero copia= null;
		
		
		System.out.println("Constructor por defecto: "+t1.toString());
		System.out.println("Constructor con parametros: "+t2.toString());
		System.out.println("Constructor de copia: "+t4.toString());
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(t4.getTabla());
		try 
		{
			t2.setTabla(tabla);
		} catch (ExcepcionTablero e) 
		{
			System.out.println(e);
		}
		System.out.println(t2.getTabla());
		//fin
		
		//prueba toString
		System.out.println("---------------------------------------------------");
		System.out.println("To string:");
		System.out.println(t2.toString());
		//fin
		
		//prueba clone
		System.out.println("---------------------------------------------------");
		System.out.println("Clone:");
		copia = t2.clone ();
		System.out.println(t2.clone());
		System.out.println(copia);
		//fin
		
		//Prueba hashCode
		System.out.println("---------------------------------------------------");
		System.out.println("hashCode:");
		System.out.println(t2.hashCode ());
		//Fin
		
		System.out.println("---------------------------------------------------");
		System.out.println("CargarArrayTablero");
		Baraja [][] tabla1=new Baraja[5][5];
		tabla1=t1.CargarArrayTablero();
		System.out.println(tabla1);
		
		System.out.println("---------------------------------------------------");
		System.out.println("Generar tablero");
		t1.GenerarTablero();

		//Prueba equals
		System.out.println("---------------------------------------------------");
		System.out.println("equals:");
		System.out.println(t2.equals (copia));
		System.out.println(t3.equals (copia));
		//Fin
		
		//Prueba compareTo
		System.out.println("---------------------------------------------------");
		System.out.println("compareTo:");
		System.out.println(t2.compareTo (t2));
		System.out.println(t3.compareTo (t3));
		System.out.println(copia.compareTo (t2));
		System.out.println(t3.compareTo (t2));
		System.out.println(t2.compareTo (t3));
		//Fin Prueba compareTo
		
		/*for(int i=0;i<tabla1.length;i++) 
		{
			for(int j=0;j<tabla1.length;j++) 
			{
				System.out.println(tabla1[i][j]);
			}
		}*/
		
		//MarcarCarta
		System.out.println("---------------------------------------------------");
		System.out.println("MarcarCarta:");
		System.out.println(t1.MarcarCarta(b));
		System.out.println("---------------------------------------------------");
		System.out.println("Generar tablero Marcado");
		t1.GenerarTablero();
	}
}
