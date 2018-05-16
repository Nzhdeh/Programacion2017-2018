package Test;

import java.io.File;
import java.util.ArrayList;

import Clases.*;
import Gestoras.GestionIncidencia;
import Utilidades.Util;

public class TestGestionIncidencia 
{
	public static void main (String [] args) 
	{
		GestionIncidencia gi=new GestionIncidencia();
		
		
		Incidencia i1=new Incidencia("A ver si funciona");
		Incidencia i2=new Incidencia("Pues claro que si macho");
		Incidencia i3=new Incidencia("Ni idea");
		
		ArrayList<Incidencia> clienteDenuncia= new ArrayList<>();
		
//		System.out.println(gi.AvisarIncidencias(i1, clienteDenuncia));
//		
//		gi.ConsultarIncidencias(clienteDenuncia);
//		
//		gi.EliminarIncidencias(clienteDenuncia, 1);
		
		

	}
}
