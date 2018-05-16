package Test;

import java.io.File;
import java.util.ArrayList;

import Clases.Fecha;
import Clases.Producto;
import Utilidades.Util;

public class TestClaseUtil 
{

	public static void main(String[] args) 
	{
		Util u=new Util();
		
		File rutaFichero=new File("src\\Ficheros\\productoComprado.dat");
		
		Fecha fecha1=new Fecha(15,2,1998);
		
		Producto p1=new Producto("DVD",1.2,fecha1,10,0.1);
		Producto p2=new Producto("PENDRIVE",5.99,fecha1,3,0.200);
		
		ArrayList<Producto> al=new ArrayList<>();
		
		al.add(p1);
		al.add(p2);
		
		
		//u.EscribirEnFichero(p1, rutaFichero);
		
		//u.BurbujaList(al);
	}

}
