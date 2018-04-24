package PokinoTest;

import PokinoClases.Baraja;
import PokinoClases.TipoPalo;

public class TestBaraja 
{
	public static void main(String[] args) 
	{
		Baraja b1= new Baraja();
		Baraja b2= new Baraja("3 ",TipoPalo.O);
		Baraja b3= new Baraja("7 ",TipoPalo.B);
		Baraja b4= new Baraja(b2);
		Baraja copia= null;
		
		System.out.println("Constructor por defecto: "+b1.toString());
		System.out.println("Constructor con parametros: "+b2.toString());
		System.out.println("Constructor de copia: "+b4.toString());
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(b4.getNaipe());
		//fin
		
		//prueba toString
		System.out.println("---------------------------------------------------");
		System.out.println("To string:");
		System.out.println(b3.toString());
		//fin
		
		//prueba clone
		System.out.println("---------------------------------------------------");
		System.out.println("Clone:");
		copia = b2.clone ();
		System.out.println(b2.clone());
		System.out.println(copia);
		//fin
		
		//Prueba hashCode
		System.out.println("---------------------------------------------------");
		System.out.println("hashCode:");
		System.out.println(b3.hashCode ());
		//Fin
		
		//Prueba equals
		System.out.println("---------------------------------------------------");
		System.out.println("equals:");
		System.out.println(b2.equals (copia));
		System.out.println(b3.equals (copia));
		//Fin
		
		//Prueba compareTo
		System.out.println("---------------------------------------------------");
		System.out.println("compareTo:");
		System.out.println(b2.compareTo (b2));
		System.out.println(b3.compareTo (b3));
		System.out.println(copia.compareTo (b2));
		System.out.println(b3.compareTo (b2));
		System.out.println(b2.compareTo (b3));
		//Fin Prueba compareTo
		
		b3.PintarCarta();
	}

}
