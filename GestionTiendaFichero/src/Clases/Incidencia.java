/** Nombre de la clase: Incidencia
 * 
 * propiedades basicas:
 * 
 * 				id: tipo int,consultable//se generara secuencialmente
 * 				descripcion: tipo String, consultable,modificable
 * 				estado: tipo String, consultable,modificable 
 * 
 * 
 * propiedades derivadas: no hay
 * 
 * propiedades compartidas 
 * 
 * 				contadorID: tipo int  //se genera secuencialmente
 * 
 * restricciones: no hay
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 * public int getId()
 * 
 * public String getDescripcion()
 * public void setDescripcion(String descripcion)
 * 
 * public String getEstado()
 * public void setEstado(String estado)
 * 
 * metodos añadidos: LeerObjetoIncidencias()
 * 
 * */
package Clases;

import java.io.*;
import java.util.Scanner;
import Interfaces.InterfIncidencia;

public class Incidencia implements InterfIncidencia, Serializable, Comparable <Incidencia>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int id;
	private String descripcion;
	//private String estado;
	
	//compartida
	private static int contadorID = 0;
	
	
	//constructores
	//por defecto
	public Incidencia() 
	{
		contadorID=0;
		id=contadorID;
		descripcion=" ";
		//estado="activo";
	}
	
	//con parametros
	public Incidencia(String descripcion) 
	{
		contadorID++;
		id=contadorID;
		this.descripcion=descripcion;
		//this.estado="activo";
	}
	
	//de copia
	public Incidencia(Incidencia incidencia) 
	{
		this.id=incidencia.getId();
		this.descripcion=incidencia.getDescripcion();
		//this.estado=incidencia.getEstado();
	}
	
	//getters y setters
	@Override
	public String getDescripcion() 
	{
		return descripcion;
	}
	@Override
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}
	@Override
	public int getId() 
	{
		return id;
	}
//	@Override
//	public String getEstado() 
//	{
//		return estado;
//	}
//	@Override
//	public void setEstado(String estado) 
//	{
//		this.estado = estado;
//	}
//	@Override
//	public String toString() 
//	{
//		return (id+"-"+descripcion+", "+estado);
//	}
	
	public int hashCode() 
	{
		return (int)(id*descripcion.hashCode());
	}
	
	
	public int compareTo(Incidencia i) 
	{
		int comparar;
		
		if(this.getId()>i.getId()) 
		{
			comparar=1;
		}else if(this.getId()<i.getId()) 
		{
			comparar=(-1);
		}else 
		{
			comparar=0;
		}
		
		return comparar;
	}
	
	
	/**
	prototipo: public Incidencia LeerObjetoIncidencias()  
	comentarios: este metodo sirve para leer y validar el objeto incidencia
	precondiciones: no hay
	entradas: no hay
	salidas: un objeto
	entr/sal: no hay
	postcondiciones: AN devolvera el objeto incidencia
	*/
	
	//resguardo
	/*
	 public Incidencia LeerObjetoIncidencias() 
	{
		Incidencia i=null;
		System.out.println("En construccion");
		return i;
	}*/
	
	@Override
	public Incidencia LeerObjetoIncidencias() 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		Incidencia i=null;
		
		//leer el motivo de la incidencia
		try 
		{
			System.out.println("Redacta el motivo de la Incidencia: ");
			setDescripcion(br.readLine().toUpperCase());
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		i=new Incidencia(getDescripcion());
		
		return i;
	}
}
