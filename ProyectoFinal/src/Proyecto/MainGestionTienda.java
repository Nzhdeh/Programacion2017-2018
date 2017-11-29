/**Nombre del programa: MainGestionTienda
 * 
 * analisis: Es un programa que gestiona una tienda. Segun las opciones que elija 
 * 			 el usuario podra contratar o despedir trabajadores avisar o consultar 
 * 			 incidencias, vender o devolver productos.
 * 
 * entradas: int opcion
 * salidas: double venta
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * 	inicio
 * 		presentar el menu y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 			segun(opcion)
 * 				caso 1:
 * 					hacer las funciones del jefe
 * 				caso 2:
 *					hacer las funciones del encargado 
 * 				caso 3:
 * 					hacer las funciones del trabajador
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
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						calcular ventas
 * 					caso 2:
 * 						contratar un trabajador
 * 					caso 3:
 *              	    despedir a un trabajador
 *             		caso 4:
 *              		consultar incidencias
 * 				fin_segun
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del encargado 
 * 
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						encargar productos nuevos
 * 					caso 2:
 * 						avisar sobre una incidencia
 * 				fin_segun	
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del trabajador
 * 
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						vender productos
 * 					caso 2:
 * 						hacer una devolucion
 * 				fin_segun
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 *  
 * 
 * Restricciones: de momento ninguna
 */


package Proyecto;

//import java.io.*;
import java.util.*;
public class MainGestionTienda {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		//variables
		int opcion=0,cantidadTrab=0;
		//char seguir=' ';
		double venta=0;
		int cont=0,exito=0;
		//int cantidad=0;
		String nombre=" ";
		//boolean existe=false;
		Fecha fecha=new Fecha();
		Fecha fechaIni=new Fecha();
		Fecha fechaFin=new Fecha();
		Fecha fechaVenta=new Fecha();
		Trabajador trabajador=new Trabajador();
		
		try
		{
			Producto [] producto={new Producto("Tarjeta de red",15.05,fecha,10,0.3),new Producto("Disco CD",1.20,fecha,10,0.1),new Producto("Cable HDMI",3.50,fecha,10,0.2)
								 ,new Producto("Placa base",100,fecha,10,0.7),new Producto("Disco duro SSD",80,fecha,10,0.1),new Producto("Procesador i5",180,fecha,10,0.2)
								 ,new Producto("Tarjeta de red",30,fecha,10,0.3),new Producto("Disco CD",1.20,fecha,10,0.1),new Producto("Cable DVI",1.50,fecha,10,0.2)
								 ,new Producto("Placa base",120,fecha,10,0.7),new Producto("Disco duro m.2",140,fecha,10,0.1),new Producto("Procesador i5",180,fecha,10,0.2)
								 ,new Producto("Fuente de alimentacion",60.50,fecha,10,1.0),new Producto("Disco duro m.2",140,fecha,10,0.1),new Producto("Procesador i3",180,fecha,10,0.2)
								 };
			
			//presentar el menu y leer y validar la opcion
			do
			{
				GestoraTienda.MenuPrincipal();
				opcion=sc.nextInt();
				if(opcion<0 || opcion>3) 
				{
					System.out.println("-----------------------------------------------");
					System.out.println("Opcion incorrecta, vuelve a intentarlo");
				}
			}while(opcion<0 || opcion>3);
			
			while(opcion!=0)
			{
				switch(opcion)
				{
					case 1:
						
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuJefe();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>4);
								
						while(opcion!=0)
						{
							switch(opcion)
							{
								case 1:
									//calcular ventas 
									venta=GestoraTienda.CalculaVenta(producto, fechaIni, fechaFin);
										
									break;
											
								case 2:
								//contratar un trabajador
									exito=GestoraTienda.ContrataTrabajador(trabajador);
									break;
											
								case 3:
									//despedir a un trabajador
									//exito=GestoraTienda.DespideTrabajador(tarbajador);
									break;
										
								case 4:
									//consultar incidencias
									GestoraTienda.ConsultaIncidencias();
									break;
							}
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuJefe();
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>4);
						}//fin mientras de submenu Jefe
							
						break;
						
					case 2:
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuEncargado();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>2);
								
						while(opcion!=0)
						{
							switch(opcion)
							{
								case 1:
									//encargar productos nuevos
									GestoraTienda.EncargaProductos();
									break;
											
								case 2:
									//avisar sobre una incidencia
									System.out.println("En construccion");
									break;
							}
	
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuEncargado();
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>2);
						}//fin mientras de submenu Encargado
					
						break;
						
					case 3:
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuTrabajador();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>2);
								
						while(opcion!=0)
						{
							switch(opcion)
							{
								case 1:
									//vender productos
									producto=GestoraTienda.VendeProducto(producto, nombre, fechaVenta);
									break;
											
								case 2:
									//hacer una devolucion
									GestoraTienda.DevuelveProducto(producto, nombre, fechaVenta);
									break;
							}
	
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuTrabajador();
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>2);
						}//fin mientras de submenu Trabajador
						
						break;
				}//fin_segun pricipal
				
				//volver a presentar el menu y leer y validar la opcion
				do
				{
					GestoraTienda.MenuPrincipal();
					opcion=sc.nextInt();
					if(opcion<0 || opcion>3) 
					{
						System.out.println("-----------------------------------------------");
						System.out.println("Opcion incorrecta, vuelve a intentarlo");
					}
				}while(opcion<0 || opcion>3);
				
			}//fin_mientras
		}
		catch(ExcepcionProducto error)
		{
			System.out.println("O what a pity");
		}
		sc.close();
	}//fin main
}//fin clase