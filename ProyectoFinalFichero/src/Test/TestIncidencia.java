package Test;

import Clases.Incidencia;

public class TestIncidencia 
{
	public static void main(String[] args) 
	{
		Incidencia i1=new Incidencia("papa");
		Incidencia i2=new Incidencia("mama");
		Incidencia i3=new Incidencia();
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(i1.getId());		
		i1.setDescripcion("patata");
		System.out.println(i1.getDescripcion());
		System.out.println(i2.getDescripcion());
		//fin
		
		//prueba toString
		System.out.println("---------------------------------------------------");
		System.out.println("To string:");
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		//fin
		
		//Prueba hashCode
		System.out.println("---------------------------------------------------");
		System.out.println("hashCode:");
		System.out.println(i1.hashCode ());
		System.out.println(i2.hashCode ());
		//Fin
		
		//Prueba compareTo
		System.out.println("---------------------------------------------------");
		System.out.println("compareTo:");
		System.out.println(i1.compareTo (i1));
		System.out.println(i2.compareTo (i2));
		System.out.println(i1.compareTo (i2));
		System.out.println(i2.compareTo (i1));
		//Fin Prueba compareTo
		
		//LeerObjetoIncidencias
		System.out.println("---------------------------------------------------");
		System.out.println("LeerObjetoIncidencias:");
		System.out.println(i3.LeerObjetoIncidencias());
		
	}

}
