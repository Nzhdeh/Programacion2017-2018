/** Nombre de la calse: Fecha
 * 
 * 	propiedades basicas
 * 		
 * 		dia: tipo int, consultable, modificable
 * 		mes: tipo int, consultable, modificable
 * 		anio: tipo int, consultable, modificable
 * 
 * 	Propiedades derivadas: no hay
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 *  public int getDia()
 *  public void setDia(int dia)
 *  
 *  public int getMes()
 *  public void setDia(int mes)
 *  
 *  public int getAnio()
 *  public void setAnio(int anio)
 * 
 * 
 * metodos añadidos: 
 * 
 * 			ValidarFecha()
 * 			leerValidarFecha()
 * 
 * restricciones: dia (minimo 1 y maximo 28,29,30,31 dependiendo del mes)
 * 				  mes (entre 1 y 12 ambos inclusive)
 * 				  anio>0
 * 				  
 * 				  para el metodo Bisiesto el anio tiene que ser mayor o igual que 1582
 */
package Interfaces;

import Clases.Fecha;
import Excepciones.ExcepcionFecha;

public interface InterfFecha 
{
	int getDia();
	void setDia(int dia) throws ExcepcionFecha;
	
	int getMes();
	void setMes(int mes) throws ExcepcionFecha;
	
	int getAnio();
	void setAnio(int anio) throws ExcepcionFecha;
	
	boolean ValidarFecha();
	Fecha LeerValidarFecha();
}
