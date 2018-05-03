/**Nombre del programa: MainGestionTienda
 * 
 * analisis: Es un programa que gestiona una tienda. Segun las opciones que elija 
 * 			 el usuario podra contratar o despedir trabajadores avisar o consultar 
 * 			 incidencias, vender o devolver productos,generar nomina, etc.
 * 
 * entradas: la opcion de los menus,objeto Fecha,objeto Trabajador,objeto empresa,objeto incidencia,cadena dni,entero id
 * salidas: se pintara por pantalla los resultados y algunos mensajes de apollo
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * 	inicio
 * 		presentar el menuPrincipal y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 			segun(opcion)
 * 				caso 1:
 * 					hacer las funciones del jefe
 * 				caso 2:
 * 					si hay trabajadores contratados
 * 						comprobar si el encargado existe(*)
 * 						si existe
 *							hacer las funciones del encargado 
 *						fin_si
 *						sino
 *							pintar mensaje
 *						fin_sino
 *					fin_si_contratado
 * 				caso 3:
 * 					si hay trabajadores contratados
 * 						comprobar si el trabajador existe(*)
 * 						si existe
 *							hacer las funciones del trabajador 
 *						fin_si
 *						sino
 *							pintar mensaje
 *						fin_sino
 *					fin_si_contratado
 * 			fin_segun
 * 		volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 	fin_pp
 * 
 * 
 * MODULOS
 * 
 * 	//hacer las funciones del jefe
 * 		
 * 		presentar el menuJefe y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						calcular ventas
 * 					caso 2:
 * 						contratar un trabajador
 * 					caso 3:
 *              	    despedir a un trabajador
 *              	caso 4:
 *              		ConsultarTrabajadorContratado (*)
 *             		caso 5:
 *              		ConsultarIncidencias (*)
 *             	 	caso 6:
 *              		generar nomina
 * 				fin_segun
 * 			volver a presentar el menuJefe y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//calcular ventas
 * 		inicio
 * 			si(arrayVendido!=null)
 * 				LeerValidarFecha (*)	//fecha de inicio
 * 				LeerValidarFecha (*)	//fecha final
 * 
 * 				si(fechaIni>fechaFin)
 * 					pintar mensaje
 * 				fin_si
 * 				sino
 * 					CalcularVentas (*)
 * 					mostrar el resultado
 * 				fin_sino
 * 			fin_si_vendido
 * 		fin calcular
 * 
 * 	//contratar un trabajador
 * 		inicio
 * 			leerValidarObjetoTrabajador (*)
 * 			ContratarTrabajador(*)
 * 		fin_contratar
 * 
 * 	//despedir a un trabajador
 * 		inicio
 * 			leer el dni del trabajador
 * 			ExisteTrabajador (*)
 * 			si(existe)
 * 				DespedirTrabajador(*)
 * 			fin_si
 * 		fin_despedir
 * 
 * 	//generara nomina
 * 	inicio
 * 		si(hay trabajadores contratados)
 * 			LeerValidarObjetoNomina (*)
 * 			generarNomina (*)
 * 		fin_si
 * 	fin_generar
 * 
 * 
 * 
 * 
 * 	//hacer las funciones del encargado 
 * 
 * 		presentar el menuEncargado y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						encargar productos nuevos
 * 					caso 2:
 * 						avisar sobre una incidencia
 *					caso 3:
 * 						consultar productos en la tienda (*)
 * 					caso 4:
 * 						if(denuncia[i]!=null)
 * 							eliminar incidencias
 * 						fin_si
 * 				fin_segun	
 * 			volver a presentar el menuEncargado y leer y validar la opcion
 * 		fin_mientras
 * 
 * 
 * 	//encargar productos nuevos
 * 		inicio
 * 			LeerValidarObjetoProducto (*)
 * 			EncargarProductos (*)
 * 		fin_encargar
 * 
 * 	//avisar sobre una incidencia
 * 		inicio
 * 			LeerObjetoIncidencia (*)
 * 			AvisarIncidencias
 * 		fin_avisar
 * 
 * 
 * 	//eliminar incidencias
 * 		inicio
 * 			ConsultarIncidencias (*)
 * 			leer y validar la id de la incidencia
 * 			EliminarIncidencia(*)
 * 		fin_eliminar	
 * 
 * 
 * 	//hacer las funciones del trabajador
 * 
 * 		presentar el menuTrabajador y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						vender productos
 * 					caso 2:
 * 						hacer una devolucion
 * 				fin_segun
 * 			volver a presentar el menuTrabajador y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//vender productos
 * 		inicio
 * 			PintarProductos (*)
 * 			LeerValidarProductoParaVender (*)
 * 			ExisteProducto (*)
 * 			si(existe y la cantidad es superior o igual a la que vendemos)
 * 				VenderProducto (*)
 * 			fin_si
 * 		fin_vender
 *  
 *  //hacer una devolucion
 *  	inicio
 *  		PintarProductos (*)
 *  		LeerValidarProductoParaDevolucion (*)
 * 			ExisteProducto (*)
 * 			si(existe)
 * 				DevolverProducto (*)
 * 			fin_si
 *  	fin_devolver
 * 
 * Restricciones: no se puede meter caracteres en los datos numericos
 * 				  la opcion del menu principal esta entre 1 y 3 inclusive
 * 				  la opcion del MenuJefe esta entre 1 y 6 inclusive
 * 				  la opcion del MenuEncargado esta entre 1 y 4 inclusive
 * 				  la opcion del MenuTrabajador esta entre 1 y 2 inclusive
 * 				  el cargo tiene que ser ENCARGADO o VENDEDOR
 * 				  el dni/nie del trabajador es unico
 * 				  la id de la incidencia es autogenerada
 */


package Main;

import java.util.*;

import Clases.*;
import Excepciones.ExcepcionProducto;
import Gestoras.*;

public class MainGestionTienda 
{
	public static void main(String[] args) 
	{
		
	}//fin main
}//fin clase
