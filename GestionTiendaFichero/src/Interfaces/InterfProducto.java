/**Nombre de la clase: Producto
 * 
 * propiedades basicas: 
 * 					Nombre: tipo String,consultable, modificable
 * 					precio: tipo double,consultable,modificable
 * 					cantidad: tipo String,consultable, modificable
 * 					peso: tipo double, consultable,modificable
 * 
 * Propiedades derivadas: No hay
 * 
 * INTERFAZ DE LA CLASE 
 * 
 * GETTERS Y SETTERS
 * 
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * public double getPrecio()
 * public void setPrecio(double precio) 
 * 
 * public String getCantidad()
 * public void setCantidad(int cantidad)
 * 
 * public double getPeso()
 * public void setPeso(double peso)
 * 
 * metodos añadidos: 
 * 
 * 		LeerValidarObjetoProducto()
 * 
 * restricciones:No hay
 * 
 */
package Interfaces;

import Clases.Producto;
import Excepciones.ExcepcionProducto;

public interface InterfProducto 
{
	public String getNombre();
	void setNombre(String nombre) throws ExcepcionProducto;
	 
	static double getPrecio() 
	{
		double precio=0.0;
		return precio;
	}
	void setPrecio(double precio) throws ExcepcionProducto; 
	
	static int getCantidad() 
	{
		int cantidad=0;
		return cantidad;
	}
	void setCantidad(int cantidad) throws ExcepcionProducto;
	 
	double getPeso();
	void setPeso(double peso) throws ExcepcionProducto;
	
	Producto LeerValidarObjetoProducto();
}
