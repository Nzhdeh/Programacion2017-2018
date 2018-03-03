/**Nombre del programa: MainGestionTienda
 * 
 * analisis: Es un programa que gestiona las ventas de una red de tiendas
 * 
 * entradas: int opcion, char seguir,
 * salidas:
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
 * 		mientras(opcion!=0)
 * 		preguntar si realmente quiere seguir y leer y validar seguir
 * 			mientras(seguir=='S')
 * 				segun(opcion)
 * 					caso 1:
 * 						gestion de la tienda 1
 * 					caso 2:
 * 						gestion de la tienda 2
 * 					caso 3:
 * 						gestion de la tienda 3
 * 					caso 4:
 * 						contratar un trabajador
 * 					caso 5:
 *              	    despedir a un trabajador
 *             		 caso 6:
 *              		consultar incidencias
 * 				fin_segun
 * 				volver a preguntar si realmente quiere seguir y leer y validar seguir
 * 			fin_mientras	
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del encargado 
 * 
 * 		presentar el menu y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 		preguntar si realmente quiere seguir y leer y validar seguir
 * 			mientras(seguir=='S')
 * 				segun(opcion)
 * 					caso 1:
 * 						gestion de la tienda 1
 * 					caso 2:
 * 						gestion de la tienda 2
 * 					caso 3:
 * 						gestion de la tienda 3
 * 					caso 4:
 * 						avisar sobre una incidencia
 * 				fin_segun
 * 				volver a preguntar si realmente quiere seguir y leer y validar seguir
 * 			fin_mientras	
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del trabajador
 * 
 * 		presentar el menu y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 		preguntar si realmente quiere seguir y leer y validar seguir
 * 			mientras(seguir=='S')
 * 				segun(opcion)
 * 					caso 1:
 * 						gestion de la tienda 1
 * 					caso 2:
 * 						gestion de la tienda 2
 * 					caso 3:
 * 						gestion de la tienda 3
 * 				fin_segun
 * 				volver a preguntar si realmente quiere seguir y leer y validar seguir
 * 			fin_mientras	
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 *  
 * 
 * Restricciones:
 */


package Proyecto;

//import java.io.*;
import java.util.*;
public class MainGestionTienda {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		//variables
		int opcion=0;
		char seguir=' ';
		Fecha fecha=new Fecha();
		
		try
		{
			Producto [] producto={new Producto("Tarjeta de red",15.05,fecha,"Muy util",0.3),new Producto("Disco CD",1.20,fecha,"No funciona",0.1),new Producto("Cable HDMI",3.50,fecha,"Es bonito",0.2)
								 ,new Producto("Placa base",120,fecha,"Es impresionante",0.7),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 ,new Producto("Tarjeta de red",15.05,fecha,"Muy util",0.3),new Producto("Disco CD",1.20,fecha,"No funciona",0.1),new Producto("Cable HDMI",3.50,fecha,"Es bonito",0.2)
								 ,new Producto("Placa base",120,fecha,"Es impresionante",0.7),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 ,new Producto("Fuente de alimentacion",60.5,fecha,"No te lo recomiendo",1.0),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 };
			
			//presentar el menu y leer y validar la opcion
			do
			{
				GestoraTienda.MenuPrincipal();
				opcion=sc.nextInt();
			}while(opcion<0 || opcion>3);
			
			while(opcion!=0)
			{
				switch(opcion)
				{
					case 1:
						
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuJefe(opcion);
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>6);
						
						//GestoraTienda.MenuTiendas(opcion);
								
						while(opcion!=0)
						{
							 //preguntar si realmente quiere seguir y leer y validar seguir
							do
							{
								GestoraTienda.PreguntarSeguir(opcion);
								//System.out.println("-----------------------------------------------");
								//System.out.print("Realmente quieres seguir? s/n: ");
								seguir=Character.toUpperCase(sc.next().charAt(0));
							}while(seguir!='S' && seguir!='N');
								
							//GestoraTienda.PreguntarSeguir(opcion);
							
							while(seguir=='S')
							{
								switch(opcion)
								{
									case 1:
											System.out.println("En construccion");
											
										break;
											
									case 2:
										System.out.println("En construccion");
										break;
											
									case 3:
										System.out.println("En construccion");
										break;
										
									case 4:
										System.out.println("En construccion");
										break;
										
									case 5:
										System.out.println("En construccion");
										break;
									case 6:
										System.out.println("En construccion");
										break;
								}
								 //volver a preguntar si realmente quiere seguir y leer y validar seguir
								do
								{
									GestoraTienda.PreguntarSeguir(opcion);
									seguir=Character.toUpperCase(sc.next().charAt(0));
								}while(seguir!='S' && seguir!='N');
							}
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuJefe(opcion);
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>6);
							//GestoraTienda.MenuTiendas(opcion);
						}
							
						break;
						
					case 2:
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuEncargado(opcion);
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>4);
						
						//GestoraTienda.MenuTiendas(opcion);
								
						while(opcion!=0)
						{
							//preguntar si realmente quiere seguir y leer y validar seguir
							do
							{
								GestoraTienda.PreguntarSeguir(opcion);
								seguir=Character.toUpperCase(sc.next().charAt(0));
							}while(seguir!='S' && seguir!='N');
								
							while(seguir=='S')
							{
								switch(opcion)
								{
									case 1:
										System.out.println("En construccion");
										break;
											
									case 2:
										System.out.println("En construccion");
										break;
											
									case 3:
										System.out.println("En construccion");
										break;
										
									case 4:
										System.out.println("En construccion");
										break;
								}
								
								//volver a preguntar si realmente quiere seguir y leer y validar seguir
								do
								{
									GestoraTienda.PreguntarSeguir(opcion);
									seguir=Character.toUpperCase(sc.next().charAt(0));
								}while(seguir!='S' && seguir!='N');
							}
	
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuEncargado(opcion);
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>4);
							
							//GestoraTienda.MenuTiendas(opcion);
						}
					
						break;
						
					case 3:
						//presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuTrabajador(opcion);
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>3);
						
						//GestoraTienda.MenuTiendas(opcion);
								
						while(opcion!=0)
						{
							//preguntar si realmente quiere seguir y leer y validar seguir
							do
							{
								GestoraTienda.PreguntarSeguir(opcion);
								seguir=Character.toUpperCase(sc.next().charAt(0));
							}while(seguir!='S' && seguir!='N');
								
							while(seguir=='S')
							{
								switch(opcion)
								{
									case 1:
										System.out.println("En construccion");
										break;
											
									case 2:
										System.out.println("En construccion");
										break;
											
									case 3:
										System.out.println("En construccion");
										break;
								}
								
								//volver a preguntar si realmente quiere seguir y leer y validar seguir
								do
								{
									GestoraTienda.PreguntarSeguir(opcion);
									seguir=Character.toUpperCase(sc.next().charAt(0));
								}while(seguir!='S' && seguir!='N');
							}
	
							//volver a presentar el menu y leer y validar la opcion
							do
							{
								GestoraTienda.MenuTrabajador(opcion);
								opcion=sc.nextInt();
							}while(opcion<0 || opcion>3);
							
							//GestoraTienda.MenuTiendas(opcion);
						}
						
						break;
				}//fin_segun
				
				//volver a presentar el menu y leer y validar la opcion
				
				do
				{
					GestoraTienda.MenuPrincipal();
					opcion=sc.nextInt();
				}while(opcion<0 || opcion>3);
			}//fin_mientras
		}catch(ExcepcionProducto error)
		{
			System.out.println("O what a pity");
		}
		sc.close();
	}
}
