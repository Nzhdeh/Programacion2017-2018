/** Nombre de la clase: Incidencia
 * 
 * propiedades basicas:
 * 
 * 				id: tipo int,consultable//se generara secuencialmente
 * 				descripcion: tipo String, consultable,modificable
 * 
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
 * metodos añadidos: no hay
 * 
 * */
package Proyecto;

public class Incidencia implements Comparable <Incidencia>
{
	private final int id;
	private String descripcion;
	
	//compartida
	private static int contadorID = 0;
	
	
	//constructores
	//por defecto
	public Incidencia() 
	{
		contadorID++;
		id=contadorID;
		String descripcion="";
	}
	
	//con parametros
	public Incidencia(String descripcion) 
	{
		contadorID++;
		id=contadorID;
		this.descripcion=descripcion;
	}
	
	//de copia
	public Incidencia(Incidencia incidencia) 
	{
		this.id=incidencia.getId();
		this.descripcion=incidencia.getDescripcion();
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
	
	public String toString() 
	{
		return (id+"-"+descripcion);
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
	
}
