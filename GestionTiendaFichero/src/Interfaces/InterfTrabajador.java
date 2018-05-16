/**Nombre de la clase: Trabajador
 * 
 * propiedades basicas:
 * 						nombre: tipo String,consultable, modificable
 * 						apellidos:tipo String,consultable, modificable
 * 						dni: tipo String,consultable, modificable
 * 						sexo: tipo char,consultable,modificable
 * 						CARGO: tipo TipoCargo,consultable,modificable
 * 
 * propiedades derivadas:no hay
 * 
 * propiedades compartidas: no hay
 * 
 * restricciones: El nombre, el apellido y el dni no pueden ser nulos
 * 				  El sexo tiene que ser 'V' o 'M' o 'v' o 'm'
 * 
 * INTERFAZ DE LA CLASE
 * 
 * GETTERS Y SETTERS
 * 
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * public String getApellidos()
 * public void setApellidos(String apellidos)
 * 
 * public String getDni()
 * public void setDni(String dni)
 * 
 * public char getSexo()
 * public void setSexo(char sexo)
 * 
 * public TipoCargo getCARGO()
 * void setCARGO(TipoCargo CARGO)
 * 
 * 
 */
package Interfaces;

import Clases.TipoCargo;
import Clases.Trabajador;
import Excepciones.ExcepcionTrabajador;

public interface InterfTrabajador 
{
	String getNombre();
	void setNombre(String nombre) throws ExcepcionTrabajador;
	 
	String getApellidos();
	void setApellidos(String apellidos) throws ExcepcionTrabajador;
	
	String getDni();
	void setDni(String dni) throws ExcepcionTrabajador;
	 
	char getSexo();
	void setSexo(char sexo) throws ExcepcionTrabajador;
	  
	TipoCargo getCARGO();
	void setCARGO(TipoCargo CARGO);
	
	Trabajador leerValidarObjetoTrabajador();
	
}
