package Test;

import Clases.Incidencia;
import java.io.*;
import Ficheros.*;
public class TestIncidencia 
{
	public static void main(String[] args) 
	{
		Incidencia i1=new Incidencia();
//		Incidencia i2=new Incidencia("ldjkfghlasjkdfgh");
		File txt = new File("src\\Ficheros\\Incidencia.txt");
		
//		System.out.println(i1.toString());
//		System.out.println(i2.toString());
		//i2.LeerObjetoIncidenciaParaBorrar();
		
		//i2.setEstado("*");
		i1.LeerObjetoIncidencias("src\\Ficheros\\incidencia.txt");		
	}
}
