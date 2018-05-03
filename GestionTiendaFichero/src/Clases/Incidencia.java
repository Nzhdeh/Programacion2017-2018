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

public class Incidencia implements Serializable, Comparable <Incidencia>
{
	private final int id;
	private String descripcion;
	private String estado;
	
	//compartida
	private static int contadorID = 0;
	
	
	//constructores
	//por defecto
	public Incidencia() 
	{
		contadorID=0;
		id=contadorID;
		descripcion=" ";
		estado="activo";
	}
	
	//con parametros
	public Incidencia(String descripcion) 
	{
		contadorID++;
		id=contadorID;
		this.descripcion=descripcion;
		this.estado="activo";
	}
	
	//de copia
	public Incidencia(Incidencia incidencia) 
	{
		this.id=incidencia.getId();
		this.descripcion=incidencia.getDescripcion();
		this.estado=incidencia.getEstado();
	}
	
	//getters y setters

	public String getDescripcion() 
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	public int getId() 
	{
		return id;
	}
	
	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}

	public String toString() 
	{
		return (id+"-"+descripcion+", "+estado);
	}
	
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
	
	public void LeerObjetoIncidencias(String ficheroTxt) 
	{
		Scanner sc=new Scanner(System.in);
		Incidencia i=null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//sc.nextLine();//para limpiar el buffer
		
		//leer el motivo de la incidencia
		System.out.println("Redacta el motivo de la Incidencia: ");
		setDescripcion(sc.nextLine().toUpperCase());
		
		i=new Incidencia(getDescripcion());
		
		try 
		{
			fos = new FileOutputStream(ficheroTxt, true);
			oos = new ObjectOutputStream(fos);
		
			oos.writeObject(i.toString());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (oos != null) 
				{
					oos.close();
				}				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		//return i;
	}
	
	/****************************************************************/
	
	public void LeerObjetoIncidenciaParaBorrar() 
	{
		//Anexar fichero
		File ftexto = new File("src\\ejercicioHospital\\Incidencias.txt");
		
		FileOutputStream textoFOS =null;
		ObjectOutputStream textoOOS =null;
		try 
		{
			//Crear fichero
			ftexto.createNewFile();			
			//Abrir fichero para escribir
			textoFOS = new FileOutputStream(ftexto);	
			textoOOS = new ObjectOutputStream(textoFOS);
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally{
			if (textoOOS!=null) 
			{
				try 
				{
					//Cerrar fichero
					textoOOS.close();
				} catch (IOException e) 
				{
					
					e.printStackTrace();
				}
			}			
		}
	}
}
