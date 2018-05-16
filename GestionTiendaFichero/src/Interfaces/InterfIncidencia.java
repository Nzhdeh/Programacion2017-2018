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
 * metodos añadidos: LeerObjetoIncidencias();
 * 
 * */
package Interfaces;

import Clases.Incidencia;

public interface InterfIncidencia 
{
	public int getId();
	 
	public String getDescripcion();
	public void setDescripcion(String descripcion);
	 
//	public String getEstado();
//	public void setEstado(String estado);
	
	Incidencia LeerObjetoIncidencias();
}
