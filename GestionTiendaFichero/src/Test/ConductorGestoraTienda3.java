package Test;

import Clases.*;
import Excepciones.*;
import Gestoras.GestoraTienda3;

public class ConductorGestoraTienda3 
{
	public static void main (String [] args) 
	{
		Incidencia i1 = new Incidencia("sdfffffffffadgry");
		GestoraTienda3 gt=new GestoraTienda3();
		
		gt.CrearFicheroIncidencia();
	}
}
